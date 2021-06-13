import java.util.ArrayList;

public class MarkDown {

    public String[] format(String s) {


        String[] arrOfStr = s.split("\\*");
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < arrOfStr.length; i++) {
            if ((i % 2) == 0) {
                arrayList.add(arrOfStr[i]);
            } else {
                arrayList.add("<b>");
                arrayList.add(arrOfStr[i]);
                arrayList.add("</b>");
            }
        }

        return arrayList.toArray(new String[arrayList.size()]);
    }

}
