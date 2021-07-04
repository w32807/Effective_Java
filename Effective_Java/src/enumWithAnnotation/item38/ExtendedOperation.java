package enumWithAnnotation.item38;

// 상수에 따라 분기가 되는 Enum
// 인터페이스를 상속받는 Enum 클래스
public enum ExtendedOperation implements Operation{
	PLUS("^"){public double apply(double x, double y) {return Math.pow(x, y);}}, 
	MINUS("%"){public double apply(double x, double y) {return x % y;}};
	
	private String symbol;
	
	ExtendedOperation(String symbol) {this.symbol = symbol;}
	
	@Override
	public String toString() {return symbol;}
	
}
