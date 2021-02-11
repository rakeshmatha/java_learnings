import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Optional;
import java.util.concurrent.Callable;

class Parentss {

    public static void main(String stuff[]) {
        Calendar cal = Calendar.getInstance();
        cal.set(2000,Calendar.AUGUST, 30);
        cal.roll(Calendar.MONTH,7);
        System.out.println(""+cal.get(Calendar.DATE)+"-"+ cal.get(Calendar.MONTH)+"-"+cal.get(Calendar.YEAR));
        cal.add(Calendar.MONTH,11);
        System.out.println(""+cal.get(Calendar.DATE)+"-"+ cal.get(Calendar.MONTH)+"-"+cal.get(Calendar.YEAR));
        LocalDate date = LocalDate.of(2000, Month.AUGUST,30);
        date.plusMonths(6);
        System.out.println(""+date.getDayOfMonth()+"-"+ date.getMonthValue()+"-"+date.getYear());

    }}
