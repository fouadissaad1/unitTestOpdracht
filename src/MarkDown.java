import org.junit.platform.commons.util.StringUtils;

public class MarkDown {




    public MarkDown() {
    }
    public static String[] format(String s)
    {

        if (s==null) return null;
        String[] words=new String[]{};
        words=s.split(" * ");

        String newName=String.join(",",words);
        if(newName.endsWith("*")) return new String[]{newName.replace("*",",</b>")};
        if(newName.startsWith("*")) return new String[]{newName.replace("*","<b>,")};


        return new String[]{newName};
    }


}
