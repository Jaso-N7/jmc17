/**
 * A Person is a
 * Person p = new Person()
 * 
 * @author jason
 */
public class Person {
    
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        
        if(age < 0 || age > 100){
            this.age = 0;
        } else {
            this.age = age;
        }
        
    }
   
    /**
     * Checks if the Person is a teenager
     * 
     * @return true if the age is between 13 - 19; Otherwise false
     */
    public boolean isTeen(){
        return (age > 12 && age < 20);
    }
    
    /**
     * 
     * @return The full name of the Person
     */
    public String getFullName(){
        
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return "";
        } else if ( lastName.isEmpty() ) {
            return firstName;
        } else if ( firstName.isEmpty() ) {
            return lastName;
        } else {
            return firstName + " " + lastName;
        }
    }
    
}
