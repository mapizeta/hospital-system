public class Main {

    public static void main(String[] args) {

        //Singleton
        HospitalConfig config1 = HospitalConfigSingleton.getInstance();
        HospitalConfig config2 = HospitalConfigSingleton.getInstance();

        //Prototype
        ICURoom room = new ICURoom();
        ICURoomCloneable roomCloneable = new ICURoomCloneable();
        ICURoomCloneable roomClone = roomCloneable.clone();


        DeviceManager manager = new DeviceManager();
        LegacyMonitor monitorViejo = new LegacyMonitor();
        
        managermanager
        MedicalDevice adaptedMonitor = new LegacyMonitorAdapter(monitorViejo);
        
        manager.connectDevice(adaptedMonitor);


    
        LegacyMonitor monitor = new LegacyMonitor();}

        System.out.println("Sistema iniciado");
    }
}