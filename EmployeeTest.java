class employee{
    String first_name;
    String last_name;
    double monthly_salary;
    employee(String first_name, String last_name, double monthly_salary){
        this.first_name = first_name;
        this.last_name = last_name;
        this.monthly_salary = monthly_salary;
    }
    public String getfirst_name(){
        return first_name;
    }
    public void setfirst_name(String first_name){
        this.first_name = first_name;
    }
    public String getlast_name(){
        return last_name;
    }
    public void setlast_name(String last_name){
        this.last_name = last_name;
    }
    public double getmonthly_salary(){
        return monthly_salary;
    }
    public void setmonthly_salary(double monthly_salary){
        if(monthly_salary > 0)
            this.monthly_salary = monthly_salary;
        else
            this.monthly_salary = 0.0;
    }
    public double yearly(){
        return monthly_salary * 12;
    }
    public double raise(){
        return yearly() + yearly()*0.1;
    }
}
public class EmployeeTest {
    public static void main(String[] args) {
        employee emp1 = new employee("nistha","diwedi",200000);
        employee emp2 = new employee("xyz","abc",100000);
        System.out.println("name of employee is = "+emp1.getfirst_name()+" "+emp1.getlast_name());
        System.out.println("yearly salary is = "+emp1.yearly());
        System.out.println("yearly salary after a raise = "+emp1.raise());
        System.out.println("name of employee is = "+emp2.getfirst_name() +" "+emp2.getlast_name());
        System.out.println("yearly salary is = "+emp2.yearly());
        System.out.println("yearly salary after a raise = "+emp2.raise());}
}
