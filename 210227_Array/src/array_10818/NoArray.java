package array_10818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 배열을 사용하지 않고 입력받은 문자를 즉시 비교(시간복잡도가 N으로 정렬할 필요가 없어 시간 단축가능)
 * https://st-lab.tistory.com/43
 */
public class NoArray {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Integer.parseInt(br.readLine()); //입력을 아예 1 44 6 83 23 이런 식으로 받는다
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		int max = -1000001;
		int min = 1000001;
		
		while(st.hasMoreTokens()) {
			int val = Integer.parseInt(st.nextToken());
			if(val > max) {
				max = val;
			}
			if(val < min) {
				min = val;
			}
		}
		
		System.out.println(min + " " + max);
	}
}
