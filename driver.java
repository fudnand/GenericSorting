import java.util.*;
/*
 * This uses the two sorting algorithms created that implement the created SortInterface 
 * to sort various data types: strings, integers, students, etc. 
 */
public class driver {
	public static void main(String[] args) {
		
		Integer arr[] = {0, 34, 60, 10, 40, 4, 45, 55, 0};		
		System.out.print("Before: ");
	    for (int i=0; i<arr.length; i++)
	    System.out.print(arr[i]+" ");
	    
		System.out.println();
		
		SelectionSort temp = new SelectionSort();
		temp.sorting(arr); 
		System.out.print("After: ");  
	    for (int i=0; i<arr.length; i++)
	    System.out.print(arr[i]+" ");
	    System.out.println("\nIt took: " + temp.getTotaltime()+" nanoseconds.\n" );//descending
	    	    
	    String[] apt = {"ab", "cb", "bb", "aa"};
	    for (int i=0; i<apt.length; ++i)
	    System.out.print(apt[i]+" ");
	    
	    System.out.println();    
	    temp = new SelectionSort();        
	    temp.sorting(apt);
	    for (int i=0; i<apt.length; ++i)
	    System.out.print(apt[i]+" ");
	    System.out.println("\nIt took: " + temp.getTotaltime()+" nanoseconds \n");//descending
	    
	    InsertionSort test = new InsertionSort();  
	    Student[] holdStudents = new Student[5];
	    Student s1 = new Student("Abe", 3.8F);
	    Student s2 = new Student("Bob", 3.8F);
		Student s3 = new Student("Bob", 4.0F);
		Student s4 = new Student("Brat", 3.85F);
		Student s5 = new Student("Crabbe", 3.90F);
		
		holdStudents[0] = s5;
		holdStudents[1] = s2;
		holdStudents[2] = s3;
		holdStudents[3] = s4;
		holdStudents[4] = s1;
		
	    for (int i=0; i<holdStudents.length; ++i)
	    System.out.print(holdStudents[i]+" ");	    
		test.sorting(holdStudents);		
		System.out.println("\n");
	    for (int i=0; i<holdStudents.length; ++i)
	    System.out.print(holdStudents[i]+" ");
	    System.out.println("It took: " + temp.getTotaltime()+" nanoseconds " );
	}
}




