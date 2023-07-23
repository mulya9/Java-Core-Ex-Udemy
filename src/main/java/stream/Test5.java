package stream;

import java.util.Arrays;

public class Test5 {
    public static void main(String[] args) {

        int[] array = {3,8,1,5,9,12,4,21,81,7,18};
       int res = Arrays.stream(array)
                .filter(value -> value%2==1)
                .map(e ->{if (e%3==0){e=e/3;} return e;})
                .reduce((a,b) -> a+b)
                .getAsInt();
        System.out.println(res);
    }
}
