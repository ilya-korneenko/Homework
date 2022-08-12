package Homework4;


import Homework4.comparator.StringComparator;

import java.util.Arrays;

public class DataContainerMain {
    public static void main(String[] args) {

        DataContainer<String> container = new DataContainer<>(new String[8]);
        StringComparator comparator = new StringComparator();
        //IntComparator comparator = new IntComparator();

        int index1 = container.add("Привет");
        int index2 = container.add("Как дела");
        int index3 = container.add("Работаю");
        int index4 = container.add("Давай потом");
        int index5 = container.add("Привет");

        String text1 = container.get(index1);
        String text2 = container.get(index2);
        String text3 = container.get(index3);
        String text4 = container.get(index4);
        String text5 = container.get(index5);

        System.out.println(Arrays.toString(container.toString(container.getItems())));

        boolean res1 = container.delete("Привет");
        System.out.println(res1);
        System.out.println(Arrays.toString(container.toString(container.getItems())));
        boolean res =container.delete(15);
        System.out.println(res);
        System.out.println(Arrays.toString(container.toString(container.getItems())));
        container.delete(text5);
        System.out.println(Arrays.toString(container.toString(container.getItems())));

        System.out.println(container);

        container.sort(comparator);
        System.out.println(container);
        System.out.println(Arrays.toString(container.toString(container.getItems())));

    }
}
