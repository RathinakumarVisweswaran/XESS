package abstracts;

import interfaces.XmlElement;

/**
 * Created by Rathinakumar on 6/4/2015.
 */
public abstract class Fact implements XmlElement {

    protected String name;

    public Fact() {

    }

    public Fact(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toXml() {
        return null;
    }
}
