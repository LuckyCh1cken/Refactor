package refactoring_exercise;

import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

	@org.junit.jupiter.api.Test
	void statement() {
		Movie m1 = new Movie("movie1", 1);
		Movie m2 = new Movie("movie2", 2);
		Rental r1 = new Rental(m1, 10);
		Rental r2 = new Rental(m2, 5);
		Customer john = new Customer("joe");
		john.addRental(r1);
		john.addRental(r2);

		String result = john.statement();
		String expected = "Rental Record for joe\n" + "\tTitle\t\tDays\tAmount\n" + "\tmovie1\t\t10\t30.0\n"
				+ "\tmovie2\t\t5\t4.5\n" + "Amount owed is 34.5\n" + "You earned 3 frequent renter points";

		Assert.assertEquals(result, expected);
	}
}