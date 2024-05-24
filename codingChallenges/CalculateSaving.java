package codingChallenges;

public class CalculateSaving {
	 public static int calculateSal(int salary, int shifts) {
	        if (salary > 8000) {
	            System.out.println("Salary too large");
	            return -1;
	        } else if (salary < 0) {
	            System.out.println("Salary too small");
	            return -1;
	        } else if (shifts < 0) {
	            System.out.println("Shifts too small");
	            return -1;
	        } else {
	            double foodExpense = 0.2 * salary;
	            double travelExpense = 0.3 * salary;
	            double shiftBonus = 0.02 * salary * shifts;
	            double totalExpense = foodExpense + travelExpense;
	            double saving = salary - totalExpense + shiftBonus;
	            return (int) saving;
	        }
	    }
		public static void main(String[] args) {
	        int salary = 7000;
	        int shifts = 5;
	        int saving = calculateSal(salary, shifts);
	        System.out.println(saving);

	}

}
