package tests;
import static org.junit.Assert.*;
import org.junit.Test;
import classes.*;

public class MovieTest {
	 @Test
	    public void testMovieTitle() {
	        String title = "Title";
	        Movie movie = new Movie(title, Price.REGULAR);
	        assertEquals(movie.getTitle(), title);
	    }

	    @Test
	    public void testMovieTitleEmpty() {
	        String title = "";
	        Movie movie = new Movie(title, Price.REGULAR);
	        assertEquals(movie.getTitle(), title);
	    }

	    @Test
	    public void testMoviePriceCode() {
	        Price price = Price.REGULAR;
	        Movie movie = new Movie("", price);
	        assertEquals(movie.getPrice(), price);
	    }

	    @Test
	    public void testMoviePriceCodeSetter() {
	        Price price = Price.NEW_RELEASE;
	        Movie movie = new Movie("", Price.REGULAR);
	        movie.setPrice(price);
	        assertEquals(movie.getPrice(), price);
	    }

}
