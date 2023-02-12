/**
 * From my understanding, this is similar to a macro for POJOs; Records are used
 * for immutability. No setters, only getters.
 * 
 * Introduced in JDK 14, became standard in JDK 16
 * 
 * @author jason
 */
public record JMCStudent(String id, String name, String dateOfBirth, String classList) {

}
