public class Vacancy {

    //region Private Fields

    private String title;
    private VacancyType type;

    //endregion

    //region Constructors

    public Vacancy(String title, VacancyType type) {
        this.title = title;
        this.type = type;
    }

    //endregion

    //region Getters

    public String getTitle() {
        return title;
    }

    public VacancyType getType() {
        return type;
    }

    //endregion

    //region Enum Area

    public enum VacancyType {
        IT,
        SALES,
        CLEANING
    }

    //endregion
}
