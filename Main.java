//Name: Samuel Noel
//Date 10/20/2019
//Program Name: Noel_Mod7GUIOccurence
//purpose: count words and show in a gui

package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;

/**
 * This Class will read in words from a play and display what word and how many times it occurred(only top 20 words)
 * @author Samuel Noel
 *
 */
public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws FileNotFoundException {

		
		File play = new File("src/play.txt"); // This will grab the Play that is located in SRC folder
		Scanner input = new Scanner(play);// This reads the file
		Words testWord = new Words("Play", 12);
		Words testWord2 = new Words("death", 15);
		int test;
		String[] wordsArray = new String[18250]; // An array that holds all the words of the play
		ArrayList<Words> finalWords = new ArrayList<Words>();// An array list that will hold all the "Word" objects
		test =testWord.addTimes(testWord.count, testWord2.count);
		int count = 0;

		while (input.hasNext()) {// This while function will fill the array with the words of the play

			wordsArray[count] = input.next();
			// System.out.println(count+wordsArray[count]);//TEST
			count++;
		} // End while

		///////////////////////////////////////////////////
		int arrayCounter = 0;
		for (int i = 0; i < wordsArray.length; i++)
			if (wordsArray[i] != null)
				arrayCounter++;
		// This gets an effective size so we can traverse array
		/////////////////////////////////////////////////////
		boolean check = true;

		for (int i = 0; i < arrayCounter; i++) {// Level 1 for that sets up the word we are checking
			Words wordRead = new Words();// Create wordRead
			wordRead.word = wordsArray[i];

			check = wordChecker(arrayCounter, finalWords, wordsArray, wordRead); // Checks to see if the word already
																					// exist in the array list
			if (check) {

				for (int j = 0; j < wordsArray.length; j++) {// level 2 for the second word we are comparing it to

					if (wordRead.word.equals(wordsArray[j])) {
						wordRead.count++;

					} // End If

				} // for level2
				finalWords.add(wordRead);

			} // end if

		} // for level1
		
		
		System.out.println("Test should be 27 and test is: " + test );
		Label label = new Label("Macbeth Play Stats");
		FlowPane fPane = new FlowPane(Orientation.VERTICAL, 20.0,20.0, label);

		Collections.sort(finalWords, Collections.reverseOrder());// reverses the sort
		int topWords = 20;

		for (int z = 0; z < topWords; z++) {// For loop that only shows top 20 words
			fPane.getChildren().add(new Label(finalWords.get(z).toString()));
//			System.out.println(finalWords.get(z));
		}
	
		BorderPane root2 = new BorderPane();
		BorderPane root = new BorderPane();
		
		Scene scene2 = new Scene(root2, 400, 400);
		Button showME = new Button("Show Me Play Stats");//Button
		
		
		try {
			
			root.setCenter(showME);
			root2.setCenter(fPane);
			Scene scene = new Scene(root, 400, 400);
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}

		showME.setOnAction(e ->{
			

			primaryStage.setScene(scene2);
			
		});
		
	}// End Primary stage

	/**
	 * Function that checks if the word is already in the array or not
	 * @param arrayCounter
	 * @param finalWords the main array that is being referenced
	 * @param wordsArray 
	 * @param wordRead words that have been read in from the play file
	 * @return returns true or false if the word is in the array
	 */
	private static boolean wordChecker(int arrayCounter, ArrayList<Words> finalWords, String[] wordsArray,
			Words wordRead) {
		boolean finalDecision = true;
		for (int i = 0; i < finalWords.size(); i++) {
			if (wordRead.word.equals(finalWords.get(i).word)) {
				finalDecision = false;
			} // end if

		} // End for

		return finalDecision;
	}// end wordChecker

	public static void main(String[] args) {
		launch(args);
	}
}// End Application
