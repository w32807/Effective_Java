package enumWithAnnotation.item35;


public enum Ensemble {
	/*
	SOLO, DUET, TRIO, QUARTET, QUIMTET, SEXTET, SEPTET, OCTET, NONET, DECTET;
	// 각 열거형 상수의 순서를 반환하는 ordinal() 메소드!
	// 근데 이는 유지보수에 끔찍하게 좋지 않다. 그러므로 ordinal() 대신 인스턴스 필드를 사용하자.
	public int numberOfMusicians() {return ordinal() + 1;}
	*/
	
	
	SOLO(1), DUET(2), TRIO(3), QUARTET(4), QUIMTET(5), SEXTET(6), SEPTET(7), OCTET(8), NONET(9), DECTET(10);
	
	private final int numberOfMusicians; // 인스턴스 필드 사용
	private Ensemble(int numberOfMusicians) {this.numberOfMusicians = numberOfMusicians;}
	public int numberOfMusicians() {return numberOfMusicians;}
	
}
