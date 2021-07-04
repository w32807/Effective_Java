package enumWithAnnotation.item38;

import java.util.Arrays;
import java.util.Collection;

public class Test {
	public static void main(String[] args) {
		//test(ExtendedOperation.class, 2, 3);
		test(Arrays.asList(ExtendedOperation.values()), 2, 3);
	}

	private static void test(Collection<? extends Operation> opSet, double x, double y) {
		// opEnumType.getEnumConstants() 로 Enum 상수들의 배열을 얻어옴
		for(Operation op : opSet) {
			System.out.printf("%f %s %f = %f%n", x, op, y , op.apply(x, y));
		}
	}
	
	/*
	private static <T extends Enum<T> & Operation> void test(Class<T> opEnumType, double x, double y) {
		// opEnumType.getEnumConstants() 로 Enum 상수들의 배열을 얻어옴
		for(Operation op : opEnumType.getEnumConstants()) {
			System.out.printf("%f %s %f = %f%n", x, op, y , op.apply(x, y));
		}
	}
	*/
}
