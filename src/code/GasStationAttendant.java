/**
 * GasStationAttendant
 *
 * @author user
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

    @Override
    public double getOverTimePayRate()
    {
        return OVERTIME_PAY_RATE;
    }

    @Override
    public int compareTo(final GasStationAttendant that)
    {
        return (int) (this.numberOfDollarsStolenPerDay - that.numberOfDollarsStolenPerDay);
    }
}
