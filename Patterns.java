package starprograms.example;

import java.util.Scanner;

public class Patterns {

	public static void main(String[] args) {
	     int n=5;
	     char a='A';
	     System.out.println("Pattern 1:");
	     for(int i=0;i<n;i++) {
	    	 for(int j=0;j<n;j++) {
	    		 System.out.print("* ");
	    	 }
	    	 System.out.println();
	     }
	     System.out.println("Pattern 2:");
	     for(int i=1;i<=n;i++) {
	    	 for(int j=1;j<=i;j++){
	    		 System.out.print("* ");
	    	 }
	    	 System.out.println();
	     }
	     System.out.println("Pattern 3:");
	     for(int i=n;i>=1;i--) {
	    	 for(int j=1;j<=i;j++){
	    		 System.out.print("* ");
	    	 }
	    	 System.out.println();
	     }
	     System.out.println("Pattern 4:");
	     for(int i=1;i<=n;i++) {
	    	 for(int j=1;j<=i;j++){
	    		 System.out.print(j +" ");
	    	 }
	    	 System.out.println();
	     }
	     System.out.println("Pattern 5:");
	     for(int i=n;i>=1;i--) {
	    	 for(int j=1;j<=i;j++){
	    		 System.out.print(j+" ");
	    	 }
	    	 System.out.println();
	     }
	     System.out.println("Pattern 6:");
	     for(int i=1;i<=n;i++) {
	    	 for(int j=1;j<=i;j++){
	    		 System.out.print(a +" ");
	    	 }
	    	 a++;
	    	 System.out.println();
	     }
	     System.out.println("Pattern 7:");
	     for(int i=0;i<n;i++) {
	    	 for(int j=0;j<n;j++) {
	    		 if(i==0 || j==0 || i==n-1 ||j==n-1) {
	    			 System.out.print("*");
	    		 }
	    		 else {
	    			 System.out.print(" ");
	    		 }
	    	 }
	    	 System.out.println();
	     }
	     System.out.println("Pattern 8:");
	     for(int i=1;i<=n;i++) {
	    	 for(int j=0;j<n-i;j++) {
	    		 System.out.print(" ");
	    	 }
	    	 for(int j=1;j<=i;j++) {
	    		 System.out.print("*");
	    	 }
	    	 System.out.println();
	    	 
	     }
	     System.out.println("Pattern 9");
	     for(int i=0;i<n;i++) {
	    	 for(int j=0;j<i;j++) {
	    		 System.out.print(" ");
	    	 }
	    	 for(int j=1;j<=n-i;j++) {
	    		 System.out.print("*");
	    	 }
	    	 System.out.println();
	     }
	     System.out.println("Pattern 10");
	     for(int i=1;i<=n;i++) {
	    	 for(int j=0;j<n-i;j++) {
	    		 System.out.print(" ");
	    	 }
	    	 for(int j=1;j<=i;j++) {
	    		 System.out.print("* ");
	    	 }
	    	 System.out.println();
	     }
	     System.out.println("Pattern 11");
	     for(int i=1;i<=(2*n)-1;i++) {
	    	 int space=i<n?n-i:i-n; 
	    	 int star=i>n?2*n-i:i;
	    	 for(int j=0;j<=space;j++) {
	    		 System.out.print(" ");
	    	 }
	    	 for(int j=1;j<=star;j++) {
	    		 System.out.print(i+" ");
	    	 }
	    	 System.out.println();
	     }
	}

}
