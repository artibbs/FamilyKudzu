package io.github.artibbs.familykudzu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageView profileImageView;
    private TextView profileName;
    private RecyclerView relationshipRecyclerView;
    private RelationshipAdapter relationshipAdapter;

    private FamilyManager familyManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        familyManager = new FamilyManager();

        profileImageView = findViewById(R.id.profileImageView);
        profileName = findViewById(R.id.profileName);
        relationshipRecyclerView = findViewById(R.id.relationshipRecyclerView);

        relationshipRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        relationshipAdapter = new RelationshipAdapter();
        relationshipRecyclerView.setAdapter(relationshipAdapter);

        Drawable myIcon = getResources().getDrawable( R.drawable.default_profile_image );
        profileImageView.setImageDrawable(myIcon);

        profileName.setText(familyManager.getMainUser().getFullName());
        relationshipAdapter.replaceRelationships(familyManager.getRelatives());
    }
}
