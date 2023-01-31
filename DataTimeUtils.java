//Объяви внутри DateTimeUtils глобальную функцию, которая принимает год и возвращает,
//является ли он високосным.
public class DataTimeUtils {
    public static boolean isLeapYear(int year) {
        boolean isLeapYear = false;
        if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
                isLeapYear = true;
            } else {
                isLeapYear = false;
            }
        }
        System.out.println(isLeapYear);
        return isLeapYear;
    }

    public static void main(String[] args) {
        int year = 2022;
        isLeapYear(year);
    }
}
