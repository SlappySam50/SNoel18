package application;
import java.util.*;
/**
 * This class is a "Word" object which has a String variable and an int.
 * @author Samuel Noel
 *
 */
public class Words implements Comparable<Words>{

	public String word;
	public int count;
	
	/**
	 * This constructs a word object that holds the word and how many times it showed up in the play/
	 * @param word This variable is a word that was read from the play
	 * @param count This is the variable that is incremented when the word occurs more than once
	 */
	
	public Words(String word, int count) {
		super();
		this.word = word;
		this.count = count;
	}
	
	public Words() {
		
	}
	/**
	 * 
	 * @return This will return the word
	 */
	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	/**
	 * 
	 * @return This returns the count
	 */
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	/**
	 * @param This will make the number of times a word has occurred comparable. 
	 */
	public int compareTo(Words wordComp) {
		
		return (this.getCount() < wordComp.getCount() ? -1:
				(this.getCount() == wordComp.getCount() ? 0: 1));
				//compareTo(wordComp.getCount());
	}//end compare to- overridden method that helps compare the ages of the individual objects.
	
	/**
	 *  This is for J-Unit testing
	 * @param t
	 * @param t2
	 * @return
	 */
	public int addTimes(int t, int t2) {
		t = t + t2;
		return t;
		
	}
	

	@Override
	public String toString() {
		return word + " - Occures: " + count + " times!" ;
	}
	
	
	
	
	
	
}
