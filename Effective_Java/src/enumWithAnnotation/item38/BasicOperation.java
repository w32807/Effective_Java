package enumWithAnnotation.item38;

// 상수에 따라 분기가 되는 Enum
// 인터페이스를 상속받는 Enum 클래스
public enum BasicOperation implements Operation{
	PLUS("+"){public double apply(double x, double y) {return x + y;}}, 
	MINUS("-"){public double apply(double x, double y) {return x - y;}}, 
	TIMES("*"){public double apply(double x, double y) {return x * y;}}, 
	DIVIDE("/"){public double apply(double x, double y) {return x / y;}};
	
	private String symbol;
	
	BasicOperation(String symbol) {this.symbol = symbol;}
	
}
