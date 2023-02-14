package artikYilProgrami;

import java.util.Scanner;

public class artikYilTest {

	public static void main(String[] args) {
		
		System.out.println("Artık yıl olup olmadığını öğrenmek istediğiniz yılı 4 basamaklı olacak şekilde giriniz.");
		Scanner input = new Scanner(System.in);
		
		int year = input.nextInt();
		 
		if (year % 100 == 0) {
			if (year % 400 == 0) {
				System.out.println("Girdiğiniz yıl artık yıldır.");
			} else  {
				System.out.println("Girdiğiniz yıl artık yıl değildir.");
				
			}
			} else if ((year % 4 == 0) && (year % 100 != 0)) {
					System.out.println("Girdiğiniz yıl artık yıldır");
					
				} else {
				System.out.println("Girdiğiniz yıl artık yıl değildir.");
			}	
			}
			
			
			
			
		}

	


