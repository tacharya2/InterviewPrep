import java.util.Calendar;

public class DayOfWeek {
    public static void main(String[] args) {
        int month = 8;
        int day = 5;
        int year = 1983;
        System.out.println(findDay(month, day, year));
    }

    public static String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();

        calendar.set(month, day, year);

        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

 return "";

}
}
