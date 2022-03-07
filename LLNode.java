/*
 * @author Nabaa Khan
 * A class that implements a linked list node
 */
public class LLNode<T> {
  
  // Stores the element
  private T element;
  
  // Stores the next node in the list
  private LLNode<T> next;
  
  /**
   * Creates the linked list node
   * @param element the element to store in the node
   * @param next the next node in the list
   */
  public LLNode(T element, LLNode<T> next) {
    this.element = element;
    this.next = next;
  }
  
  /**
   * Retrieve the element
   * @return the element
   */
  public T getElement() {
    return element;
  }
  
  /** 
   * Retrieve the next node in the list
   * @return the next node
   */
  public LLNode<T> getNext() {
    return next;
  }
  
  /**
   * Change the element in the node
   * @param element the new element to store
   */
  public void setElement(T element) {
    this.element = element;
  }
  
  /**
   * Change the next node in the list
   * @param node the node that should be the next node after this one
   */
  public void setNext(LLNode<T> node) {
    this.next = node;
  }
}