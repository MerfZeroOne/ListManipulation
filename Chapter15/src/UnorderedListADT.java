
public interface UnorderedListADT<T> extends ListADT<T> {

	/**
	 * adds a specified element to the front of the list
	 * @param element
	 */
	public void addToFront(T element);
	
	/**
	 * adds a specified element to the rear of the list
	 */
	
	public void addToRear(T element);
	
	/**
	 * adds a specific element after the specified target
	 */

	public void addAfter (T element, T target);
}
