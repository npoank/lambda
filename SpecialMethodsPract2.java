package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SpecialMethodsPract2 {
    public static void main(String[] args) {
        int[] arr2 = new int[10];
        List<Integer> list2 = new ArrayList<>();

        fillArr2(arr2);
        fillList2(list2);

        int[] arr3 = new int[10];
        List<Integer> list3 = new ArrayList<>();

        fillArr2(arr3);
        fillList2(list3);


        // map
        arr2 = Arrays.stream(arr2).map(a -> a * 2).toArray();
        list2 = list2.stream().map(a -> a * 2).collect(Collectors.toList());


        // filter
        arr3 = Arrays.stream(arr3).filter(a -> a % 2 == 0).toArray();
        list3 = list3.stream().filter(a -> a % 2 == 0).collect(Collectors.toList());


        System.out.println("map " + Arrays.toString(arr2));
        System.out.println("map " + list2);

        System.out.println("filter " + Arrays.toString(arr3));
        System.out.println("filter " + list3);

        // forEach
        Arrays.stream(arr3).forEach(a -> System.out.print(a));
        System.out.println();
        list3.forEach(System.out::print);

    }

    private static void fillArr2(int[] array) {
        for (int i = 0; i < 10; i++) {
            array[i] = i + 1;
        }
    }

    private static void fillList2(List<Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add(i + 1);
        }
    }
}
