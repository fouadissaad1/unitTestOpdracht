public class MarkDown {




    public MarkDown() {
    }
    public static String[] format(String s)
    {
        if(s==null) return null;

        if (s.startsWith("*")) return new String[] {s.replace("*","<b>")};
           if (s.endsWith("*")) return new String[] {s.replace("*","<b>")};



        return new String[]{"["+s+"]"};
    }


}
