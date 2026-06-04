public class HospitalConfigSingleton {

    private static HospitalConfigSingleton instance;
    private String hospitalName;
    private String databaseUrl;
    

    private HospitalConfigSingleton(){
        this.hospitalName = "Hospital Central";
        this.databaseUrl = "localhost";

    }

    public static HospitalConfigSingleton getInstance(){
        if (instance == null){
            instance = new HospitalConfigSingleton();

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