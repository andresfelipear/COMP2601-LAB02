/**
 * HockeyPlayer
 *
 * @author Andres Arevalo & Marius Guerra
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

    /**
     * Constructs a HockeyPlayer with the specified name and number of goals.
     *
     * @param name The name of the hockey player.
     * @param numberOfGoals The number of goals scored by the hockey player.
     */
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

    /**
     * Gets the overtime pay rate for the hockey player, which is OVERTIME_PAY_RATE.
     *
     * @return The overtime pay rate.
     */
    @Override
    public double getOverTimePayRate()
    {
        return OVERTIME_PAY_RATE;
    }

    /**
     * Compares this hockey player to another based on the number of goals scored.
     *
     * @param that The other hockey player to compare to.
     * @return A negative integer, zero, or a positive integer as this hockey player
     *         has fewer, equal to, or more goals than the specified hockey player.
     */
    @Override
    public int compareTo(final HockeyPlayer that)
    {
        return this.numberOfGoals - that.numberOfGoals;
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     * Hockey players are considered equal if they have the same number of goals.
     *
     * @param obj The reference object with which to compare.
     * @return true if this object is the same as the obj argument; false otherwise.
     */
    @Override
    public boolean equals(final Object obj)
    {
        final HockeyPlayer that;

        if(this == obj)
        {
            return true;
        }
        if(obj == null || getClass() != obj.getClass())
        {
            return false;
        }

        that = (HockeyPlayer) obj;

        return numberOfGoals == that.numberOfGoals;
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
     * Returns a string representation of the hockey player.
     *
     * @return A string representation of the hockey player.
     */
    @Override
    public String toString()
    {
        return String.format("%s scored %d goals",
                                super.getName(),
                                numberOfGoals);
    }
}
