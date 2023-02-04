package singleton;

public class DataSource {

    private DataSource dataSource;

    public DataSource getDataSource;{
        if (dataSource == null) {
            dataSource = new DataSource();
        }
        return dataSource;
    }



    //połączenie z bazą danych
}
