package Database;

public interface Database {
    void connect();
    void executeQuery(String query);
}
