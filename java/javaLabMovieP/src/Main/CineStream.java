package Main;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CineStream<T extends Movie> {
    private List<T> catalog;

    public CineStream() {
        catalog = new ArrayList<>();
    }

    public CineStream(List<T> catalog) {
        this.catalog = catalog;
    }

    public List<T> getCatalog() {
        return catalog;
    }

    public boolean addMovie(T movie) {
        try {
            catalog.add(movie);
            return true;
        } catch (Exception e) {
            System.err.println("Internal error" + e);
            e.printStackTrace();
        }
        return false;

    }

    public boolean updateAvailability(String title) {
        Optional<T> movie = catalog.stream().filter((T t) -> t.getTitle().equalsIgnoreCase(title)).findFirst();
        if (movie.isEmpty()) {
            return false;
        }
        movie.ifPresent(Movie::changeAvailabilitytatus);
        return true;
    }

    public boolean applyDiscount(long waitMonths, int discount) {
        List<T> mmovies = catalog.stream().filter((T t) -> ChronoUnit.MONTHS.between(t.lastWatchedDate, LocalDate.now()) > waitMonths).collect(Collectors.toList());
        if (mmovies.isEmpty()) return false;
        for (T movie : mmovies) {
            movie.setDiscount(discount);
        }
        return true;
    }

    public boolean removeMovies(int stayYears) {
        List<T> mmovies = catalog.stream().filter((T t) -> ChronoUnit.YEARS.between(t.addedDate, LocalDate.now()) > stayYears && t.lastWatchedDate == null).collect(Collectors.toList());
        if (mmovies.isEmpty()) return false;

        catalog.removeAll(mmovies);
        return true;
    }

}
