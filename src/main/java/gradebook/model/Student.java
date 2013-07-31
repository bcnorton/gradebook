package gradebook.model;


/**
 * Represents a student in a section, can add gradebook items
 * can also calculate average score using a grading
 * scheme and letter grade of student
 */
public class Student {
    private String name;
    private Section section;
    private SampleGradingScheme gradingScheme;
    private GradebookListDAO studentsGrades;
    public Student(String name, Section section) {
        this.name = name;
        this.section = section;
        studentsGrades = new GradebookListDAO();
        gradingScheme = new SampleGradingScheme(this);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Section getSection() {
        return section;
    }
    public void setSection(Section section) {
        this.section = section;
    }
    public GradebookListDAO getStudentsGrades() {
        return studentsGrades;
    }
    public void setStudentsGrades(GradebookListDAO studentsGrades) {
        this.studentsGrades = studentsGrades;
    }
    public void addGradebookItem(GradebookItem grade) {
        studentsGrades.add(grade);
    }
    public double getAverageScore() {
        double avgScore = gradingScheme.averageScore(this);
        return avgScore;
    }
    public char getLetterGrade() {
        char letterGrade = gradingScheme.letterGrade(this.getAverageScore());
        return letterGrade;
    }
    public SampleGradingScheme getGradingScheme() {
        return gradingScheme;
    }
    public void setGradingScheme(SampleGradingScheme gradingScheme) {
        this.gradingScheme = gradingScheme;
    }
}
