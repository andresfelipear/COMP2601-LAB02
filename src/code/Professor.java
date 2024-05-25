/**
 * Professor
 *
 * @author user
 * @version 1.0
 */
public class Professor extends Employee implements Comparable<Professor>
{
    private final String teachingMajor;

    private static final String     BIGGER_MAJOR = "Computer Science";
    private static final String     DRESS_CODE   = "fancy";
    private static final String     WORK_VERB    = "teach";
    private static final boolean    IS_PAID_SALARY                       = true;
    private static final boolean    IS_POST_SECONDARY_EDUCATION_REQUIRED = true;
    private static final double OVERTIME_PAY_RATE = 2.0;

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

    @Override
    public double getOverTimePayRate()
    {
        return OVERTIME_PAY_RATE;
    }

    @Override
    public int compareTo(final Professor that)
    {
        if(this.teachingMajor.equalsIgnoreCase(BIGGER_MAJOR))
        {
            return 1;
        }
        else if(that.teachingMajor.equalsIgnoreCase(BIGGER_MAJOR))
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
}
