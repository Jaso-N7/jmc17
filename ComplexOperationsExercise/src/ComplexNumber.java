/**
 *
 * @author jason
 */
public class ComplexNumber {
    
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }
    
    /**
     * Conduct complex number addition
     * 
     * given: 5 + 3i and 4 + 2i , expect: 9 + 5i
     * 
     * @param real
     * @param imaginary
     */
    public void add(double real, double imaginary){
        this.real += real;
        this.imaginary += imaginary;
    }
    
    public void add(ComplexNumber cn){
        add(cn.real, cn.imaginary);
    }
    
    public void subtract(double real, double imaginary){
        this.real -= real;
        this.imaginary -= imaginary;
    }
    
    public void subtract(ComplexNumber cn){
        subtract(cn.real, cn.imaginary);
    }
    
}
