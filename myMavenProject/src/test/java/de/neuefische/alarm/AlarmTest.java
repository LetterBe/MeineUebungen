package de.neuefische.alarm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AlarmTest {

    @Test
    void testThatNumberOfPeopleIsNotYetReached_yellow() {
        assertEquals("Maximale Personenzahl nicht überschritten", Alarm.checkNumberOfCustomers(15, Type.GELB));
    }

    @Test
    void testThatNumberOfPeopleIsIsExactlyReached_yellow() {
        assertEquals("Maximale Personenzahl nicht überschritten", Alarm.checkNumberOfCustomers(30, Type.GELB));
    }

    @Test
    void testThatNumberOfPeopleIsIsTooHigh_yellow() {
        assertEquals("Zu viele Personen", Alarm.checkNumberOfCustomers(31, Type.GELB));
    }

    @Test
    void testThatNumberOfPeopleIsNotYetReached_green() {
        assertEquals("Maximale Personenzahl nicht überschritten", Alarm.checkNumberOfCustomers(45, Type.GRÜN));
    }

    @Test
    void testThatNumberOfPeopleIsIsExactlyReached_green() {
        assertEquals("Maximale Personenzahl nicht überschritten", Alarm.checkNumberOfCustomers(60, Type.GRÜN));
    }

    @Test
    void testThatNumberOfPeopleIsIsTooHigh_green() {
        assertEquals("Zu viele Personen", Alarm.checkNumberOfCustomers(61, Type.GRÜN));
    }

    @Test
    void testThatNoOneIsAllowedWhenAlarmLevelIsRed() {
        assertEquals("Zu viele Personen", Alarm.checkNumberOfCustomers(1, Type.ROT));
        assertEquals("Maximale Personenzahl nicht überschritten", Alarm.checkNumberOfCustomers(0, Type.ROT));
    }


}