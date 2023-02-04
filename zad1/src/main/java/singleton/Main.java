package singleton;

public class Main {
    public static void main(String[] args) {
        DataSource dataSource = DataSource.getDataSource();

        DataSource dataSource1 = DataSource.getdataSource();
    }
}
