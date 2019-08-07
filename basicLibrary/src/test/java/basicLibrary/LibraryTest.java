/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basicLibrary;

import org.junit.Test;

import static basicLibrary.Library.*;
import static org.junit.Assert.*;

public class LibraryTest {
    @Test public void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }

    @Test
    public void testRoll(){
        assertArrayEqual("Six sided die is rolled, random value must be printed", new int[] {3,2,1,4}, roll(4));
    }

    private void assertArrayEqual(String s, int[] ints, int[] roll) {
    }


    @Test
    public void testContainsDuplicates_false() {
        assertTrue("Array should have no duplicates", Library.containsDuplicates(new int[] {1,2,2,3}));
    }
    @Test
    public void testContainsDuplicates() {
        assertFalse("Array should have no duplicates asserttrue", Library.containsDuplicates(new int[] {1,2,3,4}));
    }
}
