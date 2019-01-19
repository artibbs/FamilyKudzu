package io.github.artibbs.familykudzu;

public class Relationship {
    private Person primary;
    private Person secondary;
    private String relation;

    public Relationship(Person primary, Person secondary, String relation) {
        this.primary = primary;
        this.secondary = secondary;
        this.relation = relation;
    }

    public Person getPrimary() {
        return primary;
    }

    public Person getSecondary() {
        return secondary;
    }

    public String getRelation() {
        return relation;
    }
}
