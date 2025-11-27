package AnalyticsEngines;

import Database.Database;
import Database.MySqlDb;

public class MySqlAnalyticsEngine extends DataAnalyticEngine{

    @Override
    protected Database createDatabase(){
        return new MySqlDb();
    }

}
