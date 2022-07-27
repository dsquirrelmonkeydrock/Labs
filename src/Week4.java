import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

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

        // write and test a method that takes a list of strings and a string a returns a
        // new list with all strings from the original list containing the second string
        // parameter
        List<String> statements = new ArrayList<String>();
        statements.add("Wyatt is a baby.");
        statements.add("Alison is an adult.");
        statements.add("Wyatt is angry.");

        System.out.println(searchMethod(statements, "Wyatt"));

        // write and test a method that takes a list of integers and returns a
        // list<list<integer>> where the first list in the returned value contains any
        // number from the input list that is divisible by2, the second list contains
        // values divisable by 3, the thirs divisiable by 5 and the fourth all numbers
        // from the input list not divisible by 2, 3, or 5
        List<Integer> numberlist = new ArrayList<>();
        numberlist.add(2);
        numberlist.add(3);
        numberlist.add(5);
        numberlist.add(7);
        numberlist.add(4);
        numberlist.add(6);
        numberlist.add(10);
        numberlist.add(13);
        System.out.println(numberlist);

        List<List<Integer>> results = divisableBy(numberlist);
        System.out.println(results.get(0));

        // write and test a method that takes a list of strings and returns a list of
        // integers that contains the length of each string
        System.out.println(stringCount(names));

        // create a set of strings and add 5 values
        Set<String> stringSet = new HashSet<String>();
        stringSet.add("Derrick");
        stringSet.add("Alison");
        stringSet.add("Wyatt");
        stringSet.add("David");
        stringSet.add("Pamela");
        System.out.println(stringSet);

        // write and test a method that takes a set of strings and a character and
        // returns a set of strings consisting of all the strings in the input set that
        // star with the charcter parameter

        System.out.println(startsWith(stringSet, 'D'));

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

    public static List<String> searchMethod(List<String> list, String searchWord) {
        // write and test a method that takes a list of strings and a string a returns a
        // new list with all strings from the original list containing the second string
        // parameter
        List<String> refinedList = new ArrayList<String>();
        for (String word : list) {
            if (word.contains(searchWord)) {
                refinedList.add(word);
            }
        }
        return refinedList;
    }

    public static List<List<Integer>> divisableBy(List<Integer> list) {
        // write and test a method that takes a list of integers and returns a
        // list<list<integer>> where the first list in the returned value contains any
        // number from the input list that is divisible by2, the second list contains
        // values divisable by 3, the thirs divisiable by 5 and the fourth all numbers
        // from the input list not divisible by 2, 3, or 5

        List<List<Integer>> results = new ArrayList<List<Integer>>();
        results.add(new ArrayList<Integer>());
        results.add(new ArrayList<Integer>());
        results.add(new ArrayList<Integer>());
        results.add(new ArrayList<Integer>());
        for (int number : list) {
            if (number % 2 == 0) {
                results.get(0).add(number);
            }
            if (number % 3 == 0) {
                results.get(1).add(number);
            }
            if (number % 5 == 0) {
                results.get(2).add(number);
            }
            if ((number % 2 != 0) && (number % 3 != 0) && (number % 5 != 0)) {
                results.get(3).add(number);
            }
        }
        return results;
    }

    public static List<Integer> stringCount(List<String> list) {
        // write and test a method that takes a list of strings and returns a list of
        // integers that contains the length of each string
        List<Integer> results = new ArrayList<Integer>();
        for (String word : list) {
            results.add(word.length());
        }
        return results;
    }

    public static Set<String> startsWith(Set<String> set, char letter) {
        // write and test a method that takes a set of strings and a character and
        // returns a set of strings consisting of all the strings in the input set that
        // star with the charcter parameter
        Set<String> results = new HashSet<String>();
        for (String word : set) {
            if (word.charAt(0) == letter) {
                results.add(word);
            }
        }
        return results;
    }
}
