package lambda;

import java.util.*;
import java.util.stream.Collectors;

public class SpecialMethodsPract4 {
    public static void main(String[] args) {
        int[] arr5 = new int[10];
        List<Integer> list5 = new ArrayList<>();

        fillArr5(arr5);
        fillList5(list5);


        int[] newArr = Arrays.stream(arr5).filter(a -> a % 2 != 0).map(a -> a * 2).toArray();
        List<Integer> newList = list5.stream().filter(a -> a % 2 == 0).map(a -> a + 10).toList();

        System.out.println(Arrays.toString(newArr));
        System.out.println(newList);

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            set.add(i+1);
        }
        System.out.println(set);

        set = set.stream().map(a -> a * 3).collect(Collectors.toSet());

        System.out.println(set);

    }

    private static void fillArr5 (int[] arr){
        for (int i = 0; i < 10; i++) {
            arr[i] = i +1;
        }
    }

    private static void fillList5 (List<Integer> list){
        for (int i = 0; i < 10; i++) {
            list.add(i + 1);
        }
    }
}
