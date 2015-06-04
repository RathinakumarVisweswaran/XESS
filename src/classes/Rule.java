package classes;

import abstracts.Clause;
import interfaces.Action;
import interfaces.XmlElement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Rathinakumar on 6/3/2015.
 */
public class Rule implements XmlElement {

    private String name;
    private Map<String, Parameter> parameters;
    private Clause ifClause;
    private List<Action> thenActions = new ArrayList<Action>();
    private List<Action> elseActions = new ArrayList<Action>();

    public Rule() {

    }

    public Rule(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addParameter(Parameter parameter) {
        if (parameters == null)
            parameters = new HashMap<String, Parameter>();
        parameters.put(parameter.getName(), parameter);
    }

    public Parameter getParameter(String name) {
        if (parameters != null && parameters.containsKey(name))
            return parameters.get(name);
        return null;
    }

    public void removeParameter(String name) {
        if (parameters != null && parameters.containsKey(name))
            parameters.remove(name);
    }

    public Parameter[] getParameters() {
        if (parameters != null && parameters.size() > 0)
            return (Parameter[]) parameters.values().toArray();
        return null;
    }

    public void clearParameters() {
        parameters.clear();
    }

    public void setIfClause(Clause clause) {
        ifClause = clause;
    }

    public Clause getIfClause() {
        return ifClause;
    }

    public void addThenAction(Action action) {
        thenActions.add(action);
    }

    public void removeThenAction(Action action) {
        thenActions.remove(action);
    }

    public Action[] getThenActions() {
        return (Action[]) thenActions.toArray();
    }

    public void clearThenActions() {
        thenActions.clear();
    }

    public void addElseAction(Action action) {
        elseActions.add(action);
    }

    public void removeElseAction(Action action) {
        elseActions.remove(action);
    }

    public Action[] getElseActions() {
        return (Action[]) elseActions.toArray();
    }

    public void clearElseActions() {
        elseActions.clear();
    }

    @Override
    public String toXml() {
        StringBuffer xml = new StringBuffer();
        xml.append("<rule name=" + getName() + "\n");
        for (Parameter p : parameters.values())
            xml.append(p.toXml());
        xml.append("<if>" + ifClause.toXml() + "</if>\n <then>");

        for (Action action : thenActions)
            xml.append(action.toXml());
        xml.append("</then>\n <else>");
        for (Action action : elseActions)
            xml.append(action.toXml());
        xml.append("</else>\n </rule>");
        return xml.toString();
    }
}
