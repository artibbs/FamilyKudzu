package io.github.artibbs.familykudzu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import io.github.artibbs.familykudzu.models.Relationship;

public class RelationshipAdapter extends RecyclerView.Adapter<RelationshipAdapter.RelationshipViewHolder> {

    private List<Relationship> relationshipList;

    public RelationshipAdapter() {
        relationshipList = Collections.emptyList();
    }

    @NonNull
    @Override
    public RelationshipViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_relationship, parent, false);
        return new RelationshipViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RelationshipViewHolder holder, int position) {
        Relationship relationship = relationshipList.get(position);
        holder.bind(relationship);
    }

    @Override
    public int getItemCount() {
        return relationshipList.size();
    }

    public void replaceRelationships(List<Relationship> newList) {
        relationshipList = newList;
        notifyDataSetChanged();
    }

    public static class RelationshipViewHolder extends RecyclerView.ViewHolder {

        private ImageView profileImage;
        private TextView nameTextView;
        private TextView relationshipTextView;

        public RelationshipViewHolder(@NonNull View itemView) {
            super(itemView);
            profileImage = itemView.findViewById(R.id.profileImage);
            nameTextView = itemView.findViewById(R.id.nameTextView);
            relationshipTextView = itemView.findViewById(R.id.relationshipTextView);
        }

        public void bind(Relationship relationship) {
            // TODO: bind profile image
            nameTextView.setText(relationship.getSecondary().getFullName());
            relationshipTextView.setText(relationship.getRelation());
        }
    }

}
