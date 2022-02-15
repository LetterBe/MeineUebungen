package de.neuefische.alarm;

public class Alarm {

    /*private static final String WARNING_MESSAGE = "Zu viele Personen";
    private static final String OK_MESSAGE = "Maximale Personenzahl nicht überschritten";*/

    public static String checkNumberOfCustomers(int numberOfCustomers,Type alarm ) {
       /* switch (alarm) {
            case ROT:
                return checkCustomers(numberOfCustomers, 0);
            case GELB:
                return checkCustomers(numberOfCustomers, 30);
            case GRÜN:
                return checkCustomers(numberOfCustomers, 60);
            default:
                return "unknown alarm level";
        }*/
       // return checkCustomers(numberOfCustomers, alarm.getS());
        return alarm.checkCustomers(numberOfCustomers);
    }



    /*private static String checkCustomers(int numberOfCustomers, int maxNumberOfCustomers) {
        if (numberOfCustomers > maxNumberOfCustomers) {
            return WARNING_MESSAGE;
        }
        return OK_MESSAGE;
    }*/

}
