import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class SortDatesApplication {

    public static void test() {

        List<LocalDate> dates = new ArrayList<>();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        dates.add(LocalDate.parse("07.03.2023", formatter));
        dates.add(LocalDate.parse("11.06.2022", formatter));
        dates.add(LocalDate.parse("22.09.2025", formatter));
        dates.add(LocalDate.parse("09.10.2028", formatter));
        dates.add(LocalDate.parse("03.01.2026", formatter));
        dates.add(LocalDate.parse("18.05.2029", formatter));
        dates.add(LocalDate.parse("15.04.2027", formatter));
        dates.add(LocalDate.parse("25.07.2030", formatter));

        Collection<LocalDate> sortedDates = DateSorter.sortDates(dates);

        System.out.println("Sorted date list: ");
        System.out.println(sortedDates);
    }

    public static void main(String[] args) {

        test();
    }
}


