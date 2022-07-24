import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Week4 {
    public static void main(String[] args) {
        // instantiate a new stringbuilder and append the charcters 0 though 9 to it
        // seperated by dashes
        // make sure no dash appears at the end of the stringbuilder
        StringBuilder zeroThroughNine = new StringBuilder();
        for (int i = 0; i <= 9; i++) {
            zeroThroughNine.append(i);
            if (i < 9) {
                zeroThroughNine.append("-");
            }
        }
        System.out.println(zeroThroughNine.toString());

        // create a list of strings and add 5 strings to it, each with a different
        // length
        List<String> names = new ArrayList<String>();
        names.add("Adam");
        names.add("Derrick");
        names.add("Alison");
        names.add("Wyatt");
        names.add("Jay");

        System.out.println(names);

        // write and test a method that takes a list of strings and returns the shortest
        // string
        System.out.println(findShortestString(names));

        // write and test a method that takes a list of strings and returns the list
        // with the firsta nd last element switched.
        names = switchFirstAndLast(names);
        System.out.println(names);

        // write and test a method that takes a list of strings and returns a string
        // with all the list elements concatenated to each other, separated by a comma.
        System.out.println(concatenateWithComma(names));
    }

    public static String findShortestString(List<String> words) {
        // write and test a method that takes a list of strings and returns the shortest
        // string

        String smallest = words.get(0).toString();
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).toString().length() < smallest.length()) {
                smallest = words.get(i).toString();
            }
        }
        return smallest;
    }

    public static List<String> switchFirstAndLast(List<String> list) {
        // write and test a method that takes a list of strings and returns the list
        // with the firsta nd last element switched.
        String first = list.get(0);
        String last = list.get(list.size() - 1);
        list.set(0, last);
        list.set(list.size() - 1, first);
        return list;
    }

    public static String concatenateWithComma(List<String> list) {
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            temp.append(list.get(i).toString());
            if (i != list.size() - 1) {
                temp.append(",");
            }
        }
        return temp.toString();
    }
}
