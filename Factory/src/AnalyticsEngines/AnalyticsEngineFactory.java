package AnalyticsEngines;

import Enums.DatabaseType;

public class AnalyticsEngineFactory {

    public static DataAnalyticEngine createEngine(DatabaseType type){
        return switch (type) {
            case DatabaseType.MySQL -> new MySqlAnalyticsEngine();
            case DatabaseType.Oracle -> new OracleAnalyticsEngine();
            default -> throw new IllegalArgumentException("Unsupported database type!");
        };
    }

}
