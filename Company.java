import java.util.Random;

public class Company {

    //region Private Fields

    private Random random = new Random();
    private String name;
    private JobAgency jobAgency;
    private double maxSalary;

    //endregion

    //region Constructors

    public Company(String name, JobAgency jobAgency, double maxSalary) {
        this.name = name;
        this.jobAgency = jobAgency;
        this.maxSalary = maxSalary;
    }

    //endregion
}
