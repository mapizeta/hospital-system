public class LegacyMonitor {
    public void establishConnection() {
        System.out.println("Legacy connection established");
    }

    public void transmitInformation() {
        System.out.println("Sending medical data");
    }
    
    interace MedicalDivice{
        void connect();
        void sendData();
    }
}
class LegacyMonitorAdapter implements MedicalDevice {
    private LegacyMonitor legacyMonitor;

    public LegacyMonitorAdapter(LegacyMonitor legacyMonitor) {
        this.legacyMonitor = legacyMonitor;
    }

    @Override
    public void connect() {
        legacyMonitor.establishConnection();
    }

    @Override
    public void sendData() {
        legacyMonitor.transmitInformation();
    }
}

class Adapter {
    public static void main(String[] args) {
        LegacyMonitor legacyMonitor = new LegacyMonitor();
        MedicalDevice monitorAdapter = new LegacyMonitorAdapter(legacyMonitor);

        DeviceManager manager = new DeviceManager();
        manager.connectDevice(monitorAdapter);
    }
}
