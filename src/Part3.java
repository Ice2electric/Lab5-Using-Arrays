import java.util.Scanner;

public class Part3 {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		double[] userNum = new double[5];
		double userValue;
		double maximum;
		
		
		System.out.println("Enter 5 integers");
		
		for(int i = 0; i< userNum.length;i++){
			System.out.println("Integer:");
			userNum[i] = userInput.nextDouble();
			
			
		}
		maximum = userNum[0];
		for(int i = 0; i< userNum.length;i++){
				
			if(userNum[i] > maximum){
			    maximum = userNum[i];
		}
		System.out.println("The maximum value is:" + maximum+ ".");
				
		userInput.close();
		}
	}
}
