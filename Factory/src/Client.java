import AnalyticsEngines.AnalyticsEngineFactory;
import AnalyticsEngines.DataAnalyticEngine;
import Enums.DatabaseType;

public class Client {

    public static void main(String[] args) {

        DataAnalyticEngine engine = AnalyticsEngineFactory.createEngine(DatabaseType.MySQL);

        engine.runAnalytics("SELECT * FROM emp;");

    }

}
