package Methods;

public class PrimeNo {
	public boolean getPrime(int num) {

		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			return true;
			// System.out.println("No is prime");
		} else {
			return false;
			// System.out.println("No is not prime");
		}

	}

	public static void main(String[] args) {
		PrimeNo pn = new PrimeNo();
		System.out.println(pn.getPrime(17));
		// pn.getPrime(15);

	}

}
