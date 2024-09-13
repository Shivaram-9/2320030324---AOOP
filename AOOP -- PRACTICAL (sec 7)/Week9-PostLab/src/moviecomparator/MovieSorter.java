package moviecomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MovieSorter {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Oppenheimer", 8.9, 2023));
        movies.add(new Movie("Jawan", 8.2, 2023));
        movies.add(new Movie("Guardians of the Galaxy Vol. 3", 8.1, 2023));
        movies.add(new Movie("Spider-Man: Across the Spider-Verse", 8.9, 2023)); 
        movies.add(new Movie("Saaho", 5.9, 2019));  
        movies.add(new Movie("RRR", 8.0, 2022));    
        movies.add(new Movie("Pushpa: The Rise", 7.6, 2021)); 
        movies.add(new Movie("Avatar: The Way of Water", 7.7, 2022)); 
        movies.add(new Movie("The Batman", 7.9, 2022));  
        movies.add(new Movie("KGF: Chapter 2", 8.4, 2022)); 

        System.out.println("Movies before sorting by rating:");
        for (Movie movie : movies) {
            System.out.println(movie);
        }

        // Create an instance of RatingComparator and sort movies by rating
        RatingComparator ratingComparator = new RatingComparator();
        Collections.sort(movies, ratingComparator);

        System.out.println("\nMovies after sorting by rating:");
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }
}
