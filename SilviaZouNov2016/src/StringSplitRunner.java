import java.util.Arrays;

public class StringSplitRunner{
	public static void main(String[] args) {
		String string = "bacon pineapple bread ham chese lettuce bread tomatos mayo";
		String splitWord = "bread";
		String[] splitArray = removeBread(string, splitWord);
		System.out.println(Arrays.toString(splitArray));
		String[] spaceSplitArray = splitSpaces(string);
		System.out.println(Arrays.toString(spaceSplitArray));
		//It's a method that acts on a string, <StringName>.split(<String sp>);
		//Where sp is the string where the string splits
		//And it returns an array
		// Example: "I like apples!".split(" "); 
		//		it will split at spaces and return an array of ["I","like","apples!"]
		// Example 2: "I really like really red apples"split("really")
		//		it will split at the word "really" and return an array of ["I "," like "," apples!"]
		
		//play around with String.split! what happens if you "I reallyreally like apples".split("really") ?
		
		
		//Your task:
		/*Write a method that take in a string like "applespineapplesbreadlettustomatobaconmayohambreadcheese" describing a sandwich
		 * use String.split to split up the sandwich by the word "bread" and return what's in the middle of the sandwich and ignores what's on the outside
		 * What if it's a fancy sandwich with multiple pieces of bread?
		*/
		
		
		//Your task pt 2:
		/*Write a method that take in a string like "apples pineapples bread lettus tomato bacon mayo ham bread cheese" describing a sandwich
		 * use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of the sandwich and ignores what's on the outside
		 * Again, what if it's a fancy sandwich with multiple pieces of bread?
		*/
	} 
	public static String[] removeBread(String string, String splitWord){
		java.lang.String[] splitArray = string.split(splitWord);
		return splitArray;
	}
	public static String[] splitSpaces(String string){
		String[] noBread = removeBread(string, "bread");
		String[] withoutBread = new String[noBread.length];
		if (noBread.length>=1){
			for (int i = 0; i <= noBread.length - 1; i++){
				withoutBread[i] = (noBread[i]);
			}
		}
		//withoutBread = string.split(" ");
		return withoutBread;
	}
}