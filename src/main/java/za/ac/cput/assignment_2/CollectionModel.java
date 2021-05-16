package za.ac.cput.assignment_2;

//*  Author
//   Name         : Themba Khanyile
//   StudentNumber:217238173

public  class CollectionModel
{



       public String moduleName;
       public int moduleId;

 public static void addAll(String moduleName,int moduleId )
 {

 }
 public static void put(String moduleName, int moduleId )
 {

 }
 public static void remove(String moduleName ,int moduleId )
 {

 }
 public String getName() {
  return moduleName;
 }

 public void setName(String moduleName) {
  this.moduleName = moduleName;
 }

 public int getAge() {
  return moduleId;
 }

 public void setAge(int moduleId)
 {
  this.moduleId = moduleId;
 }

 @Override
 public String toString() {
  return "CollectionModel{" +
          ", name='" + moduleName + '\'' +
          ", age='" + moduleId + '\'' +
          '}';
 }



}
