package classes;

import abstracts.Clause;

/**
 * Created by Rathinakumar on 6/2/2015.
 */
public class NotBetween extends Between {
    @Override
    public String getName() {
        return "notBetween";
    }

    @Override
    public String toXml() {
        return null;
    }
}