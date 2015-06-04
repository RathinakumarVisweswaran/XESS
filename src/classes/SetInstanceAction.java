package classes;

import interfaces.Action;

/**
 * Created by Rathinakumar on 6/3/2015.
 */
public class SetInstanceAction implements Action {

    private Instance instance;

    public SetInstanceAction() {

    }

    public SetInstanceAction(String name, String type) {

    }

    public void addField(Field field) {

    }

    public Field getField(String name) {

    }

    public void removeField(String name) {

    }

    public Field[] getFields() {

    }

    public void clearFields() {

    }

    public void setName(String name) {

    }

    public String getName()

    {

    }

    public void setType(String type) {

    }

    public String getType() {

    }

    @Override
    public String toXml() {

        StringBuffer xml = new StringBuffer();
        xml.append("<setInstance name=”{name}” type=”{type}”>\n");

        for (Field f : fields) {
            xml.append("<field name=”{name}” type=”{type}”\n" +
                    "value=”{value}”/>");
        }
        xml.append("</setInstance>");
        return xml.toString();
    }

}
