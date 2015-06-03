package classes;

import abstracts.Clause;

/**
 * Created by Rathinakumar on 6/2/2015.
 */
public class Between extends Clause {
    @Override
    public String getName() {
        return "between";
    }

    @Override
    public String toXml() {
        return null;
    }
}
