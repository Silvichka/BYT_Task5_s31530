package Database;

public class MySqlDb implements Database {

    @Override
    public void connect(){
        System.out.println("Connecting to MySQL database ...\n");
    }

    @Override
    public void executeQuery(String query){
        System.out.println("MySQL is executing query:" +
                "\n" + query + "\n");
    }

}
