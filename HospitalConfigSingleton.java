public class HospitalConfigSingleton {

    private static HospitalConfig instance;

    private String hospitalName;
    private String databaseUrl;

    private HospitalConfig() {
        this.hospitalName = "Hospital Central";
        this.databaseUrl = "localhost";
    }
    
    public static HospitalConfig getInstance() {
        if (instance == null) {
            instance = new HospitalConfig();
        }
        return instance;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public String getDatabaseUrl() {
        return databaseUrl;
    }
}