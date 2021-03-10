package 거스름돈;

import java.util.Scanner;

public class coin2 {

	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("거스름돈을 입력하세요. ");
		
		int money = sc.nextInt();
		
		int[] coinUnit = {500, 100, 50, 10};
		
		System.out.println("거스름돈=" + money + "원");
		for(int i=0; i<coinUnit.length; i++) {
			System.out.println(coinUnit[i]+"원:"+ money/coinUnit[i] +"개");
			money %= coinUnit[i];
		}
		
		sc.close();
	}
}
