package abstracts;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rathinakumar on 6/1/2015.
 */
public abstract class ClauseList extends Clause{
    protected List<Clause> clauses = new ArrayList<Clause>();
    public void addClause( Clause c )
    {
        clauses.add(c);
    }

    public Clause[] getClauses()
    {
        return (Clause[]) clauses.toArray();
    }

    public void removeClause( Clause c )
    {
        clauses.remove(c);
    }

    public String toXml()
    {
        StringBuffer xml = new StringBuffer();
        xml.append("<"+getName()+" description="+getDescription()+">\n");

        for (Clause c : clauses)
            xml.append(c.toXml()+" ");
        xml.append("\n </"+getName()+">");

        return xml.toString();
    }

}
