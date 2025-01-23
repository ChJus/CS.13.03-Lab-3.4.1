import java.util.LinkedList;

public class CISStack {
  // Linked list property.
  private LinkedList<Object> list;

  // Constructor.
  public CISStack() {
    this.list = new LinkedList<>();
  }

  // Push. This method pushes a value onto the top of the stack.
  public void push(Object element) {
    list.addLast(element);
  }

  // Pop. This method pops a value from the top of the stack.
  public Object pop() {
    if (isEmpty()) return null;
    return list.removeLast();
  }

  // isEmpty. Returns a boolean indicating whether the linked list is empty.
  public boolean isEmpty() {
    return list.isEmpty();
  }

  // size. Returns the size of the queue.
  public int size() {
    return list.size();
  }

  // toString. Returns a description of the queue in, for example, the following format:
  // CISStack{stack=[7, 11], size=2}
  @Override
  public String toString() {
    String result = "CISStack{stack=[";
    for (int i = 0; i < this.size(); i++) {
      result += list.get(i) + (i == size() - 1 ? "" : ", ");
    }
    result += "], size=" + size() + "}";
    return result;
  }
}
