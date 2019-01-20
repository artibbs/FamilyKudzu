package io.github.artibbs.familykudzu;

import java.util.Arrays;
import java.util.List;

import io.github.artibbs.familykudzu.models.Person;
import io.github.artibbs.familykudzu.models.Relationship;

public class FamilyManager {

    private Person mainUser;

    public FamilyManager() {
        mainUser = new Person("Asia", "Tibbitts");
    }

    public Person getMainUser() {
        return mainUser;
    }

    public List<Relationship> getRelatives() {
        return Arrays.asList(
                new Relationship(mainUser, new Person("Zach", "Tibbitts"), "Spouse"),
                new Relationship(mainUser, new Person("Teddy", "Tibbitts"), "Child")
        );
    }
}
