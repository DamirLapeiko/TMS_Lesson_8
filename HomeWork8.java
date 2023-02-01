import java.util.Arrays;
import java.util.Scanner;
//Создай файл (класс) с именем HomeWork8 с функцией main.
//Запроси у пользователя число от 1 до 6 – номер задачи.
//По номеру должна происходить демонстрация работы соответствующей задачи.
//Запроси у пользователя входные аргументы функции.
//Для ввода массивов используй функцию из задачи 7.
//Вызови функцию с пользовательскими аргументами и выведи её результат на консоль.
public class HomeWork8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What task do you want to see? Enter a number from 1 to 6: ");
        int taskNumber = sc.nextInt();
            switch (taskNumber) {
                case 1 -> {
                    System.out.println("Enter a year: ");
                    int year = sc.nextInt();
                    if (DataTimeUtils.isLeapYear(year)) {
                        System.out.println("This year is leap");
                    } else {
                        System.out.println("This year is not leap");
                    }
                }
                case 2 -> {
                    int[] array;
                    System.out.println("Create a new array: ");
                    array = UserInputUtils.getNewArray();
                    double averageNum = ArrayUtils.getAverageNumber(array);
                    System.out.println("Average number from every elements : " + averageNum);
                }
                case 3 -> {
                    int[] array;
                    System.out.println("Create a new array: ");
                    array = UserInputUtils.getNewArray();
                    ArrayUtils.getReverseArray(array);
                    System.out.println(Arrays.toString(array));
                }
                case 4 -> {
                    int[] array;
                    System.out.println("Create a new array: ");
                    array = UserInputUtils.getNewArray();
                    System.out.println("Enter the number, whose index we will search for: ");
                    int number = sc.nextInt();
                    int indexOfElement = ArrayUtils.getFirstIndex(array, number);
                    if (indexOfElement != -1) {
                        System.out.println("Index of specified element is :" + indexOfElement);
                    } else {
                        System.out.println("Error");
                    }
                }
                case 5 -> {
                    int[] array;
                    System.out.println("Create a new array: ");
                    array = UserInputUtils.getNewArray();
                    System.out.println("Enter the first index: ");
                    int firstIndex = sc.nextInt();
                    System.out.println("Enter the last index: ");
                    int lastIndex = sc.nextInt();
                    int[] array1 = ArrayUtils.getSubArray(array, firstIndex, lastIndex);
                    System.out.println("Issue: " + Arrays.toString(array1));
                }
                case 6 -> {
                    int[] array;
                    System.out.println("Create a new array: ");
                    array = UserInputUtils.getNewArray();
                    System.out.println("Enter page number: ");
                    int page = sc.nextInt();
                    System.out.println("Enter number of elements on page: ");
                    int numberOfElements = sc.nextInt();
                    int[] array2 = ArrayUtils.getSubArrayFromPage(array, page, numberOfElements);
                    System.out.println("Result: " + Arrays.toString(array2));
                }
                default -> System.out.println("Wrong number of task");
            }
        }
    }
