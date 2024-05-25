import java.util.*;

/**
 * Employees
 *
 * @author Andres Arevalo & Marius Guerra
 * @version 1.0
 */
public class Employees
{
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
        hockeyPlayers = new ArrayList<>();
        professors = new ArrayList<>();
        parents = new ArrayList<>();
        gasAttendants = new ArrayList<>();

        // Hockey Players
        hockeyPlayers.add(new HockeyPlayer("Wayne Gretzky",894));
        hockeyPlayers.add(new HockeyPlayer("Who Ever",0));
        hockeyPlayers.add(new HockeyPlayer("Brent Gretzky",1));
        hockeyPlayers.add(new HockeyPlayer("Pavel Bure",437));
        hockeyPlayers.add(new HockeyPlayer("Jason Wilder",0));

        // Professors
        professors.add(new Professor("Albert Einstein", "Physics"));
        professors.add(new Professor("Jason Wilder", "Computer Systems"));
        professors.add(new Professor("Richard Feynman", "Physics"));
        professors.add(new Professor("BCIT Instructor", "Computer Systems"));
        professors.add(new Professor("Kurt Godel", "Logic"));

        // Parent
        parents.add(new Parent("Tiger Woods", 1));
        parents.add(new Parent("Super Mom", 168));
        parents.add(new Parent("Lazy Larry", 20));
        parents.add(new Parent("Ex Hausted", 168));
        parents.add(new Parent("Super Dad", 167));

        // Gas Attendant
        gasAttendants.add(new GasStationAttendant("Joe Smith", 10));
        gasAttendants.add(new GasStationAttendant("Tony Baloney", 100));
        gasAttendants.add(new GasStationAttendant("Benjamin Franklin", 100));
        gasAttendants.add(new GasStationAttendant("Mary Fairy", 101));
        gasAttendants.add(new GasStationAttendant("Bee See", 1));

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
