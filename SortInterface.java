import java.util.LinkedList;

/*
 * This interface uses polymorphism and generics to sort various data types 
 * from an array data structure (it can be modified to sort other data structures should the need be). 
 * Also provides the total sorting time through the 
 * getTotaltime() mehtod ; This interface also extends the comparable interface.
 */
interface SortInterface<T extends Comparable>{
	void sorting(T[] arr);	
	long getTotaltime();
}