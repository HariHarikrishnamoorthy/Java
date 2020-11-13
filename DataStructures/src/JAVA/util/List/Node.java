package JAVA.util.List;

final public class Node {
	protected Object data;
	protected Node prev = null, next = null;
	
	public Node(){} 
	public Node(Object data){
		this.data = data;
	}
	
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public Node getPrev() {
		return prev;
	}
	public void setPrev(Node prev) {
		this.prev = prev;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public String toString(){
		return  this.data.toString();
	}
}