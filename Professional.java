public class Professional implements Observer{

    //region Private Fields

    private String name;
    private double salary = 55500;

    //endregion

    //region Constructors

    public Professional(String name) {
        this.name = name;
    }


    //endregion

    //region Overrided Methods

    @Override
    public void receiveOffer(String nameCompany, double salary) {
        if (this.salary <= salary) {
            System.out.printf("Professional %s: I need this job! (company: %s, salary: %.2f\n",
                    name, nameCompany, salary);
            this.salary = salary;
        } else {
            System.out.printf("Professional %s: I'll find a better job! (company: %s, salary: %.2f\n",
                    name, nameCompany, salary);
        }
    }

    @Override
    public boolean interestedInVacancy(Vacancy.VacancyType type) {
        return type == Vacancy.VacancyType.SALES;
    }

    //endregion
}
