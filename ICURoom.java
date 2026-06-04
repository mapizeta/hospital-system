

public class ICURoom implements Cloneable {
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
    


    @Override
    public ICURoom clone() throws CloneNotSupportedException {
        return (ICURoom) super.clone();
    }


}
