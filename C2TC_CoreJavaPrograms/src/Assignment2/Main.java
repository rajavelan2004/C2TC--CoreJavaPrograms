package Assignment2;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create Student object to trigger default constructor
        Student s = new Student();

        // Create Commission object
        Commission emp = new Commission();
        emp.acceptDetails();
        emp.calculateCommission();
        emp.display();
    }


}
