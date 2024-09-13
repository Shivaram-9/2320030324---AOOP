package moviesorting;

public class Movie implements Comparable<Movie> {
    private double rating;
    private String name;
    private int year;

    public Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    public double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public int compareTo(Movie other) {
        return this.year - other.year;
    }

    @Override
    public String toString() {
        return "Movie{" + "name='" + name + '\'' + ", rating=" + rating + ", year=" + year + '}';
    }
}
