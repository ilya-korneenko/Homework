package Homework4;


import java.util.Arrays;
import java.util.Comparator;

public class DataContainer<T> implements Comparator<T> {
    private T[] data;

    public DataContainer(T[] data) {
        this.data = data;
    }

    public T[] getData() {
        return data;
    }

    public void setData(T[] data) {
        this.data = data;
    }

    public T[] getItems() {
        return data;
    }

    public int add(T item) {
        //исправить i
        for (int i = 0; i < data.length; i++) {
            if (item == null) {
                System.out.println("Ошибка");
                return -1;
            }

            if (data[i] == null) {
                data[i] = item;
                return i;
            }

            //не работающий if
            //используй Arrays.copyOf()
            //+проверка, могут передать массив без длины
            //только проверить
            if (i == data.length - 1) {
                data = Arrays.copyOf(data, data.length + 1);
                data[i + 1] = item;
                return i + 1;
            }
        }
        return 0;
    }   //исправить i? не равно 10(проверить)

    public T get(int index) {
        return data[index];
    }   //имеются вопросики

    public boolean delete(int index) {
        if (index > data.length) {
            return false;
        } else {
            //DataContainer<Object> tmp = new DataContainer<>(new Object[data.length-1]);
            T[] tmp = Arrays.copyOf(data, data.length - 1);
            for (int i = 0, j = 0; i < data.length; i++) {
                if (i != index) {
                    tmp[j] = data[i];
                    j++;
                }
            }
            data = tmp;
            return true;
        }
    }

    public boolean delete(T item) {
        int flag =0;
        if (item == null) {
            return false;
        } else {
            int index = -1;
            for (int i = 0; i < data.length; i++) {
                if (data[i] == item && flag==0) {
                    index = i;
                    flag = 1;
                }
            }
            if (-1 == index) {
                return false;
            } else {
                T[] tmp = Arrays.copyOf(data, data.length - 1);
                for (int i = 0, j = 0; i < data.length; i++) {
                    if (index != i) {
                        tmp[j] = data[i];
                        j++;
                    }

                }
                data = tmp;
                return true;
            }
        }
    }   //проверить на перенос (null) 1 2 3 null 4 5 перенесет ли??

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();

        for (T datum : data) {
            if (datum != null) {
                str.append(datum).append(" ");
            }
        }
        return String.valueOf(str);
    }

    public String[] toString(String[] items) {
        return items;
    }


//сравнение
    public void sort(Comparator <T> comparator){
        for (int i = 0; i < data.length-1; i++) {
            for (int j = i+1; j < data.length; j++) {
                if(comparator.compare(data[i],data[j])>0){
                    T tmp = data[i];
                    data[i] = data[j];
                    data[j]=tmp;
                }

            }
        }
    }

    @Override
    public int compare(T o1, T o2) {
        return 0;
    }
}
