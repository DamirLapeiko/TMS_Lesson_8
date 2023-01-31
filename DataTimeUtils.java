//Объяви внутри DateTimeUtils глобальную функцию, которая принимает год и возвращает,
//является ли он високосным.
public class DataTimeUtils {
    public static boolean YearIsLeapOrNo(int year) {
        if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + " год високосный");
            } else {
                System.out.println(year + " год не високосный");
            }
        } else {
            System.out.println(year + " год не високосный");
        }
        return false;
    }
    public static void main(String[] args) {
        int year = 2022;
        YearIsLeapOrNo(year);
    }
}
