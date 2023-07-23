package stream;

import java.util.*;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("kak dela");
        list.add("Im fine");
        list.add("Bay");

        List<Integer> list1 = list.stream()
                .map(element -> element.length())
                .collect(Collectors.toList());
//        System.out.println(list1);

        int [] ar = {1,3,9,8,6};
        ar = Arrays.stream(ar)
                .map(element -> {
                    if (element % 3 == 0)
                    {element = element / 3;
                }
                return element;
                })
                .toArray();
//        System.out.println(Arrays.toString(ar));

        Set<String> set = new TreeSet<>();
        set.add("Hello");
        set.add("kak dela");
        set.add("Im fine");
        set.add("Bay");

        Set<Integer> set1 = set.stream().map(e -> e.length()).collect(Collectors.toSet());
        List<Integer> set2 = set.stream().map(e -> e.length()).collect(Collectors.toList());
        System.out.println(set);
//        System.out.println(set1);
        System.out.println(set2);
    }
}
