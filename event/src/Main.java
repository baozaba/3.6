import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the event ID:");
        String eventID = scanner.nextLine();
        System.out.println("Please enter the event name :");
        String eventName = scanner.nextLine();
        System.out.println("Please enter the event venue :");
        String eventVenue = scanner.nextLine();
        System.out.println("Please enter the event date(yyyy-MM-dd):");
        String eventDateStr = scanner.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date eventDate = null;
        try {
            eventDate = dateFormat.parse(eventDateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Event event = new Event(eventID, eventName, eventVenue, eventDate);
        System.out.println("The event has been created :" + event);
    }
}
