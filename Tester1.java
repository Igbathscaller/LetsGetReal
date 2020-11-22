public class Tester1 {
    public static void main(String[]args){
        RationalNumber num  = new RationalNumber(1,3);
        RationalNumber num1 = new RationalNumber(0,3);
        RationalNumber num2 = new RationalNumber(0,4);
        System.out.println(num.getDenominator());
        System.out.println(num1.getDenominator());
        System.out.println(num2.getDenominator());
        System.out.println(num1.add(num2));
        System.out.println(num1.add(num));
        System.out.println(num.getValue());
    }
}
