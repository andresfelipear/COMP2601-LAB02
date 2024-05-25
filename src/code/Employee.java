/**
 * Employee
 *
 * @author user
 * @version 1.0
 */
public abstract class Employee implements Employable
{
    private final String    name;
    private final String    dressCode;
    private final String    workVerb;
    private final boolean   isPaidSalary;
    private final boolean   postSecondaryEducationRequired;

    //constants
    private static final int MIN_NAME_LENGTH = 2;

    public Employee(final String    name,
                    final String    dressCode,
                    final boolean   isPaidSalary,
                    final boolean   postSecondaryEducationRequired,
                    final String    workVerb)
    {
        if(!Utilities.isValidString(name) || name.length() <= MIN_NAME_LENGTH)
        {
            throw new IllegalArgumentException("Invalid name. It has to be longer than " + MIN_NAME_LENGTH);
        }

        if(!Utilities.isValidString(dressCode))
        {
            throw new IllegalArgumentException("Invalid dress code!.");
        }

        if(!Utilities.isValidString(workVerb))
        {
            throw new IllegalArgumentException("Invalid work verb.");
        }

        this.name = name;
        this.dressCode = dressCode;
        this.isPaidSalary = isPaidSalary;
        this.postSecondaryEducationRequired = postSecondaryEducationRequired;
        this.workVerb = workVerb;
    }

    @Override
    public String getDressCode()
    {
        return dressCode;
    }

    @Override
    public boolean isPaidSalary()
    {
        return isPaidSalary;
    }

    @Override
    public boolean postSecondaryEducationRequired()
    {
        return postSecondaryEducationRequired;
    }

    @Override
    public String getWorkVerb()
    {
        return workVerb;
    }

    /**
     *
     * @return the name of the employee
     */
    public String getName()
    {
        return name;
    }

    public abstract double getOverTimePayRate();

}