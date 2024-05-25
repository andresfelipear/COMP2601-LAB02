import java.util.ArrayList;
import java.util.List;

/**
 * Employees
 *
 * @author user
 * @version 1.0
 */
public class Employees
{
    private final List<Employee> employees;

    public Employees()
    {
        employees = new ArrayList<>();

        // Hockey Players
        employees.add(new HockeyPlayer("Wayne Gretzky",894));
        employees.add(new HockeyPlayer("Who Ever",0));
        employees.add(new HockeyPlayer("Brent Gretzky",1));
        employees.add(new HockeyPlayer("Pavel Bure",437));
        employees.add(new HockeyPlayer("Jason Wilder",0));

        // Professors
        employees.add(new Professor("Albert Einstein", "Physics"));
        employees.add(new Professor("Jason Wilder", "Computer Systems"));
        employees.add(new Professor("Richard Feynman", "Physics"));
        employees.add(new Professor("BCIT Instructor", "Computer Systems"));
        employees.add(new Professor("Kurt Godel", "Logic"));

        // Parent
        employees.add(new Parent("Tiger Woods", 1));
        employees.add(new Parent("Super Mom", 168));
        employees.add(new Parent("Lazy Larry", 20));
        employees.add(new Parent("Ex Hausted", 168));
        employees.add(new Parent("Super Dad", 167));

        // Gas Attendant
        employees.add(new GasStationAttendant("Joe Smith", 10));
        employees.add(new GasStationAttendant("Tony Baloney", 100));
        employees.add(new GasStationAttendant("Benjamin Franklin", 100));
        employees.add(new GasStationAttendant("Mary Fairy", 101));
        employees.add(new GasStationAttendant("Bee See", 1));
    }


}
