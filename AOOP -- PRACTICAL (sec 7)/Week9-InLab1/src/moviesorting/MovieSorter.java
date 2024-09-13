package moviesorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MovieSorter {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();     
        movies.add(new Movie("Avengers: Endgame", 8.4, 2019)); 
        movies.add(new Movie("RRR", 8.5, 2022));            
        movies.add(new Movie("Inception", 8.8, 2010));      
        movies.add(new Movie("K.G.F: Chapter 2", 8.4, 2022)); 
        movies.add(new Movie("Interstellar", 8.6, 2014));   
        movies.add(new Movie("Aravinda Sametha", 7.9, 2018)); 

        System.out.println("Movies before sorting:");
        for (Movie movie : movies) {
            System.out.println(movie);
        }

        Collections.sort(movies);

        System.out.println("\nMovies after sorting by year:");
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }
}
