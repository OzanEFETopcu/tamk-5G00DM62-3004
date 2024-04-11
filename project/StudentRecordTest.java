import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class StudentRecordTest {

    @Test
    public void testCalculateAverageGrade1() {
        StudentRecord record = new StudentRecord();
        double[] grades = { 80, 90, 85, 75 };
        double expected = 82.5;
        assertEquals(expected, record.calculateAverageGrade(grades), 0.001);
    }

    @Test
    public void testCalculateAverageGrade2() {
        StudentRecord record = new StudentRecord();
        double[] grades = { 70, 65, 75 };
        double expected = 70;
        assertEquals(expected, record.calculateAverageGrade(grades), 0.001);
    }

    @Test
    public void testCalculateAverageGrade3() {
        StudentRecord record = new StudentRecord();
        double[] grades = { 100, 90 };
        double expected = 95;
        assertEquals(expected, record.calculateAverageGrade(grades), 0.001);
    }

    @Test
    public void testFindHighestGrade1() {
        StudentRecord record = new StudentRecord();
        double[] grades = { 80, 90, 85, 75 };
        double expected = 90;
        assertEquals(expected, record.findHighestGrade(grades), 0.001);
    }

    @Test
    public void testFindHighestGrade2() {
        StudentRecord record = new StudentRecord();
        double[] grades = { 70, 65, 75 };
        double expected = 75;
        assertEquals(expected, record.findHighestGrade(grades), 0.001);
    }

    @Test
    public void testFindHighestGrade3() {
        StudentRecord record = new StudentRecord();
        double[] grades = { 100, 90 };
        double expected = 100;
        assertEquals(expected, record.findHighestGrade(grades), 0.001);
    }

    @Test
    public void testFindLowestGrade1() {
        StudentRecord record = new StudentRecord();
        double[] grades = { 80, 90, 85, 75 };
        double expected = 75;
        assertEquals(expected, record.findLowestGrade(grades), 0.001);
    }

    @Test
    public void testFindLowestGrade2() {
        StudentRecord record = new StudentRecord();
        double[] grades = { 70, 65, 75 };
        double expected = 65;
        assertEquals(expected, record.findLowestGrade(grades), 0.001);
    }

    @Test
    public void testFindLowestGrade3() {
        StudentRecord record = new StudentRecord();
        double[] grades = { 100, 90 };
        double expected = 90;
        assertEquals(expected, record.findLowestGrade(grades), 0.001);
    }

    @Test
    public void testIsPass1() {
        StudentRecord record = new StudentRecord();
        double grade = 60;
        double passingGrade = 50;
        assertTrue(record.isPass(grade, passingGrade));
    }

    @Test
    public void testIsPass2() {
        StudentRecord record = new StudentRecord();
        double grade = 40;
        double passingGrade = 50;
        assertFalse(record.isPass(grade, passingGrade));
    }

    @Test
    public void testCalculateGPA1() {
        StudentRecord record = new StudentRecord();
        double[] grades = { 80, 90, 85, 75 };
        double[] scale = { 4, 4, 3, 3 };
        double expected = 82.85714;
        assertEquals(expected, record.calculateGPA(grades, scale), 0.001);
    }

    @Test
    public void testCalculateGPA2() {
        StudentRecord record = new StudentRecord();
        double[] grades = { 70, 65, 75 };
        double[] scale = { 4, 4, 3 };
        double expected = 69.5454;
        assertEquals(expected, record.calculateGPA(grades, scale), 0.001);
    }

    @Test
    public void testCalculateGPA3() {
        StudentRecord record = new StudentRecord();
        double[] grades = { 100, 90 };
        double[] scale = { 4, 4 };
        double expected = 95.0;
        assertEquals(expected, record.calculateGPA(grades, scale), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalculateGPADifferentLengths() {
        StudentRecord record = new StudentRecord();
        double[] grades = { 80, 90, 85 };
        double[] scale = { 4, 4, 3, 3 }; // Different lengths
        double expected = -1; // We expect -1 as an indicator of an error
        assertEquals(expected, record.calculateGPA(grades, scale), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalculateAverageGradeWithEmptyArray() {
        StudentRecord record = new StudentRecord();
        record.calculateAverageGrade(new double[]{});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindHighestGradeWithEmptyArray() {
        StudentRecord record = new StudentRecord();
        record.findHighestGrade(new double[]{});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindLowestGradeWithEmptyArray() {
        StudentRecord record = new StudentRecord();
        record.findLowestGrade(new double[]{});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalculateGPAWithDifferentLengthArrays() {
        StudentRecord record = new StudentRecord();
        record.calculateGPA(new double[]{80, 90, 75}, new double[]{4.0, 3.0});
    }
}

// End of file
