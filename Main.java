public class Main {
    public static void main(String[] args) {
        Publisher jobAgency = new JobAgency();
        Company google = new Company("Google", jobAgency, 120000);
        google.addVacancy(new Vacancy("Software Engineer", Vacancy.VacancyType.IT));
        google.addVacancy(new Vacancy("Product Manager", Vacancy.VacancyType.SALES));
        google.addVacancy(new Vacancy("Office Cleaner", Vacancy.VacancyType.CLEANING));

        Company yandex = new Company("Yandex", jobAgency, 95000);
        yandex.addVacancy(new Vacancy("Data Analyst", Vacancy.VacancyType.IT));
        yandex.addVacancy(new Vacancy("Sales Representative", Vacancy.VacancyType.SALES));
        yandex.addVacancy(new Vacancy("Customer Support", Vacancy.VacancyType.SALES));

        Company geekBrains = new Company("GeekBrains", jobAgency, 98500);
        geekBrains.addVacancy(new Vacancy("Web Developer", Vacancy.VacancyType.IT));
        geekBrains.addVacancy(new Vacancy("Marketing Specialist", Vacancy.VacancyType.SALES));
        geekBrains.addVacancy(new Vacancy("Janitor", Vacancy.VacancyType.CLEANING));


        Student student1 = new Student("Nick Dickson");
        Master master1 = new Master("Walter Copperfield");
        Master master2 = new Master("Grace Park");
        Professional professional1 = new Professional("Arthur Cane");

        jobAgency.registerObserver(student1);
        jobAgency.registerObserver(master1);
        jobAgency.registerObserver(master2);
        jobAgency.registerObserver(professional1);

        for (int i = 0; i < 3; i++) {
            google.needEmployee();
            yandex.needEmployee();
            geekBrains.needEmployee();
        }
    }
}