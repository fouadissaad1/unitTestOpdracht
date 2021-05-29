public class MarkDown {




    public MarkDown() {
    }
    public static String[] format(String s)
    {
        String[] strings=new String[s.length()];

        for (int i = 0; i < s.length(); i++) {
                   strings[i]= String.valueOf(s.charAt(i));
            if (s.startsWith("*")) return new String[] {s.replace("*","<b>")};
            if (s.endsWith("*")) return new String[] {s.replace("*","</b>")};
        }

        if(s==null) return null;




        if (s.length()==2) return new String[]{s+1};
        if (s.length()>5) return new String[]{s};
        return new String[]{"["+s+"]"};
    }


}
