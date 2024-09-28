package edu.uw.tcss.app;

import edu.uw.tcss.model.StoreItem;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * A driver class for this application.
 *
 * @author Charles Bryan
 * @version Autumn 2024
 */
public class StarterApplication {

    // TODO: read and complete all TODOs. Once completed, remove all TODO comments.

    // TODO: Right-click on this file -> Analyze -> Inspect Code : then clean up all warnings

    // TODO: In the file menu, View -> Tool Windows -> TODO

    /**
     * A Logger object for all your logging needs.
     * You should move away from using System.out.println as your logging/debugging method.
     */
    public static final Logger LOGGER = Logger.getLogger(StarterApplication.class.getName());

    static {
        // Level.ALL - Display ALL logging messages
        // Level.OFF - Display NO logging messages
        LOGGER.setLevel(Level.ALL);
    }

    /**
     * The entry point into this application.
     *
     * @param theArgs the command-line arguments for this program.
     */
    public static void main(final String[] theArgs) {
        // TODO read, review, then delete the following 4 LOGGER method calls.
        LOGGER.info(() -> "Should you need String concatenation,  "
                + "use a lambda for lazy evaluation. What's that you ask?");
        LOGGER.info(() -> "What is a magic number you ask?,  "
                + 1977);
        LOGGER.severe("This is really bad");
        LOGGER.warning("I've got a bad feeling about this");

        // TODO read, review, then delete the following println metyhod call.
        System.out.println("This should not be used unless this is an actual console application!");
    }

    public static boolean isBlue(String theInput) {
        return theInput.equalsIgnoreCase("BLUE");
    }

    public static boolean isGreen(String theInput) {
        return theInput.equalsIgnoreCase("GREEN");
    }

    public static boolean isRed(String theInput){
        return theInput.equalsIgnoreCase("RED");
    }

}
