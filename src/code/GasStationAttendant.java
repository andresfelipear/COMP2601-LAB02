/**
 * GasStationAttendant
 *
 * @author Andres Arevalo & Marius Guerra
 * @version 1.0
 */
public class GasStationAttendant extends Employee implements Comparable<GasStationAttendant>
{
    private double numberOfDollarsStolenPerDay;

    private static final String     DRESS_CODE  = "uniform";
    private static final String     WORK_VERB   = "pump";
    private static final boolean    IS_PAID_SALARY                       = false;
    private static final boolean    IS_POST_SECONDARY_EDUCATION_REQUIRED = false;
    private static final double OVERTIME_PAY_RATE = 1.5;

    /**
     * Constructs a GasStationAttendant with the specified name and number of dollars stolen per day.
     *
     * @param name The name of the gas station attendant.
     * @param numberOfDollarsStolenPerDay The amount of money stolen per day by the attendant.
     */
    public GasStationAttendant(final String name,
                               final double numberOfDollarsStolenPerDay)
    {
        super(name,
              DRESS_CODE,
              IS_PAID_SALARY,
              IS_POST_SECONDARY_EDUCATION_REQUIRED,
              WORK_VERB);
        this.numberOfDollarsStolenPerDay = numberOfDollarsStolenPerDay;
    }

    /**
     * Gets the overtime pay rate for the gas station attendant, which is OVERTIME_PAY_RATE.
     *
     * @return The overtime pay rate.
     */
    @Override
    public double getOverTimePayRate()
    {
        return OVERTIME_PAY_RATE;
    }

    /**
     * Compares this gas station attendant to another based on the amount of money stolen per day.
     *
     * @param that The other gas station attendant to compare to.
     * @return A negative integer, zero, or a positive integer as this attendant steals less than, equal to,
     *         or more than the specified attendant.
     */
    @Override
    public int compareTo(final GasStationAttendant that)
    {
        return (int) (this.numberOfDollarsStolenPerDay - that.numberOfDollarsStolenPerDay);
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     * GasStationAttendants are considered equal if they steal the same amount of money per day.
     *
     * @param obj The reference object with which to compare.
     * @return true if this object is the same as the obj argument; false otherwise.
     */
    @Override
    public boolean equals(final Object obj)
    {
        final GasStationAttendant that;

        if(this == obj)
        {
            return true;
        }
        if(obj == null || getClass() != obj.getClass())
        {
            return false;
        }

        that = (GasStationAttendant) obj;

        return Double.compare(numberOfDollarsStolenPerDay,
                              that.numberOfDollarsStolenPerDay) == 0;
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
     * Returns a string representation of the gas station attendant.
     *
     * @return A string representation of the gas station attendant.
     */
    @Override
    public String toString()
    {
        return String.format("%s steals %.2f dollars a day",
                             super.getName(),
                             numberOfDollarsStolenPerDay);
    }
}
