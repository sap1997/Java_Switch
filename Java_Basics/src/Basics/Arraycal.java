package Basics;

import java.util.Arrays;

public class Arraycal {
	public static void main(String[] args) {
        String[] arr = {"10", "20", "30", "5"};
        
        int result = Arrays.stream(arr).mapToInt(Integer::parseInt).sum();
        System.out.println(result);
	}

}
