public class Master implements Observer{

    //region Private Fields
    private String name;
    private double salary = 80000;

    //endregion

    //region Constructors

    public Master(String name) {
        this.name = name;
    }

    //endregion

    //region Overrided Methods

    @Override
    public void receiveOffer(String nameCompany, double salary) {
        if (this.salary <= salary) {
            System.out.printf("Master %s: I need this job! (company: %s, salary: %.2f\n",
                    name, nameCompany, salary);
            this.salary = salary;
        }
        else {
            System.out.printf("Master %s: I'll find a better job! (company: %s, salary: %.2f\n",
                    name, nameCompany, salary);
        }
    }

    //endregion
}
