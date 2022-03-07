import java.util.Stack;
/*
 * @author Nabaa Khan
 * A Stack class that acts as a Queue
 */
public class CustomSQueue<Integer>{
  
  /* First stack object **/
  private Stack<Integer> s1;
  
  /* Second stack object **/
  private Stack<Integer> s2;
  
  /* Size of specified stack **/
  private int stackSize;
  
  /*
   * Creates two stack objects
   */
  public CustomSQueue(){
    s1 = new Stack<Integer>();
    s2 = new Stack<Integer>();
  }
  
  /*
   * Helper method that updates size of stack
   * @return the size of updated stack
   */
  public int updateSize(){
    return stackSize;
  }
  
  /*
   * Adds element to stack
   * @param an element to add
   * @return boolean, asserts whether element has been added to stack or not 
   */
  public boolean add(Integer element){
    //pushes element into stack
    Integer addedElement = s1.push(element);
    //evaluates whether stack contains the added element
    if(s1.contains(addedElement)){
      //if so, increment the size of stack and return true, as element is in stack
      stackSize++;
      return true;
    }
    //otherwise, if the added element is not in the stack, return false
    else{
      return false;
    }
  }
  
  /*
   * Removes element from bottom of stack, equivalent to removing element from beginning of queue
   * @returns element at the bottom of a stack 
   */
  public Integer poll(){
    //if s1 is empty, returns null, as there is nothing to remove
    if(s1.isEmpty()){
      return null;
    }
    //if s2 is empty, continue with operation, as s2 can be used to store the rearranged order of s1
    if(s2.isEmpty()){
      //iterates through as long as there are elements in s1
      while(!s1.isEmpty()){
        //pops elements from s1
        //pushes those elements into s2
        s2.push(s1.pop());
      }
      //removes the element at top of new rearranged stack s2
      Integer popped = s2.pop();
      //decrements the size of stack
      stackSize--;
      //iterates through as long as there are elements in s2
      while(!s2.isEmpty()){
        //pops elements from s2
        //pushes them back to s1
        //this allows for the method to be done multiple times
        s1.push(s2.pop());
      }
      //returns the element at the bottom of the stack, rearranged to be at the top of the stack s2 
      return popped;
    }
    //if s2 is not empty, returns null, as s2 cannot be used to rearrange s1
    else{
      return null;
    }
  }
}