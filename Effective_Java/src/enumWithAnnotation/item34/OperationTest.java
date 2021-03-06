package enumWithAnnotation.item34;

public class OperationTest {
	public static void main(String[] args) {
		double x = Double.parseDouble("2");
		double y = Double.parseDouble("4");
		
		for(Operation op : Operation.values()) {
			System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));
		}
		
		System.out.println(Operation.fromString("+").isPresent() ? Operation.fromString("+").get() : "값 없음");
		System.out.println(Operation.fromString("++").isPresent() ? Operation.fromString("++").get() : "값 없음");
		
		System.out.println(Operation.TIMES);
		System.out.println(PayrollDay.MONDAY.pay(500,10));
		System.out.println(PayrollDay.TUESDAY.pay(500, 10));
		System.out.println(PayrollDay.WEDNESDAY.pay(500,10));
		System.out.println(PayrollDay.THURSDAY.pay(500, 10));
		System.out.println(PayrollDay.FRIDAY.pay(500, 10));
		System.out.println(PayrollDay.SATURDAY.pay(500, 10));
		System.out.println(PayrollDay.SUNDAY.pay(500, 10));
	}
}
