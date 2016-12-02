import java.util.Scanner;

public class Part1 {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		int[] myArray = {1,3,7,13,17,21};
		int index = -1;
		int userValue;
		
		System.out.print("Array: ");
		for(int i = 0; i< myArray.length;i++){
			// This will display all values
			System.out.print(myArray[i] + "  ");
		}
		
		System.out.println("What value do you wnat the index of?");
		userValue = userInput.nextInt();
		
		
		for(int i = 0; i< myArray.length;i++){
			
			if(myArray[i] == userValue){
		    	index = i;
			}
			if(myArray[i] == userValue){
				System.out.println("The number you searched the index");
			}
			else{
				System.out.println("The number you searched for with");
			}
		}
		
		
		
		userInput.close();
   }
	
}