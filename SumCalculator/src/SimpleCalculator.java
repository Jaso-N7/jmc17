/**
 *
 * @author jason
 */
public class SimpleCalculator {
    
    private double firstNumber;
    private double secondNumber;

    /**
     * @return The value of the first number
     */
    public double getFirstNumber() {
        return firstNumber;
    }

    /**
     * Set the value of the first number
     * @param firstNumber The first number
     */
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    /**
     *
     * @return The value of the second number
     */
    public double getSecondNumber() {
        return secondNumber;
    }

    /**
     * Set the value of the second number
     * @param secondNumber 
     */
    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
    
    /**
     * 
     * @return The result of adding the first and second numbers
     */
    public double getAdditionResult(){
        return this.firstNumber + this.secondNumber;
    }
    
    /**
     * 
     * @return The result of subtracting the second number from the first
     */
    public double getSubtractionResult() {
        return firstNumber - secondNumber;
    }
    
    /**
     * 
     * @return The result of multiplying the first and second number
     */
    public double getMultiplicationResult(){
        return firstNumber * secondNumber;
    }
    
    /**
     * 
     * @return The result of division of the first number by the second
     */
    public double getDivisionResult(){
        
        if (secondNumber == 0.0d) {
            return 0.0d;
        } else {
            return firstNumber / secondNumber;
        }
        
    }
}
