package Homework;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;


public class Zadachnik {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {

//        task9dot26();
//        task13dot3();
//        task13dot4();
//        task15dot4 ();
//        task15dot8();
//        task15dot9();
//        task15dot10();
//        task15dot11();
//        task15dot14();
//       task15dot15();
//       task15dot16();
//        task15dot17();
//        task15dot18();
//        task15dot19();
        task15dot20();

    }

    public static void task15dot20() {
        for ( int i = 0; i != 5;) {
            System.out.println("Введите число: ");
            int x = scanner.nextInt();
            int sum = x % 10;
            while (x > 0) {
                x /= 10;
                int  y = x % 10;
                sum += y;
            }
            if (sum == 5) {
                break;
            }
        }
    }

    public static void task15dot19() {
        for (int i = 1; i <= 15; i++) {
            System.out.println("Input number: ");
            int num = scanner.nextInt();
            int sum = num % 10;
            while (num > 0) {
                num /= 10;
                int x = num % 10;
                sum += x;
            }
            System.out.println("Sum of number " + i + " = " + sum);
        }
    }

    public static void task15dot18() {
        System.out.println("Введите целое число: ");
        int x = scanner.nextInt();
        while (x > 0) {
            x /= 10;
            System.out.println(x + " ");
        }
    }

    public static void task15dot17() {
        System.out.println("Введите число: ");
        int N = scanner.nextInt();
        System.out.println("Введите цифру: ");
        int D = scanner.nextInt();
        int y = N % 10;
        int x;
        while (N > 0) {
            N = N / 10;
            x = N % 10;

            if (D == y || D == x) {
                System.out.println("Цифра " + D + " есть в этом числе!");
                break;
            }
        }
    }

//    public static void task15dot16() {
//        System.out.println("Input number: ");
//        int num = scanner.nextInt();
//        int count = 0;
//        int sum = 0;
//        int lastNum = num % 10;
//        if (lastNum % 2 == 0) {
//            count++;
//        } else {
//            sum = lastNum;
//        }
//        while (num > 0) {
//            num /= 10;
//            int y = num % 10;
//            if (y % 2 == 0) {
//                count++;
//            } else {
//                sum += y;
//            }
//        }
//        System.out.println("Even nums: " + (count - 1));
//        System.out.println("Sum of odd nums: " + sum);
//    }

    public static void task15dot16() {
        System.out.println("Введите число: ");
        int x = scanner.nextInt();
        int y = x % 10;
        int count = 0;
        int count2 = 0;
        int sum = 0;
        int sum2 = 0;
        while (x > 0) {
            x = x / 10;
            int z = x % 10;
            if (y % 2 == 0) {
                if (z % 2 == 0) {
                    count++;
                }
                if (z % 2 != 0) {
                    sum += z;
                }
            }
            if (y % 2 != 0) {
                if (z % 2 == 0) {
                    count2++;
                    count = count2 - 1;
                }
                if (z % 2 != 0) {
                    sum2 += z;
                    sum = sum2 + y;
                }
            }
        }
        System.out.println("Количество чётных цифр в числе: " + count);
        System.out.println("Сумма всех нечётных цифр равна " + sum);
    }

//    public static void task15dot15() {
//        System.out.println("Введите число: ");
//        int x = scanner.nextInt();
//        int count = 0;
//        int sum = 0;
//        while (x > 0) {
//            x = x / 10;
//            int y = x % 10;
//            if (y % 2 ==0) {
//                count++;
//                sum += y;
//                System.out.println(y);
//            }
//        }
//
//        System.out.println("Количество чётных цифр в числе: " + count);
//        System.out.println("Сумма всех чётных цифр равна " + sum);
//    }

