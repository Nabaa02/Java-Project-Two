import java.util.LinkedList;
import java.util.Queue;
/*
 * @author Nabaa Khan
 * A Queue class that acts as a Stack
 */
public class CustomQStack<Integer>{
  
  /* The Queue object **/
  private Queue<Integer> q;
  
  /* Size of queue **/
  private int queueSize;
  
  /*
   * Creates a queue object
   */
  public CustomQStack(){
    q = new LinkedList<Integer>();
  }
  
  /*
   * Helper method that updates size of queue
   * @return size of updated queue
   */
  public int updateSize(){
    return queueSize;
  }

  /*
   * Checks to see if queue is empty
   * @return boolean, asserts whether queue is empty or not
   */
  public boolean empty(){
    //if first element is null, this means queue is empty
    if(q.peek() == null){
      return true;
    }
    //otherwise, the queue has at least one element, and is thus not empty 
    else{
      return false;
    }
  }
  
  /*
   * Removes element from end of queue, equivalent to removing element from top of stack
   * @return the element at the end of a queue 
   */
  public Integer pop(){
    //if queue is empty, returns null, as there is nothing to remove
    if(empty()){
      return null;
    }
    //saves index of current position
    int index = 0;
    //iterates through, making sure that the index is less than the queue's size - 1
    //- 1 for q.size() - 1 ensures that method will not return the first element of queue 
    while(index < q.size() - 1){
      //remove element at front
      //add element to back
      q.add(q.remove());
      //increment the index
      index++;
    }
    //decrements the size of queue
    queueSize--;
    //return the last element of the original queue, now at the front of the rearranged queue
    return q.remove();
  }
  
  /*
   * Adds element to end of queue, equivalent to adding element at top of stack
   * @param an element to add
   * @return boolean, asserts whether element has been added to queue or not
   */
  public Integer push(Integer element){
    //adds element to queue
    q.add(element);
    //increments the size of queue 
    queueSize++;
    //returns element that was added
    return element;
  }
}