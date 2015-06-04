package classes;

import interfaces.XmlElement;

/**
 * Created by Rathinakumar on 6/4/2015.
 */
public class Field implements XmlElement {

    private String name, value, type;

    public Field() {
    }

    public Field(String name, String type, String value) {
        this.name = name;
        this.value = value;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toXml() {
        return null;
    }
}
