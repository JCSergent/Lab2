package pkgCore;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;
import pkgCore.Die;
import pkgCore.Roll;

public class RollTest {

	@Test
	public void TestRoll() {

		for (int a = 0; a < 10000; a++) {
			Roll r = new Roll();
			// TODO: Make sure value of roll is between 1 and 12.
			if((r.getScore()>0) && (r.getScore()<13)) {
				break;
			}
			else {
				fail("Roll value not between 1 and 12");
			}	
		}

	}

}
