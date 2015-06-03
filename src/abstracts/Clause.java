package abstracts;

import interfaces.XmlElement;

/**
 * Created by Rathinakumar on 6/1/2015.
 */
public abstract class Clause implements XmlElement{
    protected String description;
    public Clause()
    {

    }
    public Clause( String description )
    {
        this.description = description;
    }
    public String getDescription()
    {
        return description;
    }

    public abstract String getName();

    public void setDescription( String description )
    {
        this.description = description;
    }



}
