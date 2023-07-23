package learn.s12.model;

public class LPAStudent extends Student {

    private double percentComplete; // how far along is a student in the course

    public LPAStudent () {
	percentComplete = random.nextDouble(0, 100.001);
    }

    public double percentCompleted() { return percentComplete; }
    
    @Override public String toString() {
	return "%s %8.1f%%".formatted(super.toString(), percentComplete);
    }
}
