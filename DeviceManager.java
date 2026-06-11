public class DeviceManager {
    public void connectDevice(MedicalDevice device) {
        device.connect();
        device.sendData();
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

// Clase de demostración agregada
class Adapter {
    public static void main(String[] args) {
        LegacyMonitor legacyMonitor = new LegacyMonitor();
        MedicalDevice monitorAdapter = new LegacyMonitorAdapter(legacyMonitor);

        DeviceManager manager = new DeviceManager();
        manager.connectDevice(monitorAdapter);
    }
}
