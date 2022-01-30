public class Ticket {
    private int serialNumber;
    private static int lastSerialNumber = 0;

    public Ticket() {
        lastSerialNumber++;
        serialNumber = lastSerialNumber;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public static int getLastSerialNumber() {
        return lastSerialNumber;
    }
}
