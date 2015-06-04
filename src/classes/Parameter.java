package classes;

import interfaces.XmlElement;

/**
 * Created by Rathinakumar on 6/3/2015.
 */
public class Parameter implements XmlElement {

    private String name, type;

    public Parameter() {

    }

    public Parameter(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toXml() {
        return "<parameter name=" + getName() + " type=" + getType() + "/>";
    }
}
