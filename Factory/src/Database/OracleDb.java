package Database;

public class OracleDb implements Database {

    @Override
    public void connect() {
        System.out.println("Connecting to Oracle database ...\n");
    }

    @Override
    public void executeQuery(String query) {
        System.out.println("Oracle is executing query:" +
                "\n" + query + "\n");
    }
}
