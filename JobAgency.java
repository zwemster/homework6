import java.util.ArrayList;
import java.util.List;

public class JobAgency implements Publisher{

    //region Collections

    List<Observer> observers = new ArrayList<>();

    //endregion

    //region Overrided Methods

    @Override
    public void sendOffer(String companyName, Vacancy vacancy, double salary) {
        for (Observer observer : observers) {
            if (observer.interestedInVacancy(vacancy.getType())) {
                observer.receiveOffer(companyName, salary);
            }
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    //endregion
}
