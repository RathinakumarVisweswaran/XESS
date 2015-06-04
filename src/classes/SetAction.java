package classes;

import interfaces.Action;

/**
 * Created by Rathinakumar on 6/2/2015.
 */
public class SetAction implements Action{

    private String name, value;

    public SetAction( String name, String value )
    {
        setName(name);
        setValue(value);
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toXml() {
        return "<set name=" + getName() + " value=" + getValue() + "/>";
    }
}
