public interface Observer {
    void receiveOffer(String nameCompany, double salary);
    boolean interestedInVacancy(Vacancy.VacancyType type);
}
