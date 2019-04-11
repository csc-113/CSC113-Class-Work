package classworkapril4;

/**
 * Class CSC113
 * @author Davindra O'Neal
 * Purpose of Program - 
 */
public class Employee {
    private String name;
    private String address;
    private double salary = 500.00;
    private static int employeeId = 100;
    
    Employee(){
    this.salary = 500.00;
    employeeId++; 
 }
////     Employee(String name, String address, double salary ) {
////     this.name = name;
////     this.address = address;
////     this.salary = salary;
////     employeeId++;
// }
     public void setName(String name){
         this.name = name;
     }
     public String getName(){
         return name;
     }
     
     public void setAddress(String address){
         this.address = address;
     }
     public String getAddress(){
         return address;
     }
     
     public void setSalary(double salary){
         if (salary >= 1000.00){
             this.salary = salary;
             System.out.println("This Salary is valid.");
         }
         else
             System.out.println("Your salary is only " + salary + 
                     " please visit the HR Dept, we will revert to "
             + "the default salary of " + this.salary);
     }
     public double getSalary(){
         return salary;
     }
public void print() {
    System.out.println(name + " lives at/in " + address + ". They make $" +
            salary + " and their employeeID is " + employeeId );
}
}
