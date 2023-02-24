import java.util.Random;
import javax.swing.*;

public class PhraseOMatic {

    public static void main (String... args) {

	// 1. make 3 sets of words to choose from. Can also add your own
	String[] wordList1 = {"agnostic", "opinionated", "voice activated",
			      "haptically driven", "extensible", "reactive",
			      "agent based", "functional", "AI enabled",
			      "strongly typed", "disruptive",
			      "dynamically typed", "lisp based"};
	String[] wordList2 = {"loosely coupled", "six sigma", "asynchronous",
			      "event driven", "pub-sub", "IoT", "cloud native",
			      "service oriented", "containerized", "serverless",
			      "microservices", "distributed ledger", "DeFi",
			      "realtime"};
	String[] wordList3 = {"framework", "library", "DSL", "REST API",
			      "repository", "pipeline", "service mesh",
			      "architecture", "perspective", "design",
			      "orientation", "wealth management"};

	// 2. find out how many words are in each list
	int list1Length = wordList1.length,
	    list2Length = wordList2.length,
	    list3Length = wordList3.length;

	// 3. generate the three random numbers
	Random generator = new Random();
	int rand1 = generator.nextInt( list1Length ),
	    rand2 = generator.nextInt( list2Length ),
	    rand3 = generator.nextInt( list3Length );

	// 4. now build a phrase
	String phrase = wordList1[ rand1 ] + " " +
	    wordList2[ rand2 ] + " " + wordList3[ rand3 ];

	JOptionPane.showMessageDialog( null,
				       "What we need is a " +
				       phrase,
				       "Phrase-O-Matic",
				       JOptionPane.INFORMATION_MESSAGE);
	
	
    } // psvm
} // PhraseOMatic
