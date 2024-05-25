/**
 * Employee
 *
 * @author Andres Arevalo & Marius Guerra
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

    /**
     * Constructs an Employee with the specified attributes.
     *
     * @param name The name of the employee, must be longer than MIN_NAME_LENGTH and valid.
     * @param dressCode The dress code for the employee, must be a valid string.
     * @param isPaidSalary Indicates whether the employee is paid a salary.
     * @param postSecondaryEducationRequired Indicates whether post-secondary education is required.
     * @param workVerb The verb describing the work done by the employee, must be a valid string.
     * @throws IllegalArgumentException if the name is not valid or too short, or if the dressCode or workVerb are not valid.
     */
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

    /**
     * Gets the dress code for this employee.
     *
     * @return The dress code of the employee.
     */
    @Override
    public String getDressCode()
    {
        return dressCode;
    }

    /**
     * Checks if the employee is paid a salary.
     *
     * @return true if the employee is paid a salary, false otherwise.
     */
    @Override
    public boolean isPaidSalary()
    {
        return isPaidSalary;
    }

    /**
     * Checks if post-secondary education is required for this employee.
     *
     * @return true if post-secondary education is required, false otherwise.
     */
    @Override
    public boolean postSecondaryEducationRequired()
    {
        return postSecondaryEducationRequired;
    }

    /**
     * Gets the verb describing the work done by this employee.
     *
     * @return The work verb of the employee.
     */
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

    /**
     * Gets the overtime pay rate for this employee.
     * Subclasses must implement this method to provide the specific overtime pay rate.
     *
     * @return The overtime pay rate.
     */
    public abstract double getOverTimePayRate();

}