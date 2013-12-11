package citest2;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class ProfileTest {

	@Test
	public void test() {
		Profile p = new Profile();
		assertThat(p.getName(), is("John"));
	}

}
