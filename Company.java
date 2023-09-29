import java.util.Random;

public class Company {

    //region Private Fields

    private Random random = new Random();
    private String name;
    private Publisher jobAgency;
    private double maxSalary;

    //endregion

    //region Constructors

    public Company(String name, Publisher jobAgency, double maxSalary) {
        this.name = name;
        this.jobAgency = jobAgency;
        this.maxSalary = maxSalary;
    }

    //endregion

    //region Public Methods

    public void needEmployee() {
        double salary = random.nextDouble(maxSalary);
        jobAgency.sendOffer(name, salary);
    }

    //endregion
}
