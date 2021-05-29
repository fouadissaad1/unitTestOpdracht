public class MarkDown {




    public MarkDown() {
    }
    public static String[] format(String s)
    {

        String[] words=new String[]{};
        words=s.split(" * ");
        String newName=String.join(",",words);




        return new String[]{newName};
    }


}
