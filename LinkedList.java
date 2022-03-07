import java.util.NoSuchElementException;
/**
 * @author Nabaa Khan
 * A class implementing a linked list
 */
public class LinkedList<T> {
  
  /** The first node of the linked list */
  private LLNode<T> firstNode;
  
  /** Create an empty linked list */
  public LinkedList() {
    firstNode = null;
  }
  
  /** Retrieve the first node of the list */
  protected LLNode<T> getFirstNode() {
    return firstNode;
  }
  
  /** Change the first node of the list */
  protected void setFirstNode(LLNode<T> node) {
    firstNode = node;
  }
  
  /** 
   * Is the list empty?
   * @return true if the list contains no nodes
   */
  public boolean isEmpty() {
    return getFirstNode() == null;
  }
  
  /**
   * Add an element to the front of the linked list
   * @param element the element to add
   */
  public void addToFront(T element) {
    setFirstNode(new LLNode<T>(element, getFirstNode()));
  }
  
  /**
   * Remove and return the first node of the list
   * @return the first node of the list
   * @throws NoSuchElementException if the list is empty
   */
  public T removeFromFront() throws NoSuchElementException {
    //if list is not empty, continue
    if (!isEmpty()) {
      //save the first node
      T save = getFirstNode().getElement();
      //change the first node to be the head's next node
      setFirstNode(getFirstNode().getNext());
      //return the original first node, now removed from list
      return save;
    }
    //if list is empty, throw exception, as there is no first node to remove
    else
      throw new NoSuchElementException();
  }
  
  /*
   * Reverses a given linked list
   */
  public void reverse(){
    //if list is empty, throw exception, as there is no list to reverse
    if(isEmpty()){
      throw new IllegalStateException("The list is empty");
    }
    //otherwise, continue with operation
    else{
      //save current node, which is set to start at the first node of list
      LLNode<T> current = getFirstNode();
      //save next node
      LLNode<T> next = null;
      //save previous node
      LLNode<T> prev = null;
      //iterates through as long as current is not null
      while(current != null){
        //sets next to be current's next
        next = current.getNext();
        //sets current's next to be previous
        current.setNext(prev);
        //sets previous to be current 
        prev = current;
        //sets current to be next 
        current = next;
      }
      //sets first node to be previous
      setFirstNode(prev);
    }
  }
  
  /*
   * Converts linked list to String format
   * @return String version of linked list
   */
  @Override
  public String toString(){
    //initializes String result
    String result = "";
    //saves current node, which is set to start at the first node of list
    LLNode<T> current = getFirstNode();
    //iterates through as long as current is not null
    while(current != null){
      //for every iteration, retrieve element from list and add it to String result
      result += current.getElement();
      //if current's next is not null, add a comma after each element added to String result
      if(current.getNext() != null){
        result += ", ";
      }
      //increment current
      current = current.getNext();
    }
    //returns the String version of linked list
    return "List: " + result;
  }
}