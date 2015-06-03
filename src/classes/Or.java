package classes;

import abstracts.Clause;
import abstracts.ClauseList;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Rathinakumar on 6/2/2015.
 */
public class Or extends ClauseList {

    public Or( Clause[] clauses )
    {
        this.clauses.addAll(Arrays.asList(clauses));
    }

    public Or( String desc, Clause[] clauses )
    {
        this.clauses.addAll(Arrays.asList(clauses));
        this.description = desc;
    }

    @Override
    public String getName() {
        return "or";
    }
}