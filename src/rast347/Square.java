package rast347;

import java.util.Scanner;

public class Square {

    public static void main(String[] args) {


//		variable ----------------------------
        double a=0, b=0, c = 0;
        double discr=0, sqrtD=0;
        double x1, x2;

        Scanner scanner = new Scanner(System.in);


//		Check quantity ------------------------

        int i = 0;
        String line;

        while (i < 3) {

            if (i == 0) {
                System.out.print("Введите первое число:\n");
                line = scanner.nextLine();
                if (chekLine(line)) {
                    a = Double.parseDouble(line);
//					check that var A is not zero
                    if (a == 0) {
                        System.out.println("Variable A must be not zero! ");
                        continue;
                    }
                    i++;
                }else {
                    System.out.println("Вы ввели не число\n");
                    continue;
                }

            }
            if (i == 1) {
                System.out.print("Введите второе число:\n");
                line = scanner.nextLine();
                if (chekLine(line)) {
                    b = Double.parseDouble(line);
                    i++;
                }else {
                    System.out.print("Вы ввели не число!\n");
                    continue;
                }
            }
            if (i == 2) {
                System.out.print("Введите третье число:\n");
                line = scanner.nextLine();
                if (chekLine(line)) {
                    c = Double.parseDouble(line);
                    i++;
                }else {
                    System.out.print("Вы ввели не число!\n");
                    continue;
                }
            }

        }


//		Display variable ---------------------------------
        System.out.println("Уравнение:\n" + a + "x**2 + " + b + "y + " + c + "\n");


//		Discriminant detection ---------------------------
        discr = (b * b) - (4 * a * c);
        System.out.println("Дискриминант: " + discr);


//		Calculate square discriminant --------------------
        if (discr < 0) {

            System.out.println("Дискриминат меньше нуля поэтому уравнение не имеет корней");
            System.exit(0);

        }else {

            sqrtD = Math.sqrt(discr);
        }

//		Root of equation ---------------------------------

        if (sqrtD > 0){

            x1 = (-b + sqrtD)/(2*a);
            x2 = (-b - sqrtD)/(2*a);
            System.out.println("Уравнение имеет два корня: " + "x1 = " + x1 + " x2 = " + x2 + "\n" + "расчет окончен.");

        }else {

            x1 = (-b)/(2*a);
            System.out.println("Уравнение имеет один корень: " + "x = " + x1 + "\n" + "расчет окончен.");

        }

    }

    public static boolean chekLine(String str) {

        boolean symbolDetected = true;
        char ch;

        for (int i=0; i<str.length(); i++){
            ch = str.charAt(i);
            if (!Character.isDigit(ch)){
                symbolDetected = false;
                break;
            }
        }

        return symbolDetected;

    }

}
