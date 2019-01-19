package io.github.artibbs.familykudzu;

import java.util.Arrays;
import java.util.List;

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
