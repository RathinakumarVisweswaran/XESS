package abstracts;

/**
 * Created by Rathinakumar on 6/1/2015.
 */
public abstract class SimpleClause extends Clause {

    protected String value1, value2;
    public String getValue1()
    {
        return value1;
    }

    public String getValue2()
    {
        return value2;
    }

    public void setValue1( String v )
    {
        this.value1 = v;
    }

    public void setValue2( String v )
    {
        this.value2 = v;
    }

    public String toXml()
    {
        return "< "+getName()+" value1="+getValue1()+" value2="+getValue1()+"/>";
    }

}
