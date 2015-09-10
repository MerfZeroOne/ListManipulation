import java.util.Iterator;


public interface ListADT<T> extends Iterable<T>{
	
	/**
	 * removes and returns the first element in the list
	 */
	
	public T removeFirst();
	
	/**
	 * removes and returns the last element in the list
	 */
	
	public T removeLast();
	
	/**
	 * removes and returns a specified element in the list
	 */
	
	public T remove(T element);
	
	/**
	 * returns a reference to the first element in this list
	 */
	
	public T first();
	
	/**
	 * returns a reference to the last element in this list
	 */
	
	public T last();
	
	/**
	 * returns true if this list contains the sought after element
	 */
	
	public boolean contains (T target);
	
	/**
	 * returns true if this list contains no elements
	 */
	
	public boolean isEmpty();
	
	/**
	 * returns the number of elements in this list
	 */
	
	public int size();
	
	/** 
	 * returns an iterator for the elements in this list
	 */
	
	public Iterator<T> iterator();
	
	/**
	 * returns a string representation of this list
	 */
	
	public String toString();
}

