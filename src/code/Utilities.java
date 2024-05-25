/**
 * Utilities
 *
 * @author Andres Arevalo & Marius Guerra
 * @version 1.0
 */
public class Utilities
{
    /**
     * Checks if a string is valid (not null and not blank).
     *
     * @param str The string to be checked.
     * @return true if the string is valid, false otherwise.
     */
    public static boolean isValidString(final String str)
    {
        return str != null && !str.isBlank();
    }
}
