import java.util.Arrays;
import java.util.Scanner;
//Task 7
//Создай файл (класс) с именем UserInputUtils.
//Объяви глобальную функцию, внутри которой
//у пользователя с консоли запрашивается размер массива int[]
//и соответствующее количество его значений.
//Создай массив по вводимым пользователем данным и верни из функции.
public class UserInputUtils {
    public static int[] getNewArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length");
        int length = sc.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++){
            System.out.println("Enter value of "+ i + " element");
            array[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    public static void main(String[] args) {
        getNewArray();
    }
}