package tests;
import static org.junit.Assert.*;
import org.junit.Test;
import classes.*;

public class RentalTest {
	@Test
    public void testRentalDays() {
        int days = 1;
        Rental rental = new Rental(new Movie("", Price.REGULAR), days);
        assertEquals(rental.getDaysRented(), days);
    }

    @Test
    public void testRentalDaysZero() {
        int days = 0;
        Rental rental = new Rental(new Movie("", Price.REGULAR), days);
        assertEquals(rental.getDaysRented(), days);
    }

    @Test
    public void testRentalDaysNegative() {
        int days = -1;
        Rental rental = new Rental(new Movie("", Price.REGULAR), days);
        assertEquals(rental.getDaysRented(), days);
    }

    @Test
    public void testRentalDaysMovie() {
        Movie movie = new Movie("", Price.REGULAR);
        Rental rental = new Rental(movie, 1);
        assertEquals(rental.getMovie(), movie);
    }

    @Test
    public void testRentalDaysMovieNull() {
        Movie movie = null;
        Rental rental = new Rental(movie, 0);
        assertEquals(rental.getMovie(), movie);
    }

}
