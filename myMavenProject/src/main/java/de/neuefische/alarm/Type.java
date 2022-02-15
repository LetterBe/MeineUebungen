package de.neuefische.alarm;

public enum Type {
    ROT(0),
    GELB(30),
    GRÜN(60);

    private final int s;

    Type(int s) {
        this.s = s;
    }

    public int getS() {
        return s;
    }
    private static final String WARNING_MESSAGE = "Zu viele Personen";
    private static final String OK_MESSAGE = "Maximale Personenzahl nicht überschritten";

    public String checkCustomers(int numberOfCustomers) {
        if (numberOfCustomers > s) {
            return WARNING_MESSAGE;
        }
        return OK_MESSAGE;
    }
}




