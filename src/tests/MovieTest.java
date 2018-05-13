package tests;
import static org.junit.Assert.*;
import org.junit.Test;
import classes.*;

public class MovieTest {
	 @Test
	    public void testMovieTitle() {
	        String title = "Title";
	        Movie movie = new Movie(title, Movie.REGULAR);
	        assertEquals(movie.getTitle(), title);
	    }

	    @Test
	    public void testMovieTitleEmpty() {
	        String title = "";
	        Movie movie = new Movie(title, Movie.REGULAR);
	        assertEquals(movie.getTitle(), title);
	    }

	    @Test
	    public void testMoviePriceCode() {
	        int priceCode = Movie.REGULAR;
	        Movie movie = new Movie("", priceCode);
	        assertEquals(movie.getPriceCode(), priceCode);
	    }

	    @Test
	    public void testMoviePriceCodeWrong() {
	        int priceCode = -1;
	        Movie movie = new Movie("", priceCode);
	        assertEquals(movie.getPriceCode(), priceCode);
	    }

	    @Test
	    public void testMoviePriceCodeSetter() {
	        int priceCode = Movie.NEW_RELEASE;
	        Movie movie = new Movie("", Movie.REGULAR);
	        movie.setPriceCode(priceCode);
	        assertEquals(movie.getPriceCode(), priceCode);
	    }

}
