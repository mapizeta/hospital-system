public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        HospitalConfig config1 = new HospitalConfig();
        HospitalConfig config2 = new HospitalConfig();

        ICURoom room = new ICURoom();

        LegacyMonitor monitor = new LegacyMonitor();

        System.out.println("Sistema iniciado");

        ICURoom ICU = (ICURoom) room.clone();
        ICU.showConfig();
    }
}