    public static void task15dot15() {
        System.out.println("Введите число: ");
        int x = scanner.nextInt();
        int y = x % 10;
        int count = 0;
        int count2 = 0;
        int sum = 0;
        int sum2 = 0;
        while (x > 0) {
            x = x / 10;
            int z = x % 10;
            if (y % 2 == 0 && z % 2 == 0) {
                count2++;
                sum = (sum + z);
                sum2 = sum + y;
            }
            if (y % 2 != 0 && z % 2 == 0) {
                count++;
                count2 = (count - 1);
                sum2 += z;
            }
        }

        System.out.println("Количество чётных цифр в числе: " + count2);
        System.out.println("Сумма всех чётных цифр равна " + sum2);
    }


    public static void task15dot14() {
        System.out.println("Введите число: ");
        int x = scanner.nextInt();
        int y = x % 10;
        int count = 0;
        int sum = y;
        while (x > 0) {
            x = x / 10;
            int z = x % 10;
            count++;
            sum += z;
        }
        System.out.println("Количество цифр в числе: " + count);
        System.out.println("Сумма всех цифр равна " + sum);
    }

    public static void task15dot11() {
        System.out.println("Введите первое двузначное число: ");
        int x = scanner.nextInt();
        System.out.println("Введите второе двузначное число: ");
        int y = scanner.nextInt();
        int sum1 = 0;
        int sum2 = 0;
        while (x != y) {
            sum1 += x;
            sum2 += y;
            if (x != y) {
                System.out.println("Введите первое двузначное число: ");
                x = scanner.nextInt();
                System.out.println("Введите второе двузначное число: ");
                y = scanner.nextInt();
            }
        }
        System.out.println("Сумма всех первых чисел: " + sum1);
        System.out.println("Сумма всех первых чисел: " + sum2);
    }

    public static void task15dot10() {
        System.out.println("Input x: ");
        int x = scanner.nextInt();
        while (x > 0) {
            System.out.println("Input minus: ");
            int minus = scanner.nextInt();
            x -= minus;
        }
    }

    public static void task15dot9() {
        System.out.println("Input num: ");
        int num = scanner.nextInt();
        int num2 = num;
        int sum = 0;
        while (sum <= Math.pow(num, 2)) {
            num2++;
            sum += num2;
            if (sum < Math.pow(num, 2)) {
                System.out.println(num2);
            }
        }
    }

    public static void task15dot8() {
        System.out.println("Введите число: ");
        int x = scanner.nextInt();
        int sum = 0;
        int times = 0;
        while (sum < 150) {
            sum += x;
            times++;
            if (sum < 150) {
                System.out.println("Введите число: ");
                x = scanner.nextInt();
            }
        }
        System.out.println(sum);
        System.out.println(times);
    }

    public static void task15dot4() {
        System.out.println("Input num: ");
        int num = scanner.nextInt();
        while (num != 0) {
            if (num < 0) {
                System.out.println("-");
            } else if (num > 0) {
                System.out.println("+");
            }
            System.out.println("Input num: ");
            num = scanner.nextInt();
        }
    }

//    public static void task9dot30() {
//        System.out.println("Введите трёхзначное число: ");
//        int num = scanner.nextInt();
//        int a = num / 100;
//        int b = (num / 10) % 10;
//        int c = num % 10;
//        if (b == 0) {
//            b = 1000;
//            if (a == c && num % a == 0) {
//                System.out.println(num + " делится на " + a);
//            }
//            if () {
//
//            }
//        }
//    }

    public static void task9dot26() {
        System.out.println("Введите двузначное число:");
        int x = scanner.nextInt();
        System.out.println("Введите четырёхзначное число");
        int y = scanner.nextInt();
        int a = y / 100;
        int b = (y / 10) % 100;
        int c = y % 100;
        if (x == a || x == b || x == c) {
            System.out.println("Это число внутреннее к четырёхзначному!");
        } else {
            System.out.println("Это число не внутреннее к четырёхзначному!");
        }
    }

    public static void task13dot3() {
        int[] arr = new int[20];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10, 100);
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(sum);
    }

    public static void task13dot4() {
        int x = scanner.nextInt();
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                count++;
                sum += i;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("Количество делителей: " + count + ", сумма делителей: " + sum);

    }
}
