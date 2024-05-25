/**
 * Employable
 *
 * @author Andres Arevalo & Marius Guerra
 * @version 1.0
 */
public interface Employable
{
    String getDressCode();
    boolean isPaidSalary();
    boolean postSecondaryEducationRequired();
    String getWorkVerb();
    default public boolean getsPaid()
    {
        return true;
    }

}
