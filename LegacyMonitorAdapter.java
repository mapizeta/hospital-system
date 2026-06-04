public class LegacyMonitorAdapter implements MedicalDevice {
    private LegacyMonitor legacyMonitor;

    public LegacyMonitorAdapter(LegacyMonitor legacyMonitor) {
        this.legacyMonitor = legacyMonitor;
    }

    @Override
    public void connect() {
        // Traduce la llamada al método del monitor heredado
        legacyMonitor.establishConnection();
    }

    @Override
    public void sendData() {
        // Traduce la llamada al método del monitor heredado
        legacyMonitor.transmitInformation();
    }
}