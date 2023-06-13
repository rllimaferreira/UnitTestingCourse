import java.time.LocalDate;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class PersonAgeTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void deveRetornar52Em2023() {
		Long idade = PersonAge.getPersonAge(LocalDate.of(1971, 4, 5));

		Assert.assertEquals(idade, (Long)52L);
	}

	@Test
	public void deveRetornar0Em2023() {
		Long idade = PersonAge.getPersonAge(LocalDate.of(2023, 4, 5));

		Assert.assertEquals(idade, new Long(0));
	}


	@Test(expected = NullPointerException.class)
	public void deveEmNulo() {
		Long idade = PersonAge.getPersonAge(null);
	}

}
