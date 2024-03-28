import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class TestCompute {
  Compute c;

  @Test
  public void example() {
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    assertTrue(true);
  }
  
  @Test
  public void testSizeZero(){
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    assertEquals(-1, c.countNumberOfOccurrences(""));
    assertTrue(true);
  }
   
  @Test
  public void testContains(){
    MessageQueue mq = mock(MessageQueue.class);
    when(mq.size()).thenReturn(5);
    when(mq.contains(anyString())).thenReturn(false);
    c = new Compute(mq);
    c.countNumberOfOccurrences("123");
  }

  @Test
  public void testCounter(){
    MessageQueue mq = mock(MessageQueue.class);
    when(mq.size()).thenReturn(3);
    when(mq.contains(anyString())).thenReturn(true);
    //when(anyString().equals(anyString())).thenReturn(true);
    c = new Compute(mq);
    c.countNumberOfOccurrences("123");
  }
  @Test
  public void testCounter2(){
    MessageQueue mq = mock(MessageQueue.class);
    when(mq.size()).thenReturn(3);
    when(mq.contains(anyString())).thenReturn(true);
    when(anyString().equals(mq.getAt(anyInt()))).thenReturn(false);
    c = new Compute(mq);
    c.countNumberOfOccurrences("123");
  }
 
}