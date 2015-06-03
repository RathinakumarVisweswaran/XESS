package classes;

import abstracts.SimpleClause;

/**
 * Created by Rathinakumar on 6/2/2015.
 */
public class LessThanOrEqual extends SimpleClause {

    public LessThanOrEqual( String v1, String v2 )
    {
        this.value1 = v1;
        this.value2 = v2;
    }

    public LessThanOrEqual( String d, String v1, String v2 )
    {
        this.description = d;
        this.value1 = v1;
        this.value2 = v2;
    }

    @Override
    public String getName() {
        return "lessThanOrEqual";
    }
}

