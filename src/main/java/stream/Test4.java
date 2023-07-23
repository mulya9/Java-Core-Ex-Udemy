package stream;

import java.util.ArrayList;
import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);

        int res = list.stream().reduce((ac,el) -> ac*el).get();
//        System.out.println(res);

        List<String> list1 = new ArrayList<>();
        list1.add("Hello");
        list1.add("kak dela");
        list1.add("Im fine");
        list1.add("Bay");
        String resalt = list1.stream().reduce((ac,el) -> ac+" , "+el).get();
        System.out.println(resalt);
    }
}
