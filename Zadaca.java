package zadaca;
import java.util.Scanner;
public class Zadaca {
 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int m, n;
		double rezultat;
		
		System.out.println("Prv broj:");
		m = input.nextInt();
		
		System.out.println("Vtor broj:");
		n = input.nextInt();
		while (n==m) {
			System.out.println("Broevite treba da bidat razlicni:");
			n = input.nextInt();
			}
		if ((m % 2 == 0) && (n % 2 == 0)) {
		if (m> n && n!=0) {
		rezultat = m/n;
		System.out.println("Kolicnik parni broevi e:" + rezultat + " /n");
			}
			else if (n> m && m!=0);
		rezultat = n/m;
		System.out.println("Kolicnik parni broevi e:" + rezultat + " /n");
		}
		else
			System.out.println("Ne moze da se deli so 0." + " /n");
		if ((m % 2==2) && (n % 2==1)) {
			if (m>n) {
				rezultat=m-n;
				System.out.println("Razlikata na neparni broevi e:" + rezultat + " /n");
			}
			else
				rezultat=n-m;
			System.out.println("Razlikata na neparni broevi e:" + rezultat + " /n");
		}

	else {
		rezultat= m+n;
		System.out.println("Zbir paren i zbir neparen broj e:");
	}
}
}
			
		

	