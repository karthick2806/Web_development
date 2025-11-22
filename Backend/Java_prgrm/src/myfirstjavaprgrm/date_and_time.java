package myfirstjavaprgrm;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Duration;
import java.time.format.DateTimeFormatter;
import java.time.Instant;
import java.time.LocalDateTime;



public class date_and_time {

	public static void main(String[] args) {
		LocalDate current_date = LocalDate.now();  //gives the current date
		System.out.println(current_date);
		
		
		LocalTime current_time = LocalTime.now();
		System.out.println(current_time);
		
		LocalDate custom_date = LocalDate.of(2003, 06, 28);   //of-used to set custom date same like for time the default format is (HH:mm:ss.nnnnnnnnn)
		System.out.println(custom_date);
		
		
		//for time
	    System.out.println("\n");
		LocalDate today = LocalDate.now();
		
		System.out.println("Year: " + today.getYear());
        System.out.println("Month: " + today.getMonth());
        System.out.println("Day of Week: " + today.getDayOfWeek());

        System.out.println("After 5 days: " + today.plusDays(5));
        System.out.println("Before 2 months: " + today.minusMonths(2));

        System.out.println("Month Value: " + today.getMonthValue());
        System.out.println("Day of Month: " + today.getDayOfMonth());

        System.out.println("Is after 2025-01-01? " + today.isAfter(LocalDate.of(2025, 1, 1)));
        System.out.println("Is before 2025-12-01? " + today.isBefore(LocalDate.of(2025, 12, 1)));

        System.out.println("Compare to 2025-01-10: " + today.compareTo(LocalDate.of(2025, 1, 10)));
        
        
        
        //for time
        System.out.println("\n");
        LocalTime time = LocalTime.of(10, 30, 45, 500000000);  
        // 10:30:45.500 (example fixed time)

        System.out.println("Hour: " + time.getHour());
        System.out.println("Minute: " + time.getMinute());
        System.out.println("Second: " + time.getSecond());
        System.out.println("Nano: " + time.getNano());

        System.out.println("Plus 2 hours: " + time.plusHours(2));
        System.out.println("Minus 15 minutes: " + time.minusMinutes(15));
        System.out.println("Plus 30 seconds: " + time.plusSeconds(30));

        System.out.println("Is before 11:00? " + time.isBefore(LocalTime.of(11, 0)));
        System.out.println("Is after 09:00?  " + time.isAfter(LocalTime.of(9, 0)));

        System.out.println("Compare to 10:30:45.500: " + time.compareTo(LocalTime.of(10, 30, 45, 500000000)));

        // Duration example (difference between two times)
        LocalTime t1 = LocalTime.of(9, 0);
        Duration d = Duration.between(t1, time);
        System.out.println("Minutes difference: " + d.toMinutes());
    
        
        
        //a string to date format
        System.out.println("\n");
        String dob = "10-01-2025";
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate prse = LocalDate.parse(dob, f);
        System.out.println(prse);


        //date to string format
        System.out.println("\n");
        
        LocalDate new_current_date = LocalDate.now();  //gives the current date
        DateTimeFormatter new_formatted_current_date = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formatted = new_current_date.format(new_formatted_current_date);
        System.out.println(formatted);
        
        
        //instant time for servers
        System.out.println("\n");
        Instant inst_now = Instant.now();
        System.out.println(inst_now);
        
        
        //local date and time
        System.out.println("\n");
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        
        
    }

}


