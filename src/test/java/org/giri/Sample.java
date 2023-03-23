package org.giri;

public class Sample {


	    public static void main(String[] args) {
	        for (int i = 0; i <= 500; i++) {
	            if (hasDuplicateDigits(i) && digitSum(i) <= 5) {
	                System.out.println(i);
	            
	        }
	    }

	    private static boolean hasDuplicateDigits(int n) {
	        boolean[] digits = new boolean[10];
	        while (n > 0) {
	            int digit = n % 10;
	            if (digits[digit]) {
	                return true;
	            }
	            digits[digit] = true;
	            n /= 10;
	        }
	        return false;
	    }

	    private static int digitSum(int n) {
	        int sum = 0;
	        while (n > 0) {
	            sum += n % 10;
	            n /= 10;
	        }
	        return sum;
	    }
	}

