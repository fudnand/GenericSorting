/*
 * A sorting technique that implements the SortInterface interface.
 */ 
public class SelectionSort<T extends Comparable> implements SortInterface<T>{	
	public long startTime, endTime, totalTime;

	@Override
	public void sorting(T[] arr) {
		startTime = System.nanoTime();
		
		int numbElements = arr.length; 
		
		for(int i = 0; i < numbElements; i++){
			T tempMin = arr[i];
			int min = i;
			for(int j = i+1; j < numbElements; j++){
				if(arr[j].compareTo(arr[min]) >0){
					min = j;
				}	
			}
			T temp = arr[min];
			arr[min] = arr[i];
			arr[i]= temp;		
		}	
	    endTime   = System.nanoTime();
	    totalTime = endTime - startTime;

	}//selection sort descending order 

	@Override
	public long getTotaltime() {
		return totalTime;
	}
}