import java.util.HashMap;
import java.util.Map;

//Class:MyStudent
public class MyStudent {
    //private fields
    private String ID;
    private String firstName;
    private String lastName;
    private double totalGradePoints;
    private int credits;

    // constant defining letter grade to grade point map
    private final Map<String, Double> GRADE_MAP = getGradeMap();

    /**
     * constructor
     * @param ID
     * @param firstName
     * @param lastName
     * @param totalGradePoints
     * @param credits
     */
    public MyStudent(String ID, String firstName, String lastName, 
    double totalGradePoints, int credits) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalGradePoints = totalGradePoints;
        this.credits = credits;
    }

    // get ID
    public String getID() {
        return ID;
    }

    // get first name
    public String getFirstName() {
        return firstName;
    }

    // get last name
    public String getLastName() {
        return lastName;
    }

    // get GPA
    public double getGPA() {
        return totalGradePoints / credits;
    }

    // this will be used for populating GRADE_MAP
    private final Map<String,Double> getGradeMap() {
        Map<String, Double> gradeMap = new HashMap<String,Double>();
        gradeMap.put("A", 4.00);
        gradeMap.put("A-", 3.67);
        gradeMap.put("B+", 3.33);
        gradeMap.put("B", 3.00);
        gradeMap.put("B-", 2.67);
        gradeMap.put("C+", 2.33);
        gradeMap.put("C", 2.00);

        return gradeMap;
    }

    // method takeClass
    public void takeClass(int numberOfCredits, String letterGrade) {  
        double grade = GRADE_MAP.get(letterGrade);
        this.credits += numberOfCredits;
        this.totalGradePoints += numberOfCredits * grade;
    }
}