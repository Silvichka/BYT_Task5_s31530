package AnalyticsEngines;

import Database.Database;
import Database.OracleDb;

public class OracleAnalyticsEngine extends DataAnalyticEngine{

    @Override
    protected Database createDatabase(){
        return new OracleDb();
    }

}
