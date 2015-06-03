package classes;

import abstracts.Clause;
import abstracts.ClauseList;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Rathinakumar on 6/2/2015.
 */
public class And extends ClauseList {

    public And( Clause[] clauses )
    {
        this.clauses.addAll(Arrays.asList(clauses));
    }

    public And( String desc, Clause[] clauses )
    {
        this.clauses.addAll(Arrays.asList(clauses));
        this.description = desc;
    }

    @Override
    public String getName() {
        return "and";
    }
}
