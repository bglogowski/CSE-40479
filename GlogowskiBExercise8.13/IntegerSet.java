/*
 * IntegerSet.java
 */

/**
 *
 * @author Bryan Glogowski
 */
public class IntegerSet {

    public boolean[] set;

    /**
     * Creates a new instance of IntegerSet
     */
    public IntegerSet() {
        int index = 0;
        this.set = new boolean[101];

        while (index < this.set.length) {
            this.set[index] = false;
        }
        
    }

    public IntegerSet(boolean[] set) {
        this.set = set;
    }

    /**
     * Return a new IntegerSet containing the union of the two IntegerSet objects
     * passed as arguments
     */
    public static IntegerSet union(IntegerSet firstSet, IntegerSet secondSet) {

        boolean[] returnArray = new boolean[101];
        boolean[] firstArray = firstSet.getSet();
        boolean[] secondArray = secondSet.getSet();

        for (int i = 0; i < returnArray.length; i++) {
            if (firstArray[i] || secondArray[i]) {
                returnArray[i] = true;
            } else {
                returnArray[i] = false;
            }
        }
        IntegerSet returnSet = new IntegerSet(returnArray);
        return returnSet;

    }

    /**
     * Return a new IntegerSet containing the intersection of the two IntegerSet
     * objects passed as arguments
     */

    public static IntegerSet intersection(IntegerSet firstSet, IntegerSet secondSet) {

        boolean[] returnArray = new boolean[101];
        boolean[] firstArray = firstSet.getSet();
        boolean[] secondArray = secondSet.getSet();

        for (int i = 0; i < returnArray.length; i++) {
            if (firstArray[i] && secondArray[i]) {
                returnArray[i] = true;
            } else {
                returnArray[i] = false;
            }
        }

        IntegerSet returnSet = new IntegerSet(returnArray);
        return returnSet;

    }

    /**
     * Inserts an element into the IntegerSet by setting the corresponding value
     * within the set array to true. Returns false if the value was out of range and
     * true otherwise.
     */
    public boolean insertElement(int index) {
        if ((index < 0) || (index > 100)) {
            return false;
        } else {
            this.set[index] = true;
        }
        return true;
    }

    /**
     * Deletes an element from the IntegerSet by setting the corresponding value
     * within the set array to false. Returns false if the value was out of range
     * and true otherwise.
     */
    public boolean deleteElement(int index) {
        if ((index < 0) || (index > 100)) {
            return false;
        } else {
            this.set[index] = false;
        }
        return true;
    }

    /**
     * @Override the toString method in the Object class Displays the integers
     *           contained by the IntegerSet separated by spaces. An empty set
     *           should be displayed as: { --- } An integer set containing 5 and 10
     *           should be displayed as: { 5 10 }
     */
    public String toString() {
        boolean isEmptySet = true;
        String returnString = "{ ";

        for (int i = 0; i < this.set.length; i++) {
            if (this.set[i] == true) {
                returnString += Integer.toString(i) + " ";
                isEmptySet = false;
            }
        }
        if (isEmptySet)
            returnString += "--- ";
        returnString += "}";
        return returnString;
    }

    /**
     * Returns true if the current IntegerSet contains the same integers as the
     * IntegerSet supplied as an argument
     */
    public boolean isEqualTo(IntegerSet otherSet) {
        boolean isEqual = true;
        boolean[] otherArray = otherSet.getSet();
        for (int i = 0; i < this.set.length; i++) {
            if (this.set[i] != otherArray[i])
                isEqual = false;
        }
        return isEqual;
    }

    public boolean[] getSet() {
        return this.set;
    }
}