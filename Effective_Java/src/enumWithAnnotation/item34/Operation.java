package enumWithAnnotation.item34;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// 상수에 따라 분기가 되는 Enum
public enum Operation {
	PLUS("+"){public double apply(double x, double y) {return x + y;}}, 
	MINUS("-"){public double apply(double x, double y) {return x - y;}}, 
	TIMES("*"){public double apply(double x, double y) {return x * y;}}, 
	DIVIDE("/"){public double apply(double x, double y) {return x / y;}};
	
	private String symbol;
	
	Operation(String symbol) {this.symbol = symbol;}
	
	public abstract double apply(double x, double y);
	
	@Override
	public String toString() {return symbol;}
	
	// 문자열로 Enum 객체 얻기
	private static final Map<String, Operation> stringToEnum = Stream.of(values()).collect(Collectors.toMap(Object::toString, e->e));
	
	public static Optional<Operation> fromString(String symbol){
		return Optional.ofNullable(stringToEnum.get(symbol));
	}
	/*
	이것처럼 분기하지 말고, 값에 따라 각각의 메소드를 부여해주자
	public double apply(double x, double y) {
		switch (this) {
		case PLUS: return x + y;
		case MINUS: return x - y;
		case TIMES: return x * y;
		case DIVIDE: return x / y;
		}
		throw new AssertionError("알 수 없는 연산 : " + this);
	}
	*/
}
