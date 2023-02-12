
import javax.swing.JOptionPane;

/**
 * An example of POJOs and Records
 * @author jason
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        generateStudentPOJO();
        generateStudentRecord();
        
        Student pojo = new Student("POJO1", "Freddie", "1999/02/05", "Java Masterclass");
        JMCStudent record = new JMCStudent("REC01", "Ginger", "1994/10/05", "Java Masterclass");
        
        JOptionPane.showMessageDialog(null, 
                String.format("%s%n".repeat(2), pojo , record));
        
        pojo.setClassList(pojo.getClassList() + ", Java OCP 829");
        
        JOptionPane.showMessageDialog(null, String.format(
                "%s is taking %s%n".repeat(2),
                pojo.getName(), pojo.getClassList(),
                record.name(), record.classList()));
        
    }

    private static void generateStudentPOJO() {
        for (int i = 1; i <= 5; i++) {
            Student s = new Student("JMC0" + i, 
                    switch(i){
                        case 1 -> "Adrian";
                        case 2 -> "Barkely";
                        case 3 -> "Cameron";
                        case 4 -> "Dave";
                        case 5 -> "Eddie";
                        default -> "Unregistered";
                    },
                    "198" + (i + 1) + '/' + (i * 2) + '/' + (i +3) , 
                    "Java Master Class (JDK 17)");
            
            System.out.println(s);
        }
    }
    
    private static void generateStudentRecord() {
        for (int i = 1; i <= 5; i++) {
            JMCStudent s = new JMCStudent("JMC0" + i, 
                    switch(i){
                        case 1 -> "Adrian";
                        case 2 -> "Barkely";
                        case 3 -> "Cameron";
                        case 4 -> "Dave";
                        case 5 -> "Eddie";
                        default -> "Unregistered";
                    },
                    "198" + (i + 1) + '/' + (i * 2) + '/' + (i +3) , 
                    "Java Master Class (JDK 17)");
            
            System.out.println(s);
        }
    }
    
}
