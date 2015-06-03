package classes;

import interfaces.Action;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Rathinakumar on 6/2/2015.
 */
public class RunRuleAction implements Action {

    String name;
    Map<String, String> args = new HashMap<String, String>();

    public RunRuleAction( String name)
    {
        this.name = name;
    }

    public void setName( String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setArgument( String name, String value )
    {
        args.put(name, value);
    }

    public String[] getArgumentNames()
    {
        return (String[]) args.keySet().toArray();
    }

    public String getArgument( String name )
    {
        return args.get(name);
    }

    public String removeArgument( String name )
    {
        args.remove(name);
        return "";
    }

    public void clearArguments()
    {
        args.clear();
    }

    @Override
    public String toXml() {
        StringBuffer xml = new StringBuffer();
        xml.append("<runRuleAction name="+getName()+">\n");
        for(String arg : args.keySet())
            xml.append("\t<argument name="+arg+" value="+args.get(arg)+"/>\n");
        xml.append("</runRuleAction>");
        return xml.toString();
    }
}
