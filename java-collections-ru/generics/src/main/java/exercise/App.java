package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

// BEGIN
class App {
    public static List<Map<String, String>> findWhere(
            List<Map<String, String>> books,
            Map<String, String> bookForCompare) {

        /*for result*/
        List<Map<String, String>> resultForTrueComparing = new ArrayList<>();

        /*go by list*/
        for (Map<String, String> bookInList: books) {
            /*true before each book*/
            boolean find = true;
            /*get list for compare*/
            for(Map.Entry<String, String> entry: bookForCompare.entrySet()) {
                /*find in list something like compare*/
                String compareBook = bookInList.getOrDefault(entry.getKey(), "");
                /*if do not find - do nothing, if find add item in result*/
                if(!compareBook.equals(entry.getValue())) {
                    find = false;
                }
            }
            if (find) {
                resultForTrueComparing.add(bookInList);
            }
        }
        return resultForTrueComparing;
    }
}
//END
