import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String movieTitle;
    private String genre;
    private int duration;
    private double rating;

    public Movie(String movieTitle, String genre, int duration, double rating) {
        this.movieTitle = movieTitle;
        this.genre = genre;
        this.duration = duration;
        this.rating = rating;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public static void viewAllMovieTitles(List<Movie> movies) {
        for (Movie movie : movies) {
            System.out.println(movie.getMovieTitle());
        }
    }

    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Inception", "Sci-Fi", 148, 8.8));
        movies.add(new Movie("The Godfather", "Crime", 175, 9.2));
        movies.add(new Movie("The Dark Knight", "Action", 152, 9.0));

        Movie.viewAllMovieTitles(movies);
    }
}
