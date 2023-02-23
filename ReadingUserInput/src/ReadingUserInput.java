import java.util.Scanner;

public class ReadingUserInput {

    public static void main( String[] years ) {

	// If the user passed command line arguments, run this
	try {
	    
	    if ( years.length == 0 || years.length < 3 ) {
		throw new ArrayIndexOutOfBoundsException( "Missing arguments, See Usage." );
	    }
	
	    readInArgs( years[0], years[1], years[2] );
	    
	} catch ( ArrayIndexOutOfBoundsException oob ) {
	    System.out.println( oob.getMessage() );
	    System.out.println( "Usage: java [-cp classPath] ReadingUserInput personName thisYear yearOfBirth\n" );
	    System.out.println( "Enabling interactive mode..." );

	    int currentYear = 2023;

	    try{
		System.out.println( getInputFromConsole( currentYear ) );
	    } catch ( NullPointerException npe ) {
		System.out.println( getInputFromScanner( currentYear ) );
	    }
	}

	System.exit( 0 );
	
    } // psvm

    /**
     * Calculates the date of birth of someone from the command line
     * arguments passed when the program was called.
     *
     * @param args - An array of strings that captures input at startup
     *
     * As a side-effect, prints the output to console.
     */
    private static void readInArgs ( String person, String current, String birth ) {

	int currentYear = Integer.parseInt( current ); 

	System.out.println( String.format("""
					  Hi %s, Thanks for taking the course!
					  So you are %d years old!
					  """,
					  person,
					  getAge( currentYear, birth ) ) );
    } // readInArgs

    public static String getInputFromConsole ( int currentYear ) {

	String name = System.console().readLine( "Hi, What's your Name? " );
	System.out.println( "Hi " + name + ", Thanks for taking the course!" );

	String dateOfBirth = System.console().readLine( "What year were you born? " );
	
	return "So you are " +
	    getAge( currentYear, dateOfBirth ) +
	    " years old";
    } // getInputFromConsole

    public static String getInputFromScanner ( int currentYear ) {

	Scanner scanner = new Scanner( System.in );
	
	System.out.println( "Hi, What is your name? " );
	String name = scanner.nextLine();
	System.out.println( "Hi " + name + ", Thanks for taking the course!" );

	System.out.println( "What year were you born? " );
	String dob = scanner.nextLine();
	
	return "So you are " +
	    getAge( currentYear, dob ) +
	    " years old";
    } // getInputFromScanner

    private static int getAge( int thisYear, String dob ){
	return ( thisYear - ( Integer.parseInt( dob ) ) );
    }
    
} // ReadingUserInput
 
