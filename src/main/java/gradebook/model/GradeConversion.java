package gradebook.model;

/**
 * converts a letter grade to a gpa value
 * converst a gpa value to a letter grade
 */
public class GradeConversion {
    static final double AVALUE = 4;
    static final double BVALUE = 3;
    static final double CVALUE = 2;
    static final double DVALUE = 1;
    static final double FVALUE = 0;

    public static double letterGradeToGPA(char letterGrade) {
        if (letterGrade == 'A') {
            return AVALUE;
        }
        if (letterGrade == 'B') {
            return BVALUE;
        }
        if (letterGrade == 'C') {
            return CVALUE;
        }
        if (letterGrade == 'D') {
            return DVALUE;
        }
        return FVALUE;
    }
    public static char gpaToLetterGrade(double gpa) {
        if (gpa == AVALUE) {
            return 'A';
        }
        if (gpa <= AVALUE && gpa > BVALUE) {
            return 'B';
        }
        if (gpa < BVALUE && gpa >= CVALUE) {
            return 'C';
        }
        if (gpa < CVALUE && gpa >= DVALUE) {
            return 'D';
        }
        return 'F';
    }
}
