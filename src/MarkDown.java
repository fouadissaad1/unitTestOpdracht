public class MarkDown {




    public MarkDown() {
    }
    public static String[] format(String s)
    {

        String[] words=new String[]{};
        words=s.split(" * ");

        String newName=String.join(",",words);
        if(newName.endsWith("*")) return new String[]{newName.replace("*",",</b>")};
        if(newName.startsWith("*")) return new String[]{newName.replace("*","<b>,")};


        return new String[]{newName};
    }


}
