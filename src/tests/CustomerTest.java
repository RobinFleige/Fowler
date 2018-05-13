package tests;
import static org.junit.Assert.*;

import org.junit.Test;
import classes.*;

public class CustomerTest {
	@Test
    public void testCustomerName() {
        String name = "Julian";
        Customer myCustomer = new Customer(name);
        assertEquals(myCustomer.getName(), name);
    }

    @Test
    public void testCustomerNameEmpty() {
        String name = "";
        Customer myCustomer = new Customer(name);
        assertEquals(myCustomer.getName(), name);
    }

    @Test
    public void testCustomerStatementNoEntrys() {
        Customer myCustomer = new Customer("");
        assertEquals(myCustomer.statement().split("\n").length, 4);
    }

    @Test
    public void testCustomerStatementOneEntry() {
        Customer myCustomer = new Customer("");
        myCustomer.addRental(new Rental(new Movie("", Movie.REGULAR), 1));
        assertEquals(myCustomer.statement().split("\n").length, 5);
    }

}
