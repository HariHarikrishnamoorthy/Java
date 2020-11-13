package JAVA.util.List;

@SuppressWarnings({ "hiding" })
public interface List<Object> {
	public void add(Object[] elements);
	public void add(Object item);
	public int size();
	public Object get(int index);
	public void set(int index, Object value);
	public int indexOf(Object data);
	public int lastIndexOf(Object data);
	public boolean inserAt(int index, Object element);
	public boolean replace(Object replaceItem, Object newItem);
	public boolean replaceAtEnd(Object replaceItem, Object newItem);
	public boolean replaceAll(Object replaceItem, Object newItem);
	public void deleteAt(int index);
	public void delete(Object item);
	public void deleteAtEnd(Object item);
	public void deleteAll(Object item);
	public boolean contains(Object item);
	public boolean containsAll(Object[] elements);
	public void swap(int source , int destinaion);
	public void reversed();
	public String toString();
	public boolean isEmpty();
}
