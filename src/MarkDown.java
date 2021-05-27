public class MarkDown {




    public MarkDown() {
    }
    public static String[] format(String s)
    {


           if (s.endsWith("*")) return new String[] {s.replace("*","<b>")};


        return new String[]{"["+s+"]"};
    }


}
