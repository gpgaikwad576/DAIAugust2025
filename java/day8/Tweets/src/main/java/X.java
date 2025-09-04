import java.util.Arrays;
import java.util.Comparator;
import java.sql.Date;
import java.util.HashSet;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class X {
    public static void main(String [] args){

        Tweet t1 = new Tweet(
                "Apple iPhone 17 launch event impresses with AI upgrades!",
                 Date.valueOf(LocalDate.of(2025, 9, 2)),
                105000,
                new HashSet<>(Arrays.asList("#AppleEvent", "#iPhone17", "#TechNews"))
        );

        Tweet t2 = new Tweet(
                "NASA confirms water ice on the Moon’s south pole – big leap for lunar missions.",
                Date.valueOf(LocalDate.of(2025, 9, 1)),
                88000,
                new HashSet<>(Arrays.asList("#NASA", "#MoonMission", "#SpaceExploration"))
        );

        Tweet t3 = new Tweet(
                "Taylor Swift’s new album 'Eras Revisited' breaks Spotify records in 3 hours!",
                Date.valueOf(LocalDate.of(2025, 8, 25)),
                225000,
                new HashSet<>(Arrays.asList("#TaylorSwift", "#ErasRevisited", "#SpotifyRecords"))
        );

        Tweet t4 = new Tweet(
                "Global markets rally after Fed signals possible rate cut.",
                Date.valueOf(LocalDate.of(2025, 8, 20)),
                7000,
                new HashSet<>(Arrays.asList("#StockMarket", "#FederalReserve", "#Economy2025"))
        );

        Tweet t5 = new Tweet(
                "India wins ICC Champions Trophy 2025 – thrilling final against England!",
                Date.valueOf(LocalDate.of(2025, 8, 10)),
                340000,
                new HashSet<>(Arrays.asList("#ChampionsTrophy", "#IndiaWins", "#CricketFinal"))
        );

        Tweet t6 = new Tweet(
                "Climate Summit 2025: 80 nations sign historic carbon reduction agreement.",
                Date.valueOf(LocalDate.of(2025, 7, 3)),
                59000,
                new HashSet<>(Arrays.asList("#ClimateAction", "#GreenFuture", "#Summit2025"))
        );

        Tweet t7 = new Tweet(
                "Tesla announces new battery tech – 1200 miles on a single charge!",
                Date.valueOf(LocalDate.of(2025, 9, 2)),
                91000,
                new HashSet<>(Arrays.asList("#Tesla", "#EVRevolution", "#BatteryTech"))
        );

        Tweet t8 = new Tweet(
                "Tech & EV merge: Tesla partners with Apple for next-gen smart car!",
                Date.valueOf(LocalDate.of(2025, 9, 3)),
                150000,
                new HashSet<>(Arrays.asList("#Tesla", "#TechNews", "#SmartCar"))
        );

                Tweet t9 = new Tweet(
                "Tech & EV merge: Tesla partners with Apple for next-gen smart car!",
                Date.valueOf(LocalDate.of(2025, 8, 3)),
                9000,
                new HashSet<>(Arrays.asList("#Tesla", "#SmartCar"))
        );


        List<Tweet> tweets=List.of(t1,t2,t3,t4,t5,t6,t7,t8,t9);

        System.out.println(" ");
        System.out.println("---------------------------------List of Tweets for Current Month------------------------------------");
        tweets.stream().filter(p->p.getDate().toLocalDate().getMonthValue()==LocalDate.now().getMonthValue()).forEach(System.out::println);

        System.out.println(" ");
        System.out.println("---------------------------------List of Tweets For a Particular Hastags------------------------------------");
        tweets.stream().filter(p->p.getHastags().contains("#TechNews")).forEach(System.out::println);

        System.out.println(" ");
        System.out.println("---------------------------------Count By Subjects------------------------------------");
        tweets.stream().collect(Collectors.groupingBy(p->p.getSubject())).forEach((k,v)->System.out.println("Key:"+k+" Values:"+v+" Count:"+v.size()));

        System.out.println(" ");
        System.out.println("---------------------------------Tweets More than 10K views ------------------------------------");
        tweets.stream().filter(p->p.getViews()>10000).forEach(System.out::println);

        System.out.println(" ");
        System.out.println("---------------------------------Top 5 trending Tweets ------------------------------------");
        tweets.stream().filter(p->p.getDate().toLocalDate().getMonthValue()>(LocalDate.now().getMonthValue()-5)).sorted(Comparator.comparingInt(Tweet::getViews).reversed()).limit(5).forEach(System.out::println);

        
    }
    
}
