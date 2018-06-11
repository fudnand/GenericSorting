/*
 * This is a student class that holds student information e.g. name & gpa.
 * This class implements the comparable interface; overrides the compareTo Method 
 * and provides an easy way to compare students
 */
public class Student implements Comparable<Student>  {
	String name;
	float gpa;
	
	public Student(String n, float d){
		name = n;
		this.gpa = d;
	}
	public Student(Student p){
		name = new String(p.name);
		gpa = p.gpa;
	}
	@Override
	public int compareTo(Student l) {
		if(l.name.equalsIgnoreCase(name)){		
			
			if(gpa > l.gpa  )
				return -1;
			else if(gpa == l.gpa){
				return name.compareTo(l.name);
			}
			return 1; 
		}
		return (l.name.compareTo(name));		
	}
	public boolean equals(Student j){
		if (gpa == j.gpa){
			if(name.equalsIgnoreCase(j.name)){
				return true;
			}
		}
		return false;
	}
	public String toString(){
		return name + " \nGpa: " + gpa +" \n"; 
	}
}