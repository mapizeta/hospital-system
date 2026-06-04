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


//Singelton
//pequeño avance en singelton, falta el adapter y el Prototype.