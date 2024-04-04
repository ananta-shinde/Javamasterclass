package office.mnagement;
//entites
//1. employee
//2. roles
//3. departments
//4. company
class Department{
    int deptId;
    String name;
    Department(int id,String name)
    {
        this.deptId = id;
        this.name = name;
    }
}
class Employee{
    int empId;
    String name;
    Department dept;

    Role role;
    Employee(int id,String name,Department dept,Role role)
    {
        this.empId = id;
        this.name = name;
        this.dept = dept;
        this.role = role;
    }
    Employee(int id,String name) {
        this.empId = id;
        this.name = name;
    }
    void showDetails() {
        try{
            System.out.println("EmpID:"+ this.empId+"Name:"+this.name+"Dept:"+this.dept.name+"Role:"+this.role.name);
        }catch (NullPointerException e)
        {
            System.out.println("Null Pointer occured");
        }
        catch (Exception e)
        {
             if(this.dept == null && this.role == null)
             {
                 System.out.println("EmpID:"+ this.empId+"Name:"+this.name+"Dept:"+"NA" + "Role:"+"NA");
             }
            else if(this.role == null)
            {
                System.out.println("EmpID:"+ this.empId+"Name:"+this.name+"Dept:"+this.dept.name + "Role:"+"NA");
            }
            else{
                 System.out.println("EmpID:"+ this.empId+"Name:"+this.name+"Dept:"+"NA" + "Role:"+this.role.name);
             }
        }
    }

    void setDept(Department dept)
    {
        this.dept = dept;
    }
}
class Role{
    int id;
    String name;
    Role(int id,String name){
        this.name = name;
        this.id = id;
    }
}

public class OfficeApplication {

    public static void main(String[] args) {
        Department financeDept = new Department(100,"Finance");
        Role admin = new Role(1,"admin");
        Employee emp1 = new Employee(1,"Ananta",null,admin);

        emp1.showDetails();
        System.out.println("program exits");
    }
}
