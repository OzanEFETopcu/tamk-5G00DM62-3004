/**
 * A class representing a student's academic record.
 */
public class StudentRecord {

    /**
     * Calculates the average grade from an array of grades.
     *
     * @param grades an array of student grades
     * @return the average grade
     */
    public double calculateAverageGrade(double[] grades) {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }

    /**
     * Finds the highest grade from an array of grades.
     *
     * @param grades an array of student grades
     * @return the highest grade
     */
    public double findHighestGrade(double[] grades) {
        double max = Double.MIN_VALUE;
        for (double grade : grades) {
            if (grade > max) {
                max = grade;
            }
        }
        return max;
    }

    /**
     * Finds the lowest grade from an array of grades.
     *
     * @param grades an array of student grades
     * @return the lowest grade
     */
    public double findLowestGrade(double[] grades) {
        double min = Double.MAX_VALUE;
        for (double grade : grades) {
            if (grade < min) {
                min = grade;
            }
        }
        return min;
    }

    /**
     * Checks if a student passed based on a passing grade threshold.
     *
     * @param grade        the student's grade
     * @param passingGrade the passing grade threshold
     * @return true if the student passed, otherwise false
     */
    public boolean isPass(double grade, double passingGrade) {
        return grade >= passingGrade;
    }

    /**
     * Calculates the GPA (Grade Point Average) based on a scale.
     *
     * @param grades an array of student grades
     * @param scale  the scale used for GPA calculation
     * @return the GPA
     */
    public double calculateGPA(double[] grades, double[] scale) {
        double totalPoints = 0;
        double totalCredits = 0;
        if (grades.length != scale.length) {
            return -1;
        } else {
            for (int i = 0; i < grades.length; i++) {
                totalPoints += grades[i] * scale[i];
                totalCredits += scale[i];
            }
            return totalPoints / totalCredits;
        }

    }
}

// End of file
