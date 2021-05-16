package za.ac.cput.assignment_2;
import java.util.*;

//*  Author
//   Name         : Themba Khanyile
//   StudentNumber:217238173

public class EmployeeSet extends CollectionModel

{


         //Adding
        private  String employeeName;
        private  int employeeNumber;

    public EmployeeSet(String employeeName, int employeeNumber) {
        this.employeeName = employeeName;
        this.employeeNumber = employeeNumber;
    }


    public static int size() {
        return size();
    }


    public String getEmployeeName() {
        return employeeName;
    }



    @Override
    public int hashCode() {
        return Objects.hash(employeeNumber);
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public  String toString() {
        return"set{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeNumber=" + employeeNumber +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeSet EmployeeSet = (EmployeeSet) o;
        return employeeNumber == EmployeeSet.employeeNumber;
    }
}


