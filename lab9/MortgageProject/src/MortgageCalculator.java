import java.time.LocalDate;
import java.time.Period;

public class MortgageCalculator {

	private int getAge(int yearOfBirt, int month, int day) {
		LocalDate today = LocalDate.now(); // Today's date
		LocalDate birthday = LocalDate.of(yearOfBirt, month, day); // Birth date
		Period p = Period.between(birthday, today);
		return p.getYears();
	}

	private boolean isADeveloperOrArchitectOrScrumMaster(String profession) {
		return profession.equals("Developer") || profession.equals("Architect") || profession.equals("Scrum master");
	}
	private boolean isATesterOrSystemAdministratorOrTechnicalWriter(String profession) {
		return profession.equals("Tester") || profession.equals("System Administrator") || profession.equals("Technical writer");
	}
	private boolean isADepartmentHeadOrProfessor(String profession) {
		return profession.equals("Department head") || profession.equals("Professor");
	}
	public double computeMaxMortgage(int yearOfBirth, int month, int day, double monthlyIncome, boolean married,
			double monthlyIncomePartner, String profession) {
		int age = getAge(yearOfBirth, month, day);
		if (age < 18)
			return 0;
		if (!married) {
			if (2000 <= monthlyIncome && monthlyIncome < 3000) {
				if (isADeveloperOrArchitectOrScrumMaster(profession))
					return 160000;
				if (isATesterOrSystemAdministratorOrTechnicalWriter(profession))
					return 120000;
				if (isADepartmentHeadOrProfessor(profession))
					return 220000;
			}
			if (3000 <= monthlyIncome && monthlyIncome < 5000) {
				if (isADeveloperOrArchitectOrScrumMaster(profession))
					return 180000;
				if (isATesterOrSystemAdministratorOrTechnicalWriter(profession))
					return 140000;
				if (isADepartmentHeadOrProfessor(profession))
					return 250000;
			}
			if (5000 <= monthlyIncome) {
				if (isADeveloperOrArchitectOrScrumMaster(profession))
					return 220000;
				if (isATesterOrSystemAdministratorOrTechnicalWriter(profession))
					return 160000;
				if (isADepartmentHeadOrProfessor(profession))
					return 280000;
			}
		} else {
			double totalIncome = monthlyIncome + monthlyIncomePartner * 0.94;
			if (2000 <= totalIncome && totalIncome < 3000) {
				if (isADeveloperOrArchitectOrScrumMaster(profession))
					return 160000;
				if (isATesterOrSystemAdministratorOrTechnicalWriter(profession))
					return 120000;
				if (isADepartmentHeadOrProfessor(profession))
					return 220000;
			}
			if (3000 <= totalIncome && totalIncome < 5000) {
				if (isADeveloperOrArchitectOrScrumMaster(profession))
					return 180000;
				if (isATesterOrSystemAdministratorOrTechnicalWriter(profession))
					return 140000;
				if (isADepartmentHeadOrProfessor(profession))
					return 250000;
			}
			if (5000 <= totalIncome) {
				if (isADeveloperOrArchitectOrScrumMaster(profession))
					return 220000;
				if (isATesterOrSystemAdministratorOrTechnicalWriter(profession))
					return 160000;
				if (isADepartmentHeadOrProfessor(profession))
					return 280000;
			}
		}
		return 0;
	}

}
