/**
 * Professor
 *
 * @author user
 * @version 1.0
 */
public class Professor extends Employee implements Comparable<Professor>
{
    private final String teachingMajor;

    private static final String     BIGGER_MAJOR = "Computer Systems";
    private static final String     DRESS_CODE   = "fancy";
    private static final String     WORK_VERB    = "teach";
    private static final boolean    IS_PAID_SALARY                       = true;
    private static final boolean    IS_POST_SECONDARY_EDUCATION_REQUIRED = true;
    private static final int HIGHER = 1;
    private static final int LOWER = -1;
    private static final int EQUALS = 0;

    private static final double OVERTIME_PAY_RATE = 2.0;

    /**
     * Constructs a Professor with the specified name and teaching major.
     *
     * @param name The name of the professor.
     * @param teachingMajor The major that the professor teaches.
     */
    public Professor(final String name,
                     final String teachingMajor)
    {
        super(name,
              DRESS_CODE,
              IS_PAID_SALARY,
              IS_POST_SECONDARY_EDUCATION_REQUIRED,
              WORK_VERB);
        this.teachingMajor = teachingMajor;
    }

    /**
     * Gets the overtime pay rate for the professor, which is OVERTIME_PAY_RATE.
     *
     * @return The overtime pay rate.
     */
    @Override
    public double getOverTimePayRate()
    {
        return OVERTIME_PAY_RATE;
    }

    /**
     * Compares this professor to another based on the teaching major.
     * Professors who teach Computer Systems are considered highest.
     *
     * @param that The other professor to compare to.
     * @return 1 if this professor teaches Computer Systems, -1 if the other professor teaches Computer Systems,
     *         0 if neither or both teach Computer Systems.
     */
    @Override
    public int compareTo(final Professor that)
    {
        if(this.teachingMajor.equalsIgnoreCase(BIGGER_MAJOR))
        {
            return HIGHER;
        }
        else if(that.teachingMajor.equalsIgnoreCase(BIGGER_MAJOR))
        {
            return LOWER;
        }
        else
        {
            return EQUALS;
        }
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     * Professors are considered equal if they teach the same major.
     *
     * @param obj The reference object with which to compare.
     * @return true if this object is the same as the obj argument; false otherwise.
     */
    @Override
    public boolean equals(final Object obj)
    {
        final Professor that;

        if(this == obj)
        {
            return true;
        }
        if(obj == null || getClass() != obj.getClass())
        {
            return false;
        }

        that = (Professor) obj;

        return teachingMajor.equals(that.teachingMajor);
    }

    /**
     * Returns a hash code value for the object.
     *
     * @return A hash code value for this object.
     */
    @Override
    public int hashCode()
    {
        return 0;
    }

    /**
     * Returns a string representation of the professor.
     *
     * @return A string representation of the professor.
     */
    @Override
    public String toString()
    {
        return String.format("%s teaches %s",
                             super.getName(),
                             teachingMajor);
    }
}
