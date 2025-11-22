package starprograms.example;

import java.util.Scanner;

public class Starmain {

	public static void main(String[] args) {
		System.out.println("WELCOME TO OUR DRIVEWAY COFFEE SHOP");
		Scanner sc=new Scanner(System.in);
		System.out.println("PRESS");
		System.out.println("A for COFFEE($5)");
		System.out.println("B for BARISTA($10)");
		System.out.println("C for CAPPACINO($20)");
		System.out.println("D for PUFF($5)");
		System.out.println("E for CROSSANTIN($20)");
		System.out.println("X for Exit)");
		int total=0;
		char c;
		int count=0;
		String[] str=new String[100];
		do {
		    c=sc.next().charAt(0);
			if(c=='A'|| c=='a') {
				System.out.println("COFFEE ADDED...");
				total+=5;
				str[count]="COFEE-$5";
				count++;
			}
			else if(c=='B'|| c=='b') {
				System.out.println("BARISTA ADDED...");
				total+=10;
				str[count]="BARISTA-$10";
				count++;
			}
			else if(c=='C'|| c=='c') {
				System.out.println("CAPPACINO ADDED...");
				total+=20;
				str[count]="CAPPACINO-$20";
				count++;
			}
			else if(c=='D'|| c=='d') {
				System.out.println("PUFF ADDED...");
				total+=5;
				str[count]="PUFF-$5";
				count++;
			}
			else if(c=='E'|| c=='e') {
				System.out.println("CROSSANTIN ADDED...");
				total+=20;
				str[count]="CROSSANTIN-$20";
				count++;
			}
			else if(c=='X'|| c=='x') {
				System.out.println("Your Total is: $"+total);
				System.out.println("Your order list:");
				for(int i=0;i<count;i++){
					System.out.println(str[i]);
				}
			}
			else {
				System.out.println("Invalid option...");
			}
		}while( c !='X' && c!='x');
		
	}
   
}
