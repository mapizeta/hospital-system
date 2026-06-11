import java.util.logging.Logger;

public class HospitalConfig {

    private String hospitalName;
    private String databaseUrl;

    public HospitalConfig() {
        this.hospitalName = "Hospital Central";
        this.databaseUrl = "localhost";
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public String getDatabaseUrl() {
        return databaseUrl;
    }

}

public class Logger{
    private static Logger instance;

    private Logger() {}

    public static Logger getInstance{
        if (instance == null);
            instance = new Logger();
}
       return instance;


class Singleton {
    public static void main(String[] args) {
        HospitalConfig config1 = HospitalConfigSingleton.getInstance();
        HospitalConfig config2 = HospitalConfigSingleton.getInstance();

        System.out.println("Hospital: " + config1.getHospitalName());
        System.out.println("DB: " + config1.getDatabaseUrl());
        System.out.println("¿Es la misma instancia? " + (config1 == config2));
    }
}
