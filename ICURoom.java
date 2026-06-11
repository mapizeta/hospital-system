public class ICURoom {
    private String monitor;
    private String alarm;
    private String network;

    public ICURoom() {
        this.monitor = "Heart Monitor";
        this.alarm = "Standard Alarm";
        this.network = "Hospital Network";
    }

    public void showConfig() {
        System.out.println("Monitor: " + monitor);
        System.out.println("Alarm: " + alarm);
        System.out.println("Network: " + network);
    }
}
class Prototype {
    public static void main(String[] args) {
        ICURoomPrototype baseRoom = new ICURoomPrototype();
        try {
            ICURoomPrototype room1 = baseRoom.clone();
            ICURoomPrototype room2 = baseRoom.clone();

            room1.showConfig();
            room2.showConfig();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
