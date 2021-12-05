/////////////////////////////////////////////////////
//프로그래머스 정렬 문제
//제목 : k번째 수.
//날짜 : 2021.12.05
/////////////////////////////////////////////////////
package Array;
import java.util.Arrays;

class Solution {
	public int[] solution(int[] array, int[][] commands) {
	    int[] answer = new int[commands.length];
	    
	    for(int i=0; i<commands.length; i++){
	        int[] temp = commands[i];
	        int temp1 = temp[0]-1;
	        int temp2 = temp[1]-1;
	        int temp3 = temp[2]-1;
	        int[] check = new int[temp2-temp1+1];
	        int j = 0;
	        
	        for(int k=temp1; k<=temp2; k++){
	            check[j] = array[k];
	            j++;
	        }
	        Arrays.sort(check);
	        
	        answer[i] = check[temp3];
	    }
	    return answer;
	}
}

public class array_Q1 {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		
		//System.out.println(solution(array, commands));
	}

}
