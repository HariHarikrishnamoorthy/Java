package JAVA.util.List;

import JAVA.util.Exceptions.IndexOutOfBound;

final public class ArrayList<E> implements List<E> {
	
	protected int capacity;
	protected int size;
	protected Object[] elements;
	
	public ArrayList(final int capacity){
		this.capacity = capacity;
		this.size = 0;
		this.elements = new Object[(int) this.capacity];
	}
	public ArrayList() {
		this.capacity = 10;
		this.size = 0;
		this.elements = new Object[(int) this.capacity];
	}
	public ArrayList(E[] elements) {
		this.capacity = elements.length*2;
		this.size = 0;
		this.elements = new Object[(int) this.capacity];
		for(E item : elements)
			add(item);
	}
	public int newCapacity(){
		this.capacity*= 2;
		
		return this.capacity;
	}
	public void add(Object[] elements){
		for(Object item : elements )
			add(item);
	}
	public void add(Object item) {
		/**
		 *	if the array get filled, copy array twice the size of size of current 
		 */
		if(this.size == this.capacity){
			this.elements = java.util.Arrays.copyOf(this.elements, this.newCapacity());
		}
		this.elements[this.size()]= item;
		this.setSize(this.size()+1);
	} 
	public int size() {
		return size;
	}
	@SuppressWarnings("unchecked")
	public E get(int index)  {
		if (this.size <= index || index < 0)
		{
			try {
				throw new IndexOutOfBound("Index can't be " + index );
			} catch (IndexOutOfBound e) {
				e.printStackTrace();
			}
			return null;
		}
		return (E) this.elements[index];
	}
	public void set(int index, Object value)  {
		if (this.size <= index || index < 0)
		{
			try {
				throw new IndexOutOfBound("Index can't be " + index );
			} catch (IndexOutOfBound e) {
				e.printStackTrace();
			}
		}
		this.elements[index] = value;
	}
	public int indexOf(Object item){
		for(int index=0; index < this.size; index++){
			if(this.elements[index] == item)
				return index;
		} return -1;
	}
	public int lastIndexOf(Object item){
		for(int index=this.size-1; index >= 0; index--){
			if(this.elements[index] == item)
				return index;
		} return -1;
	}
	public boolean inserAt(int index, Object element){
		if(index >= this.size)
		{
			try {
				throw new IndexOutOfBound("Inserting is imposible");
			} catch (IndexOutOfBound e) {
				e.printStackTrace();
			}
			return false;
		}
		for(int ind=this.size;ind!=index;ind--){
			this.elements[ind] = this.elements[ind-1];
		}	this.elements[index] = element;
		this.size++;
		return true;
	}
	public boolean replace(Object replaceItem, Object newItem){
		for(int index=0;index<this.size;index++){
			if(this.elements[index] == replaceItem){
				this.set(index, newItem);
				return true;
			}
		}	return false;
	}
	public boolean replaceAtEnd(Object replaceItem, Object newItem){
		for(int index=this.size-1;index>=0;index--){
			if(this.elements[index] == replaceItem){
				this.set(index, newItem);
				return true;
			}
		}	return false;
	}
	public boolean replaceAll(Object replaceItem, Object newItem){
		boolean isReplaced = false;
		for(int index=0;index<this.size;index++){
			if(this.elements[index] == replaceItem){
				this.set(index, newItem);
				isReplaced = true;
			}
		}	return isReplaced ;
	}
	public void deleteAt(int index){
		if(index >= this.size)
		{
			try {
				throw new IndexOutOfBound("index out of range for delete");
			} catch (IndexOutOfBound e) {
				e.printStackTrace();
			}
		}
		this.size-=1;
		for(int ind=index;ind<this.size;ind++){
			this.elements[ind] = this.elements[ind+1];
		}this.elements[this.size+1] = null;
	}
	public void delete(Object item){
		deleteAt(indexOf(item));
	}
	public void deleteAtEnd(Object item){
		deleteAt(lastIndexOf(item));
	}
	public void deleteAll(Object item){
		int newIndex = 0;
		for(int originalIndex=0;originalIndex<this.size;originalIndex++){
			if(this.elements[originalIndex] != item ){
				this.elements[newIndex++] = this.elements[originalIndex];
			}
		}
		for(int index = newIndex;index<this.size;index++)
					this.elements[index] = null;
		this.size = newIndex;
	} 
	public boolean contains(Object item){
		for (Object temp: this.elements){
			if(temp == item )
				return true;
		} return false;
	}  
	public boolean containsAll(Object[] elements){
		if(elements.length != this.size)
				return false;
		int index = 0;
		for(Object item : elements){
			if(item != this.elements[index])
				return false;
			index++;
		}		return true;
	}
	public boolean containsAll(ArrayList<E> elements){
		if(elements.size() != this.size)
				return false;
		for(int index=0;index<this.size;index++ ){
			if(elements.get(index) != this.elements[index])
				return false;
		}		return true;
	}

	public void swap(int source , int destinaion) {
		Object temp = this.elements[source];
		this.elements[source] = this.elements[destinaion];
		this.elements[destinaion] = temp;
	}
	public void reversed(){
		if(this.size <= 1)
			return ;
		int index_i = 0, index_j = this.size-1;
		while(index_i < index_j){
			swap(index_i++,index_j--);
		}
	}
	
	private void setSize(int size) {
		this.size = size;
	}
	public String toString(){
		if(isEmpty()) return "null";
		String result = "[";
		for(int index=0;index<this.size;index++) {
			result += this.elements[index].toString();
			if(index != this.size-1)
				result += ", ";
		}
		result += "]";
		return result;
	}
	public boolean isEmpty() {
		return this.size == 0;
	}
}
 