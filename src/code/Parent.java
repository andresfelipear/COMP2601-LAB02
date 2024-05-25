/**
 * Parent
 *
 * @author user
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

    @Override
    public double getOverTimePayRate()
    {
        return OVERTIME_PAY_RATE;
    }

    @Override
    public boolean getsPaid()
    {
        return false;
    }

    @Override
    public int compareTo(final Parent that)
    {
        return this.weeklyHoursWithKids - that.weeklyHoursWithKids;
    }
}
