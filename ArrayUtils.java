import java.util.Arrays;

public class ArrayUtils {
//Task 2
//Объяви внутри ArrayUtils глобальную функцию,
//которая принимает массив int[] и возвращает
//double среднее арифметическое от всех его элементов.
    public static double getAverageNumber(int[] array) {
        double sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum / array.length;
    }
//Task 3
//Объяви внутри ArrayUtils глобальную функцию,
//которая принимает массив int[] и разворачивает его.
//Например, массив {1, 4, 3, 2} должен стать {2, 3, 4, 1}.
    public static int[] getReverseArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int j = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - i - 1] = j;
        }
        return array;
    }
//Task 4
//Объяви внутри ArrayUtils глобальную функцию, которая принимает массив int[],
//искомое значение int и возвращает индекс первого вхождения этого значения в массиве.
//Если такого значения в массиве нет, то возвращается специальное значение -1.
//Например, для массива {1, 2, 3, 4} и искомого значения 3 результат будет 2.
public static int getFirstIndex(int[] array, int j){
        for (int i = 0; i < array.length; i++){
            if (array[i] == j){
                return i;
            }
        }
        return -1;
}
//Task 5
//Объяви внутри ArrayUtils глобальную функцию, которая принимает массив int[],
//начальный индекс (включительно), конечный индекс (не включительно)
//и возвращает подмассив (subarray, часть массива) между этими индексами.
//Например, для массива {1, 2, 3, 4, 5} и индексов 1 и 3 результат будет {2, 3}.
    public static int[] getSubArray(int [] array, int firstIndex, int lastIndex){
        int subArrayLength = lastIndex - firstIndex;
        int[] subArray = new int[subArrayLength];
        for (int i = firstIndex, j = 0; i < lastIndex && j < subArrayLength; i++, j++){
            subArray[j] = array[i];
        }
        return subArray;
    }
//Task 6
//Видел на сайтах постраничный вывод данных?
//Например, из всего списка товаров интернет-магазин показывает изначально 10.
//Можно перейти на следующую страницу каталога, тогда будут показаны следующие 10 и т.д.
//Объяви внутри ArrayUtils глобальную функцию, которая принимает массив int[],
//номер страницы (считая от 1), количество элементов на одной странице
//и возвращает массив (подмассив), соответствующий заданной странице.
//Например, для массива {1, 2, 3, 4, 5, 6, 7} и размера страницы 3 результаты будут:
//Страница 1 – {1, 2, 3} Страница 2 – {4, 5, 6} Страница 3 – {7}
    public static int[] getSubArrayFromPage(int[] array, int page, int numberOfElements){
        int firstElement = (page - 1) * numberOfElements;
        int lastElement = page * numberOfElements;
        if(lastElement >= array.length) {
            lastElement = array.length;
        }
        return getSubArray(array, firstElement, lastElement);
    }
}

