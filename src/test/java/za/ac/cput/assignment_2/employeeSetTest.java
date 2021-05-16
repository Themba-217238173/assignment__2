package za.ac.cput.assignment_2;
import java.util.Collections;
import java.util.Set;
import java.util.HashSet;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class employeeSetTest
{
    Set<String> employee = new HashSet<>();

@Test
    public void  testAdd()
{

    for (int i = 0 ; i< 3 ; i++)
    {

        employee.add("John");
        employee.add("Smith");
        employee.add("David");
    }
   assertEquals(3 ,employee.size());
   System.out.println(employee.toString());
}

@Test
public void testRemove()
{
    for (int i = 0 ; i< 3 ; i++)
    {

        employee.add("Davids");
        employee.add("John");
        employee.add("Smith");
        employee.remove("Smith");
    }
    assertEquals(2 ,employee.size());
    System.out.println("New List of Employees: " + employee.toString());

}

@Test
public void testSearch()
{

    {

        employee.add("Smith");
        employee.add("John");
        employee.add("David");

    }
    assertTrue(employee.contains("John"));
    System.out.println("Employee found : " + employee.contains("John"));
}


}