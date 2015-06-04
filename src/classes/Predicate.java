package classes;

import abstracts.Fact;

/**
 * Created by Rathinakumar on 6/4/2015.
 */
public class Predicate extends Fact {

    private String value;

    public Predicate(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
