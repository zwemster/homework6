import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Company {

    //region Private Fields

    private Random random = new Random();
    private String name;
    private Publisher jobAgency;
    private double maxSalary;

    //endregion

    //region Collections

    private List<Vacancy> vacancies = new ArrayList<>();

    //endregion

    //region Constructors

    public Company(String name, Publisher jobAgency, double maxSalary) {
        this.name = name;
        this.jobAgency = jobAgency;
        this.maxSalary = Math.max(1, maxSalary);
    }

    //endregion

    //region Public Methods

    public void needEmployee() {
        if (!vacancies.isEmpty()) {
            Vacancy vacancy = vacancies.get(random.nextInt(vacancies.size()));
            double salary = random.nextDouble(maxSalary);
            jobAgency.sendOffer(name, vacancy, salary);
        } else {
            System.out.println("No vacancies available in " + name);
        }
    }

    public void addVacancy(Vacancy vacancy) {
        vacancies.add(vacancy);
    }

    //endregion
}
