import java.util.Scanner;

public class Part2 {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		double[] userNum = new double[10];
		double userValue;
		double index = 0;
		
		
		System.out.println("Enter 5 integers");
		
		for(int i = 0; i< userNum.length;i++){
			System.out.println("What number would you wnat in the array:");
			userNum[i] = userInput.nextDouble();
			
		}
		System.out.println("Input the number you would like to check:");
		userValue = userInput.nextDouble();
		for(int i = 0; i< userNum.length;i++){
				
			if(userNum[i] > userValue){
			   index++;
		}
		System.out.println("The number shows up:" + index + "times");
				
		userInput.close();
		}
	}
}


