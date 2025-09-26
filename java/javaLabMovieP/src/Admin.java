import Main.CineStream;
import Main.Genre;
import Main.Movie;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Admin {
    public static void main(String[] args) {
        CineStream cineStream = new CineStream();
        Scanner sc = new Scanner(System.in);
        Movie m1 = new Movie("Avenger", Genre.ACTION, 2020, LocalDate.of(2020, 2, 1), true, 3000, 0, LocalDate.of(2023, 2, 1));
        Movie m2 = new Movie("Robot", Genre.ACTION, 2021, LocalDate.of(2020, 2, 1), false, 2000, 0, null);
        Movie m3 = new Movie("Last Bus", Genre.DRAMA, 2022, LocalDate.of(2020, 2, 1), true, 1000, 0, null);
        Movie m4 = new Movie("War", Genre.ACTION, 2023, LocalDate.of(2020, 2, 1), true, 4000, 0, LocalDate.of(2024, 2, 1));
        Movie m5 = new Movie("Love Story", Genre.DRAMA, 2024, LocalDate.of(2020, 2, 1), true, 2000, 0, LocalDate.of(2025, 2, 1));
        Movie m6 = new Movie("Terminal", Genre.COMEDY, 2025, LocalDate.of(2020, 2, 1), true, 1000, 0, LocalDate.of(2024, 3, 1));

        cineStream.addMovie(m1);
        cineStream.addMovie(m2);
        cineStream.addMovie(m3);
        cineStream.addMovie(m4);
        cineStream.addMovie(m5);
        cineStream.addMovie(m6);

        System.out.println("Operate this menu with below options:");
        System.out.println("1. List movie");
        System.out.println("2. Add movie");
        System.out.println("3. Update Availability");
        System.out.println("4. Apply Discount");
        System.out.println("5. Remove unwached movies");
        System.out.println("6. exit");

        try {

            boolean continu = true;
            while (true) {
                System.out.println("Enter your choice:");
                int ip = sc.nextInt();
                switch (ip) {
                    case 1:
                        List<Movie> movies = cineStream.getCatalog();
                        for (int i = 0; i < movies.size(); i++) {
                            System.out.println(movies.get(i));
                        }
                        break;
                    case 2:
                        Movie m7 = new Movie("First Train", Genre.DRAMA, 2022, LocalDate.of(2020, 2, 1), true, 1000, 0, null);
                        if(cineStream.addMovie(m7)){
                            System.out.println("Movie added successfully");
                        }
                        break;
                    case 3:
                        if(cineStream.updateAvailability("Terminal"))
                        {
                            System.out.println("Movie availability changed successfully");
                        }
                        break;
                    case 4:
                        if(cineStream.applyDiscount(3, 20)){
                            System.out.println("Discount applied successfully");
                        }
                        break;
                    case 5:
                        if(cineStream.removeMovies(2)){
                            System.out.println("Movies removed successfully");
                        }
                        break;
                    case 6:
                        continu = false;
                        break;
                    default:
                        System.out.println("Please enter something");

                }
                System.out.println();
                if (continu == false) {
                    System.out.println("Exiting. Thank you!");
                    break;
                }

            }
        } catch (NullPointerException e) {
            System.err.println("Memory Exception:" + e);

        } catch (NumberFormatException e) {
            System.err.println("Type Exception:" + e);

        } catch (Exception e) {
            System.err.println("Exception:" + e);

        } finally {
            sc.close();
            System.out.println("Status after doing changes: ");
            List<Movie> movies = cineStream.getCatalog();
            for (int i = 0; i < movies.size(); i++) {
                System.out.println(movies.get(i));
            }
        }

    }
}
