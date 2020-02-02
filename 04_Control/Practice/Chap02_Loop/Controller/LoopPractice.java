package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		if (num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {
			for (int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
		}
	}

	public void practice2() {
		Scanner sc = new Scanner(System.in);

		int num = 1;

		do {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			num = sc.nextInt();
			if (num < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}
			for (int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
		} while (num < 1);
	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		if (num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {
			for (int i = 0; num > i; i++) {
				System.out.print((num - i) + " ");
			}
		}
	}

	public void practice4() {
		Scanner sc = new Scanner(System.in);

		int num = 1;

		do {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			num = sc.nextInt();
			if (num < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}
			for (int i = 0; num > i; i++) {
				System.out.print((num - i) + " ");
			}
		} while (num < 1);
	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();

		int sum = 0;

		for (int i = 1; i <= num; i += num) {
			for (int j = 1; j < num; j++) {
				System.out.print(j + " + ");
				sum += j;
			}
			System.out.println(num + " = " + (sum + num));
		}
	}

	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();

		int max = 0;
		int min = 0;

		if (num1 > num2) {
			max = num1;
			min = num2;
		} else {
			max = num2;
			min = num1;
		}

		if (num1 < 1 || num2 < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {
			for (int i = min; i <= max; i++) {
				System.out.print(i + " ");
			}
		}
	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);

		int num1 = 0;
		int num2 = 0;

		int max = 0;
		int min = 0;

		do {
			System.out.print("첫 번째 숫자 : ");
			num1 = sc.nextInt();
			System.out.print("두 번 숫자 : ");
			num2 = sc.nextInt();

			if (num1 < num2) {
				max = num2;
				min = num1;
			} else {
				max = num1;
				min = num2;
			}

			if (min < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			} else {
				for (int i = min; i <= max; i++) {
					System.out.print(i + " ");
				}
			}
		} while (min < 1);
	}

	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int dan = sc.nextInt();

		System.out.println("===== " + dan + "단 =====");
		for (int su = 1; su <= 9; su++) {
			System.out.printf("%d * %d = %d", dan, su, (dan * su));
			System.out.println();
		}
	}

	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int dan = sc.nextInt();

		if (dan > 9) {
			System.out.println("9 이하의 숫자만 입력해주세요.");
		}

		do {
			for (int i = dan; dan <= 9; dan++) {
				System.out.println("===== " + dan + "단 =====");
				for (int su = 1; su <= 9; su++) {
					System.out.printf("%d * %d = %d", dan, su, (dan * su));
					System.out.println();
				}
			}
		} while (dan <= 9);
	}

	public void practice10() {
		Scanner sc = new Scanner(System.in);

		int dan = 2;

		do {
			System.out.print("숫자 : ");
			dan = sc.nextInt();

			if (dan > 9) {
				System.out.println("9 이하의 숫자만 입력해주세요.");
			} else if (dan <= 9) {
				for (int i = dan; dan <= 9; dan++) {
					System.out.println("===== " + dan + "단 =====");
					for (int su = 1; su <= 9; su++) {
						System.out.printf("%d * %d = %d", dan, su, (dan * su));
						System.out.println();
					}
				}
				break;
			}
		} while (dan > 9);
	}

	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("시작 숫자 : ");
		int start = sc.nextInt();
		System.out.print("공차 : ");
		int d = sc.nextInt();

		for (int n = 0; n <= 9; n++) {
			for (int i = start;; i += d) {
				System.out.print(i + d * n + " ");
				break;
			}
		}
	}

	public void practice12() {
		Scanner sc = new Scanner(System.in);

		String str = " ";
		int num1 = 0;
		int num2 = 0;

		do {
			System.out.print("연산자(+, -, *, /, %) : ");
			str = sc.nextLine();

			if (str.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			System.out.print("정수1 : ");
			num1 = sc.nextInt();
			System.out.print("정수2 : ");
			num2 = sc.nextInt();
			sc.nextLine();

			switch (str) {
			case "+":
				System.out.printf("%d + %d = %d", num1, num2, (num1 + num2));
				System.out.println();
				break;
			case "-":
				System.out.printf("%d - %d = %d", num1, num2, (num1 - num2));
				System.out.println();
				break;
			case "*":
				System.out.printf("%d * %d = %d", num1, num2, (num1 * num2));
				System.out.println();
				break;
			case "/":

				if (num2 == 0) {
					System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
				} else {

					System.out.printf("%d / %d = %d", num1, num2, (num1 / num2));
					System.out.println();
				}
				break;
			case "%":
				System.out.printf("%d % %d = %d", num1, num2, (num1 % num2));
				System.out.println();
				break;
			default:
				System.out.println("없는 연산입니다. 다시 입력해주세요.");
			}

		} while (!str.equals("exit"));
	}

	public void practice13() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void practice14() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = num; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void practice15() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();

		if (num < 2) {
			System.out.print("잘못 입력하셨습니다.");
		} 
		else if(num==2){
			System.out.println("소수입니다.");
		}else {
		
			for (int i = 2; i < num; i++) {
				if (num % i != 0) {
					System.out.print("소수입니다.");
				} else {
					System.out.print("소수가 아닙니다.");
				}
				break;
			}
		}
	}
}
