package practiceprojectNA;
import java.util.Scanner;

public class arithmeticcalc {
			public static void main(String[] args)
			{
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter the first num = ");
				int a = sc.nextInt();
				System.out.print("Enter the secound num = ");
				int b = sc.nextInt();
				System.out.print("Choose (+, -, *, /, %) = ");
				char op = sc.next().charAt(0);
				solve(a, b, op);
			}
			public static int solve(int a, int b, char op)
			{
				int ans = 0;
				if (op == '+') {
					ans = a + b;
				}
				else if (op == '-') {
					ans = a - b;
				}
				else if (op == '*') {
					ans = a * b;
				}
				else if (op == '%') {
					ans = a % b;
				}
				else if (op == '/') {
					ans = a / b;
				}
				System.out.println("Your answer is = " + ans);
				return ans;
			}
		}

