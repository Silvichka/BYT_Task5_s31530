package AnalyticsEngines;

import Database.Database;

public abstract class DataAnalyticEngine {

    protected abstract Database createDatabase();

    public void runAnalytics(String query){
        Database db = createDatabase();
        db.connect();
        db.executeQuery(query);
        System.out.println("Analytics is done.");
    }

}
