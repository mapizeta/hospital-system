public class HospitalConfigSingleton {
    private static HospitalConfig instance;
    private HospitalConfigSingleton() {}
    public static HospitalConfig getInstance() {
        if (instance == null) {
            instance = new HospitalConfig();
        }
        return instance;
    }
}
