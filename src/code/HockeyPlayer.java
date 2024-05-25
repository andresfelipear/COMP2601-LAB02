/**
 * HockeyPlayer
 *
 * @author user
 * @version 1.0
 */
public class HockeyPlayer extends Employee implements Comparable<HockeyPlayer>
{
    private int numberOfGoals;

    private static final String     DRESS_CODE  = "jersey";
    private static final String     WORK_VERB   = "play";
    private static final boolean    IS_PAID_SALARY                       = true;
    private static final boolean    IS_POST_SECONDARY_EDUCATION_REQUIRED = false;
    private static final double     OVERTIME_PAY_RATE = 0.0;

    public HockeyPlayer(final String name,
                        final int numberOfGoals)
    {
        super(name,
              DRESS_CODE,
              IS_PAID_SALARY,
              IS_POST_SECONDARY_EDUCATION_REQUIRED,
              WORK_VERB);
        this.numberOfGoals = numberOfGoals;
    }

    @Override
    public double getOverTimePayRate()
    {
        return OVERTIME_PAY_RATE;
    }

    @Override
    public boolean equals(final Object obj)
    {
        return super.equals(obj);
    }

    @Override
    public int compareTo(final HockeyPlayer that)
    {
        return this.numberOfGoals - that.numberOfGoals;
    }
}
