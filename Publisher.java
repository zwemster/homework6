public interface Publisher {
    void sendOffer(String companyName, double salary);
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
}
