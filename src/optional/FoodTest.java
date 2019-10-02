package optional;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FoodTest {

	@Test
	public void testFood() {

		assertFalse(new Food("Burger", true, true).isHealthy());
		assertFalse(new Food("French Fries", false, true).isHealthy());

	}

}
