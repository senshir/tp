package seedu.address.model.person.comparators;

import java.util.Comparator;

import seedu.address.model.person.Person;

/**
 * A comparator that compares {@link Person} objects based on their nric field.
 * The comparison is done using the natural ordering of strings (case-sensitive).
 */
public class NricComparator implements Comparator<Person> {
    /**
     * Compares two Person objects based on their nric.
     *
     * @param a the first Person to compare
     * @param b the second Person to compare
     * @return a negative integer, zero, or a positive integer as the first argument's nric
     *         is less than, equal to, or greater than the second's
     */
    @Override
    public int compare(Person a, Person b) {
        String name1 = a.getName().toString().toLowerCase();
        String name2 = b.getName().toString().toLowerCase();
        return name1.compareTo(name2);
    }
}
