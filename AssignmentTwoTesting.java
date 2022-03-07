import junit.framework.TestCase;

/*
 * @author Nabaa Khan
 * Test class for methods in LinkedList, CustomQStack, & CustomSQueue
 */
public class AssignmentTwoTesting extends TestCase{
  
  /*
   * Tests the reverse method of the LinkedList class
   * Adds elements, 
   * calls reverse(), 
   * and retrieves the head of the new reversed linked list, formerly the tail of the original linked list
   */
  public void testReverse(){
    LinkedList<Integer> ll = new LinkedList<Integer>();
    ll.addToFront(3);
    ll.addToFront(4);
    ll.addToFront(5);
    ll.reverse();
    int expected = 3;
    int actual = ll.getFirstNode().getElement();
    assertEquals("Retrieves first node of reversed link list", expected, actual);
  }
  
  /*
   * Tests the empty method of the CustomQStack class when there is nothing in the queue
   * Does not add anything to queue,
   * then returns true, as queue is empty 
   */
  public void testEmpty(){
    CustomQStack<Integer> q = new CustomQStack<Integer>();
    boolean expected = true;
    boolean actual = q.empty();
    assertTrue("Determines if queue is empty", (expected == actual));
  }
  
  /*
   * Tests the empty method of the CustomQStack class when there is an element in the queue
   * Adds element,
   * then returns false, as queue is not empty anymore
   */
  public void testEmpty2(){
    CustomQStack<Integer> q = new CustomQStack<Integer>();
    q.push(20);
    boolean expected = false;
    boolean actual = q.empty();
    assertTrue("Determines if queue is empty", (expected == actual));
  }
  
  /*
   * Tests the pop method of the CustomQStack class
   * "Push" elements into queue,
   * then calls pop(), 
   * and retrieves element at end of queue, equivalent to element at top of stack
   */
  public void testPop(){
    CustomQStack<Integer> q = new CustomQStack<Integer>();
    q.push(13);
    q.push(25);
    q.push(7);
    int expected = 7;
    int actual = q.pop();
    assertEquals("Retrieves element at end of queue, equivalent to element at top of stack", expected, actual);
  }
  
  /*
   * Tests the push method of the CustomQStack class
   * "Push" element into queue,
   * and returns the element that was pushed
   */
  public void testPush(){
    CustomQStack<Integer> q = new CustomQStack<Integer>();
    int expected = 23;
    int actual = q.push(23);
    assertEquals("Returns element that was added to queue", expected, actual);
  }
  
  /*
   * Tests the add method of the CustomSQueue class
   * "Add" elements,
   * then calls updateSize() to see if element was added,
   * and returns the updated size of the stack, which is now 2
   */
  public void testAdd(){
    CustomSQueue<Integer> s = new CustomSQueue<Integer>();
    s.add(17);
    s.add(24);
    int expected = 2;
    int actual = s.updateSize();
    assertEquals("Determines whether element has been added to stack or not", expected, actual);
  }
  
  /*
   * Tests the poll method of the CustomSQueue class
   * "Add" elements,
   * then calls poll(),
   * and returns element at bottom of stack, equivalent to element at beginning of queue 
   */
  public void testPoll(){
    CustomSQueue<Integer> s = new CustomSQueue<Integer>();
    s.add(44);
    s.add(18);
    s.add(11);
    int expected = 44;
    int actual = s.poll();
    assertEquals("Retrieves element at bottom of stack, equivalent to element at beginning of queue", expected, actual);
  }
}