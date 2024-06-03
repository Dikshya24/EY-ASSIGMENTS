
package collections3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MovieManager {
    public List<Movie> createMovieSet() {
        List<Movie> movieList = new ArrayList<>();
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter movie details (name, language, release year, release month, release day, director, producer, duration) or 'STOP' to finish:");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("STOP")) {
                break;
            }
            String[] parts = input.split(",");
            movieList.add(new Movie(parts[0].trim(), parts[1].trim(), LocalDate.of(Integer.parseInt(parts[2].trim()), Integer.parseInt(parts[3].trim()), Integer.parseInt(parts[4].trim())), parts[5].trim(), parts[6].trim(), Integer.parseInt(parts[7].trim())));
        }
        return movieList;
    }

    public void sortByLanguage(List<Movie> movieList) {
        Collections.sort(movieList);
        System.out.println("Sorted by Language:");
        for (Movie movie : movieList) {
            System.out.println(movie.getName() + " - " + movie.getLanguage());
        }
    }

    public void sortByDirector(List<Movie> movieList) {
        Comparator<Movie> directorComparator = Comparator.comparing(m -> m.getDirector());
        Collections.sort(movieList, directorComparator);
        System.out.println("Sorted by Director:");
        for (Movie movie : movieList) {
            System.out.println(movie.getName() + " - " + movie.getDirector());
        }
    }

    public void sortByDuration(List<Movie> movieList) {
        Comparator<Movie> durationComparator = Comparator.comparingInt(m -> m.getDuration());
        Collections.sort(movieList, durationComparator);
        System.out.println("Sorted by Duration:");
        for (Movie movie : movieList) {
            System.out.println(movie.getName() + " - " + movie.getDuration());
        }
    }

    public static void main(String[] args) {
        MovieManager movieManager = new MovieManager();
        List<Movie> movieList = movieManager.createMovieSet();
        movieManager.sortByLanguage(movieList);
        movieManager.sortByDirector(movieList);
        movieManager.sortByDuration(movieList);
    }
}



//// SAMPLE INPUT 

//// Movie1, English, 2020, 1, 1, Director1, Producer1, 120//// Movie2, Hindi, 2019, 6, 1, Director2, Producer2, 150//// Movie3, English, 2018, 3, 1, Director3, Producer3, 100//// Movie4, Tamil, 2017, 9, 1, Director4, Producer4, 130
