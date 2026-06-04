public class DeviceManager {
    public void connectDevice(MedicalDevice device) {
        device.connect();
        device.sendData();
    }

    interface MedicalDevice {
        void connect();
        void sendData();
    }

    public void connectICURoom(ICURoom room) {
        room.showConfig();
    }

    public void connectLegacyDevice(LegacyMonitor legacyMonitor) {
        legacyMonitor.establishConnection();
        legacyMonitor.transmitInformation();
    }
}
