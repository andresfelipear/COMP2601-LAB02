import java.util.*;

/**
 * Employees
 *
 * @author Andres Arevalo & Marius Guerra
 * @version 1.0
 */
public class Employees
{
    private final List<Employee> employees;
    private final List<HockeyPlayer> hockeyPlayers;
    private final List<Professor> professors;
    private final List<Parent> parents;
    private final List<GasStationAttendant> gasAttendants;

    private static final int MIN_GROUP_SIZE = 1;

    public static void main(String[] args)
    {
        Employees employees;
        employees = new Employees();
    }

    /**
     * Constructs an Employees object and initializes lists of different types of employees.
     * Adds sample employees to each list and demonstrates sorting and finding groups of equal employees.
     */
    public Employees()
    {
        final Employee emp1;
        final Employee emp2;
        final Employee emp3;
        final Employee emp4;
        final Employee emp5;
        final Employee emp6;
        final Employee emp7;
        final Employee emp8;
        final Employee emp9;
        final Employee emp10;
        final Employee emp11;
        final Employee emp12;
        final Employee emp13;
        final Employee emp14;
        final Employee emp15;
        final Employee emp16;
        final Employee emp17;
        final Employee emp18;
        final Employee emp19;
        final Employee emp20;

        employees = new ArrayList<>();
        hockeyPlayers = new ArrayList<>();
        professors = new ArrayList<>();
        parents = new ArrayList<>();
        gasAttendants = new ArrayList<>();

        emp1 = new HockeyPlayer("Wayne Gretzky", 894);
        emp2 = new HockeyPlayer("Who Ever", 0);
        emp3 = new HockeyPlayer("Brent Gretzky", 1);
        emp4 = new HockeyPlayer("Pavel Bure", 437);
        emp5 = new HockeyPlayer("Jason Wilder", 0);

        emp6 = new Professor("Albert Einstein", "Physics");
        emp7 = new Professor("Jason Wilder", "Computer Systems");
        emp8 = new Professor("Richard Feynman", "Physics");
        emp9 = new Professor("BCIT Instructor", "Computer Systems");
        emp10 = new Professor("Kurt Godel", "Logic");

        emp11 = new Parent("Tiger Woods", 1);
        emp12 = new Parent("Super Mom", 168);
        emp13 = new Parent("Lazy Larry", 20);
        emp14 = new Parent("Ex Hausted", 168);
        emp15 = new Parent("Super Dad", 167);

        emp16 = new GasStationAttendant("Joe Smith", 10);
        emp17 = new GasStationAttendant("Tony Baloney", 100);
        emp18 = new GasStationAttendant("Benjamin Franklin", 100);
        emp19 = new GasStationAttendant("Mary Fairy", 101);
        emp20 = new GasStationAttendant("Bee See", 1);

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);
        employees.add(emp6);
        employees.add(emp7);
        employees.add(emp8);
        employees.add(emp9);
        employees.add(emp10);
        employees.add(emp11);
        employees.add(emp12);
        employees.add(emp13);
        employees.add(emp14);
        employees.add(emp15);
        employees.add(emp16);
        employees.add(emp17);
        employees.add(emp18);
        employees.add(emp19);
        employees.add(emp20);

        // Populate the separate lists
        for(Employee e : employees)
        {
            if(e instanceof HockeyPlayer)
            {
                hockeyPlayers.add((HockeyPlayer) e);
            }
            else if(e instanceof Professor)
            {
                professors.add((Professor) e);
            }
            else if(e instanceof Parent)
            {
                parents.add((Parent) e);
            }
            else if(e instanceof GasStationAttendant)
            {
                gasAttendants.add((GasStationAttendant) e);
            }
        }

        printDetails();
    }

    /**
     * Prints each list before and after it was sort.
     * After it prints all the elements of each list that are equals.
     *
     */
    private void printDetails()
    {
        System.out.println("Hockey Players - Before");
        System.out.println(hockeyPlayers);
        System.out.println("Hockey Players - After");
        Collections.sort(hockeyPlayers);
        System.out.println(hockeyPlayers);

        System.out.println("\nProfessors - Before");
        System.out.println(professors);
        System.out.println("Professors - After");
        Collections.sort(professors);
        System.out.println(professors);

        System.out.println("\nParents - Before");
        System.out.println(parents);
        System.out.println("Parents - After");
        Collections.sort(parents);
        System.out.println(parents);

        System.out.println("\nGas Station Attendants - Before");
        System.out.println(gasAttendants);
        System.out.println("Gas Station Attendants - After");
        Collections.sort(gasAttendants);
        System.out.println(gasAttendants);

        // Displaying groups of equal employees
        System.out.println("\nEquals hockey Players");
        displayEquals(hockeyPlayers);

        System.out.println("\nEquals professors");
        displayEquals(professors);

        System.out.println("\nEquals parents");
        displayEquals(parents);

        System.out.println("\nEquals gas attendants");
        displayEquals(gasAttendants);
    }

    /**
     * Displays groups of equal objects from a list.
     *
     * @param <T> The type of objects in the list.
     * @param list The list of objects to be compared.
     */
    public <T> void displayEquals(final List<T> list)
    {
        final Set<List<T>> groupOfEquals;

        Iterator<T>     it;
        List<T>         equalsGroup;
        T               current;

        groupOfEquals = new HashSet<>();
        equalsGroup = new ArrayList<>();
        it = list.listIterator();

        for(final T obj: list)
        {
            while( it.hasNext())
            {
                current = it.next();
                if(obj.equals(current))
                {
                    equalsGroup.add(current);
                }
            }
            if(equalsGroup.size() > MIN_GROUP_SIZE)
            {
                groupOfEquals.add(equalsGroup);
            }

            equalsGroup = new ArrayList<>();
            it = list.listIterator();
        }

        for(final List<T> T : groupOfEquals)
        {
            System.out.println(T);
        }
    }
}
