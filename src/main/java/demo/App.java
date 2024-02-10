/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package demo;

import java.awt.AWTException;
import java.net.MalformedURLException;

public class App {
    public void getGreeting() throws InterruptedException, MalformedURLException, AWTException {

        // This is to remove unnecessary warnings from your console
        System.setProperty("java.util.logging.config.file", "logging.properties");

        // TestCases tests = new TestCases(); // Initialize your test class
        // tests.testCase01();

        // TODO: call your test case functions one after other here

        // SearchAmazon searchAmazon = new SearchAmazon();
        // searchAmazon.testCase01();

        // BookMyShowCountHyperlinks countHyperlinks = new BookMyShowCountHyperlinks();
        // countHyperlinks.testCase01();

        // ImageURLs imageURLs = new ImageURLs();
        // imageURLs.testCase01();

        // Linkedin linkedin = new Linkedin();
        // linkedin.testCase01();

        // IMDBRatings imdbRatings = new IMDBRatings();
        // imdbRatings.testCase01();

        // FramesText framesText = new FramesText();
        // framesText.testCase01();

        // WindowHandles windowHandles = new WindowHandles();
        // windowHandles.testCase01();

        // AlertPrompt alertPrompt = new AlertPrompt();
        // alertPrompt.testCase01();

        // GoogleNameLinks googleNameLinks = new GoogleNameLinks();
        // googleNameLinks.testCase01();

        LinkedImageUpload linkedImageUpload = new LinkedImageUpload();
        linkedImageUpload.testCase01();

        // END Tests
        // tests.endTest(); // End your test by clearning connections and closing
        // browser
        // searchAmazon.endTest();
        // countHyperlinks.endTest();
        // imageURLs.endTest();
        // linkedin.endTest();
        // imdbRatings.endTest();
        // framesText.endTest();
        // windowHandles.endTest();
        // alertPrompt.endTest();
        // googleNameLinks.endTest();
        linkedImageUpload.endTest();
    }

    public static void main(String[] args) throws InterruptedException, MalformedURLException, AWTException {
        new App().getGreeting();
    }
}