class Main {
	static long sum_of_digits(long n) {
		long sum = 0 + (n % 10);
		long value = n / 10;

		while (value > 0) {
			sum = sum + value % 10;
			value = value / 10;
		}

		return sum;
	}

	public static long solve(long n) {
		if (n == 1) {
			return 1;
		}

		long possibilities = n / 2;
		long sum_of_numbers = 0;
		long a = 1;

		for (long i = 1; i <= possibilities; i++) {
			long b = n - i;

			if (sum_of_digits(a) + sum_of_digits(b) > sum_of_numbers) {
				sum_of_numbers = sum_of_digits(a) + sum_of_digits(b);
			}
			a++;
		}
		return (int) sum_of_numbers;
	}

	public static void main(String[] args) {
		System.out.println(solve(50000000));
	}
}
