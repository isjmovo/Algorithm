import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(" ");
        int[] arr = new int[str.length];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        
        Arrays.sort(arr);
        
        int min = arr[0];
        int max = arr[arr.length-1];
        
        answer =min + " " + max;
        
        return answer;
    }
}