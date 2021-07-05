import java.util.Scanner;

public class TwoSum
{

	public static boolean getSum(int[] e,int target){
		int i = 0;
		int j =  e.length - 1;
		while(i < j){
			int sum = e[i]+e[j];
			if(sum == target){
				System.out.println("true index1:"+i+" index2:"+j);
				return true;
			}
			else if(sum > target)
				j--;
			else
				i++;
		}
		System.out.println("false");
		return false;
	}

	public static void main(String[] args){

		int[] numbers= new int[10];
		Scanner in = new Scanner(System.in);
		System.out.println("input element(10 int) inc:");
		for(int i = 0; i < numbers.length; i++){
			numbers[i] = in.nextInt();
		}

		System.out.println("input target(int):");
		int target = in.nextInt();

		if(getSum(numbers,target)){
			System.out.println("sucess!");
		}
		else{
			System.out.println("failed");
		}
	}
}

