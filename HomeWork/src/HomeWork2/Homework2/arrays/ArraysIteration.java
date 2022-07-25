package HomeWork2.Homework2.arrays;

public class ArraysIteration {
    public static void main(String[] args) {
        allElements(ArraysUtils.arrayFromConsole());
        evenElements(ArraysUtils.arrayFromConsole());
        reverseElements(ArraysUtils.arrayFromConsole());
    }

    static void allElements(int[] array) {
        int i = 0;
        do {
            System.out.print(array[i] + " ");
            i++;
        } while (i < array.length);
        System.out.println();
    }

    static void evenElements(int[] array) {
        if (1 == array.length) {
            System.out.println("Чётных элементов нет");
        } else if(0==array.length%2){
            for (int i = 0; i < array.length; i++) {
                ++i;
                System.out.println(array[i] + " ");
            }
        }else {
            for (int i = 0; i < array.length; i++) {
                if (i == (array.length - 1))
                    break;
                ++i;
                System.out.println(array[i] + " ");
            }
        }
        System.out.println();
    }

    static void reverseElements(int[] array) {
        int position = array.length - 1;
        while (position >= 0) {
            System.out.print(array[position]+" ");
            position--;
        }
    }
}
