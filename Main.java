public class Main {

    public static void main(String[] args) {

        HospitalConfigSingleton configGlobal = HospitalConfigSingleton.getInstance();

        ICURoomPrototype room = new ICURoomPrototype();

        LegacyMonitor monitor = new LegacyMonitor();

        System.out.println("Sistema iniciado");
    }
}