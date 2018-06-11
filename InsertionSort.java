/*
 * A sorting technique that implements the SortInterface interface.
 */
class InsertionSort<T extends Comparable> implements SortInterface<T>{
	public long startTime, endTime, totalTime;
	@Override
	public void sorting(T[] arr) {
		startTime = System.nanoTime();		
		 int n = arr.length;
	     for (int i=1; i<n; i++)
	     {
		 	T toChange = arr[i];
	        int j = i-1;
	        
	        while (j>=0 && arr[j].compareTo(toChange) < 0)
	        {
	            arr[j+1] = arr[j];
	            j = j-1;
	        }
	        arr[j+1] = toChange;
	      }	        
		    endTime   = System.nanoTime();
		    totalTime = endTime - startTime;		
	}//sorts in ascending order

	@Override
	public long getTotaltime() {
		return totalTime;
	} 	
}