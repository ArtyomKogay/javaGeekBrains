public class Main {
    public static void main(String[] args) {
        short ff = 2;
        byte sss = 1;
        int aa = 1243;
        long ss = 12342142;
        float bb = 11.4f;
        double cc = 112.342;
        boolean dd = true;
        char j = 'ж';


        System.out.println(sum(1.0f, 2.0f, 3.0f, 4.0f));
        System.out.println(isTrue(5,4));
        positiveNumber(3);
        System.out.println(isPositive(-5) + " отрицательное");
        greeting("Витька");
        leapYear(2040);

    }

    public static float sum(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    public static boolean isTrue(float a, float b) {
        if (a + b >= 10 && a + b <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void positiveNumber(int a) {
        if(a<0) {
            System.out.println("Число отрицательное");
        }
        else {
            System.out.println("Число положительное");
        }
    }

    public static boolean isPositive(int a) {
        if(a<0) {
            return true;
        } else {
            return false;
        }
    }

    public static void greeting(String name) {
        System.out.println("Hello " + name);
    }

    public static void leapYear(int a) {
        if(a % 4 == 0) {
            if((a % 100 != 0) || (a % 400 == 0)) {
                System.out.println("Високосный");
            } else {
                System.out.println("Не високосный");
            }
        } else {
            System.out.println("Не високосный");
        }
    }
}
