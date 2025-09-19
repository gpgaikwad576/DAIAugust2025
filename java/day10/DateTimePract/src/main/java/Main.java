
import java.time.Duration;
import java.time.Period;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;

public class Main {
    public static void main(String[] args) {

        //        1. Calculate your age in no of days, months, years
        LocalDate dt = LocalDate.now();
        LocalDate birthDate = LocalDate.of(2001,10,1);
        Period age = Period.between(birthDate,dt);
        System.out.println("My age: "+age.getYears()+" yrs  "+age.getMonths()+" months  "+age.getDays()+" days");
        System.out.println();

        //        2. Compute programmers day without using plusDays
        TemporalAdjuster findProgrammersDay = temporal->{
            return temporal.with(ChronoField.DAY_OF_YEAR,256);
        };
        System.out.println("Programmers day of Year: "+dt.with(findProgrammersDay));
        System.out.println();

        //        3. Find out all the months that started on a Sundays in year 2025
        System.out.print("All the months that started on sundays in year 2025: ");
        LocalDate dt2;
        for(int i =1;i<13;i++){
            dt2 = LocalDate.of(2025,i,1);
            if(dt2.getDayOfWeek().name().equals("SUNDAY")){
                System.out.print(dt2.getMonth()+",");
            }
        }
        System.out.println();
        System.out.println();
        //4. If we leave Mumbai at 02:05 am and arrive in New York at 8:40 am. How long is the flight?
//[Note: all times are local times of mumbai]
        LocalDateTime dt3 = LocalDateTime.of(2025,9,4,2,5);
        LocalDateTime dt4 = LocalDateTime.of(2025,9,4,8,40);
        Duration d = Duration.between(dt3,dt4);
        System.out.println("Fight Duration: "+d.toHoursPart()+" hrs: "+d.toMinutesPart()+" min: "+d.toSecondsPart()+" seconds");










    }
}