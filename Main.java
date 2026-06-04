public class Main {

    public static void main(String[] args) {

        HospitalConfig config1 = new HospitalConfig();
        //aqui se debe usar singleton

        HospitalConfig config2 = new HospitalConfig();

        ICURoom room = new ICURoom();

        LegacyMonitor monitor = new LegacyMonitor();

        System.out.println("Sistema iniciado");
    }

}