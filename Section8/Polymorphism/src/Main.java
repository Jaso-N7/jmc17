
import javax.swing.JOptionPane;

/**
 * An example of using Polymorphism
 *
 * @author jason
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        while (true) {

            String type, title;
            try {
                type = JOptionPane.showInputDialog("Enter Type (A for Adventure, C for Comedy, "
                        + "S for Science Fiction, or Q to quit");

                // User decides to quit
                if ("Qq".contains(type)) {
                    throw new NullPointerException();
                }

                title = JOptionPane.showInputDialog("Enter movie title: ");
                // If user clicks Cancel here, have them start over.
                if (title == null) 
                    continue;
                
                Movie movie = Movie.getInstance(type, title);

                JOptionPane.showMessageDialog(null,
                        movie.watchMovie() + "\n" + movie,
                        "Movie Info",
                        JOptionPane.INFORMATION_MESSAGE);

            } catch (NullPointerException npe) {
                // User clicks the 'Cancel' button
                break;
            }
        }

        System.exit( 0 );
    }

}
