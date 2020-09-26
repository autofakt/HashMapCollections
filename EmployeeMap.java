import java.util.*;

class Employee{
    private int id;
    private String name;
    
    public Employee(int id, String name){
        this.id = id;
        this.name = name;
    }
    
    public int getID(){
        return this.id;
    }
    
    public String getName(){
        return this.name;
    }
}

class EmployeeMapClass{
    private Map<Integer, Employee> workMap;
    
    public EmployeeMapClass(){
        workMap = new HashMap<>();
    }
    
    public void add(Employee e){
        workMap.put(e.getID(), e);
    }
    
    public Employee getEmployee(int id){
        Employee temp = workMap.get(id);
        return temp;
    }
    
}

public class EmployeeMap
{
	public static void main(String[] args) {
		
	    	EmployeeMapClass em = new EmployeeMapClass();
		
		em.add(new Employee(1,"Eason"));
		em.add(new Employee(2,"Lisa"));
		em.add(new Employee(3,"Anna"));
		em.add(new Employee(4,"Olivia"));
		em.add(new Employee(5,"Madelyn"));
		em.add(new Employee(6,"Sam"));
		em.add(new Employee(7,"Will"));
		em.add(new Employee(8,"Johnson"));
  
		Scanner keyboard = new Scanner(System.in);
		int option;
		boolean go = true;
		while(go){
		    System.out.print("Please enter the employee ID or Negative Number to Exit: ");
		    option = keyboard.nextInt();
		    if (option < 0){
		        go = false;
		        break;}
		    Employee temp = em.getEmployee(option);
		    if(temp == null )
		        System.out.println("This employee id doesn't exist!\n");
		    else
		        System.out.println("This employee is: " +temp.getName());
		    
		}
		System.out.println("Exiting the program!\n");
	}
}
