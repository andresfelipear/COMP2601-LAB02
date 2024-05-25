/**
 * Parent
 *
 * @author Andres Arevalo & Marius Guerra
 * @version 1.0
 */
public class Parent extends Employee implements Comparable<Parent>
{
    private int weeklyHoursWithKids;

    private static final String     DRESS_CODE  = "anything";
    private static final String     WORK_VERB   = "care";
    private static final boolean    IS_PAID_SALARY                       = false;
    private static final boolean    IS_POST_SECONDARY_EDUCATION_REQUIRED = false;
    private static final double OVERTIME_PAY_RATE = -2.0;

    /**
     * Constructs a Parent with the specified name and weekly hours spent with kids.
     *
     * @param name The name of the parent.
     * @param weeklyHoursWithKids The number of hours per week the parent spends with their kids.
     */
    public Parent(final String name,
                  final int weeklyHoursWithKids)
    {
        super(name,
              DRESS_CODE,
              IS_PAID_SALARY,
              IS_POST_SECONDARY_EDUCATION_REQUIRED,
              WORK_VERB);
        this.weeklyHoursWithKids = weeklyHoursWithKids;
    }

    /**
     * Gets the overtime pay rate for the parent, which is OVERTIME_PAY_RATE.
     *
     * @return The overtime pay rate.
     */
    @Override
    public double getOverTimePayRate()
    {
        return OVERTIME_PAY_RATE;
    }

    /**
     * Indicates whether the parent gets paid, which is always false.
     *
     * @return false, as parents do not get paid.
     */
    @Override
    public boolean getsPaid()
    {
        return false;
    }

    /**
     * Compares this parent to another based on the number of weekly hours spent with kids.
     *
     * @param that The other parent to compare to.
     * @return A negative integer, zero, or a positive integer as this parent spends less than, equal to,
     *         or more than the specified parent.
     */
    @Override
    public int compareTo(final Parent that)
    {
        return this.weeklyHoursWithKids - that.weeklyHoursWithKids;
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     * Parents are considered equal if they spend the same number of weekly hours with kids.
     *
     * @param obj The reference object with which to compare.
     * @return true if this object is the same as the obj argument; false otherwise.
     */
    @Override
    public boolean equals(final Object obj)
    {
        final Parent that;

        if(this == obj)
        {
            return true;
        }
        if(obj == null || getClass() != obj.getClass())
        {
            return false;
        }

        that = (Parent) obj;

        return weeklyHoursWithKids == that.weeklyHoursWithKids;
    }

    /**
     * Returns a hash code value for the object.
     *
     * @return A hash code value for this object.
     */
    @Override
    public int hashCode()
    {
        return weeklyHoursWithKids;
    }

    /**
     * Returns a string representation of the parent.
     *
     * @return A string representation of the parent.
     */
    @Override
    public String toString()
    {
        return String.format("%s spends %d hour/week with kids",
                             super.getName(),
                             weeklyHoursWithKids);
    }
}
