public class Driver{
	public static void main(String[] args){
		RealNumber a = new RealNumber(4.4);
		RealNumber b = new RealNumber(5.6);
		RealNumber c = new RealNumber(4.400000000000000000000000001);
		System.out.println(a.equals(c));
		System.out.println(b.add(a));
		System.out.println(b.subtract(a));
		System.out.println(b.multiply(a));
		System.out.println(b.divide(a));

		RationalNumber d = new RationalNumber(1,2);
		RationalNumber e = new RationalNumber(2, -8);
		System.out.println(d);
		System.out.println(e);
		System.out.println(d.add(e));
		System.out.println(d.subtract(e));
		System.out.println(d.multiply(e));
		System.out.println(d.divide(e));
		RationalNumber f = new RationalNumber(-3, 0);
		System.out.println(f);
	}
}
