package lambda;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpecialMethodsPract3 {
    public static void main(String[] args) {
        int[] arr4 = new int[10];
        List<Integer> list4 = new ArrayList<>();

        fillArr4(arr4);
        fillList4(list4);


        // reduce
        int sumArray = Arrays.stream(arr4).reduce((accum, b) -> accum + b).getAsInt();
        int sumList = list4.stream().reduce((accum, b) -> accum * b).get();

        System.out.println("reduce " + sumArray);
        System.out.println("reduce " + sumList);
    }

    private static void fillArr4 (int[] arr){
        for (int i = 0; i < 10; i++) {
            arr[i] = i +1;
        }
    }

    private static void fillList4 (List<Integer> list){
        for (int i = 0; i < 10; i++) {
            list.add(i + 1);
        }
    }
}
