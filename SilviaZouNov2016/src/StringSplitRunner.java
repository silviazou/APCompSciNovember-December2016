//Silvia Zou APCS1
//This code will remove the word "bread" from a string and will split it at the 
//places where they were removed or at the places where there is a space.

import java.util.Arrays;

public class StringSplitRunner{
	public static void main(String[] args){
		String string = "bacon pineapplebread hamcheeselettucebreadtomatoesmayo";
		String splitWord = "bread";
		//removes bread from string
		System.out.println(Arrays.toString(removeBread(string, splitWord)));
		//Checks if the string contains spaces
		if(string.indexOf(" ") >= 1){
			System.out.println(Arrays.toString(removeSpaces(string, splitWord)));
		}
	} 
	
	//Method returns the string split at the word bread.
	public static String[] removeBread(String string, String splitWord){
		return (string.split(splitWord)); 
	}
	
	//Method returns the string without bread and without spaces.
	public static String[] removeSpaces(String string, String splitWord){
		String[] noBread = removeBread(string, splitWord);
		String noBreadString = "";
		for(int i = 0; i < noBread.length; i++){
			if(string.indexOf(" ") == 0){
				noBreadString += (noBread[i].substring(1, noBread[i].length()));
			}else{
				noBreadString += noBread[i];
			}
		}
		String[] noSpace = (noBreadString).split(" ");
		return noSpace; 
	}
}
