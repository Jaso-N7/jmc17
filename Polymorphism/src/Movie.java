/**
 *
 * @author jason
 */
public class Movie {
    
    private String title;
    
    public Movie(String movieTitle) {
        title = movieTitle;
    }
    
    public String getTitle(){
        return title;
    }
    
    public String watchMovie(){
        
        return String.format("%s is a(n) %s%n",
                title, this.getClass().getSimpleName());
    }
    
    /**
     * Returns an instance that is described by its parameters, but cannot be 
     * said to have the same value.
     * 
     * Movie m = Movie.getInstance("Adventure", "Indiana Jones");
     * 
     * @param type
     * @param title
     * @return A movie instance that is described by its type.
     */
    public static Movie getInstance(String type, String title){
        
        return switch(type.toUpperCase().charAt(0)){
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new SciFi(title);
            default -> new Movie(title);
        };
    }
    
    @Override
    public String toString() {
        return "Movie Name: " + title;
    }
 
    
}

final class Adventure extends Movie {

    public Adventure(String movieTitle) {
        super(movieTitle);
    }

    @Override
    public String watchMovie(){
        return 
            super.watchMovie() +
            String.format(".. %s%n".repeat(3),
                    "Pleasant Scene",
                    "Epic Music",
                    "Something Epic Happens");
        
    }

    @Override
    public String toString() {
        return super.toString() + "\nCategory: Adventure";
    }
    
}

final class Comedy extends Movie {

    public Comedy(String movieTitle) {
        super(movieTitle);
    }

    @Override
    public String watchMovie(){
        return 
            super.watchMovie() +
            String.format(".. %s%n".repeat(3),
                    "Funny Moment",
                    "Funnier Moments",
                    "Happy Ending");
        
    }

    @Override
    public String toString() {
        return super.toString() + "\nCategory: Comedy";
    }
    
}

final class SciFi extends Movie {

    public SciFi(String movieTitle) {
        super(movieTitle);
    }

    @Override
    public String watchMovie(){
        return 
            super.watchMovie() +
            String.format(".. %s%n".repeat(3),
                    "Alien Invasion",
                    "New Scientific Discovery",
                    "Aliens Defeated");
        
    }

    @Override
    public String toString() {
        return super.toString() + "\nCategory: Science Fiction";
    }
    
}