import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class TestUtil {
  Util c;

  @Before
  public void setUp() { c = new Util(); }

  @Test
  public void test() {
      assertEquals(c.compute(1),false);
   }
  @Test
  public void test2() {
    int[] arr = {1,2};
    assertEquals(c.compute(arr),false);
  }
  @Test
  public void test3() {
    int[] arr = {1,2,3};
    assertEquals(c.compute(arr),true);
  }
  @Test
  public void test4() {
    int[] arr = {0,1,2,3,4};
    try {
      c.compute(arr);
    } catch (Exception e) {
      assertTrue(true);
    } 
  }
  @Test
  public void test5() {
    int[] arr = {10,11,13};
    assertEquals(c.compute(arr),false);
  }
  
}