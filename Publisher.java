public interface Publisher {
    void sendOffer(String companyName, Vacancy vacancy, double salary);
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
}
