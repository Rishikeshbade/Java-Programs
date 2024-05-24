package codingChallenges;

public class Classroom {
	public String registerStudent(Student student) {
        if (!student.name.equals(student.name.toUpperCase())) {
            return "Block letters needed";
        }
        if (student.score < 0 || student.score > 100) {
            return "Invalid score";
        }
        return "Registered";
    }

    public String studentCard(String card) {
        if (!card.matches("[0-9]+")) {
            return "Invalid Card";
        }
        return "Valid card";
    }

}
