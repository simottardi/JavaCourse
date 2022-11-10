package advanced.timetypes;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.time.*;
import java.time.chrono.HijrahDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class PizzaWebshopApp {

    public static void main(String[] args) {
        LocalTime openingHour = LocalTime.of(11,0);
        LocalTime closingHour = LocalTime.of(22,0);
        System.out.println("The restaurant is open from " + openingHour +" to " + closingHour + " every day.");

        LocalDate orderDate = LocalDate.now().minusDays(3);
        System.out.println("I submitted the order: " + orderDate);

        LocalDateTime orderDateTime = LocalDateTime.from(orderDate.atStartOfDay()).withHour(17);
        System.out.println("I submitted the order at: " + orderDateTime);

        LocalTime deliveryTime = LocalTime.of(1,10);
        System.out.println("Delivery time: " + deliveryTime);

        LocalDateTime estimatedDeliveryDateTime = orderDateTime.plusHours(deliveryTime.getHour()).plusMinutes(deliveryTime.getMinute());
        System.out.println("The estimated delivery time: " + estimatedDeliveryDateTime);

        LocalDateTime realDeliveryTime = orderDateTime.plusMinutes(90);
        System.out.println("The real deliver time was; " + realDeliveryTime);

        long differenceBetweenEstimatedAndReal = ChronoUnit.MINUTES.between(estimatedDeliveryDateTime, realDeliveryTime);
        System.out.println("Difference: " + differenceBetweenEstimatedAndReal + " in minutes");

        if (estimatedDeliveryDateTime.isBefore((realDeliveryTime))) {
            System.out.println("The pizza did not arrived in time");
        }else{
            System.out.println("The pizza arrived in time");
        }

        HijrahDate hijrahDate = HijrahDate.from(orderDate);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("Based on the Hijrah calendar I ordeere a pizza on: " + hijrahDate);

        ZonedDateTime myLocalDateTime = orderDateTime.atZone(ZoneId.of("Europe/Amsterdam"));
        System.out.println("The time I ordered pizza was " + myLocalDateTime + "in Amsterdam.");
        ZonedDateTime tokioDateTime = myLocalDateTime.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));
        System.out.println("The time I ordered pizza was " + tokioDateTime + "in Tokyo.");

        for (String zoneId : ZoneId.getAvailableZoneIds()) {
            System.out.println(zoneId);
        }
    }
}
