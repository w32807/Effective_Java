package enumWithAnnotation.item34;

public enum Orange {
	NAVEL(0),
	TEMPLE(1),
	BLOOD(2);
	
	// Enum 타입의 생성자는 밖에서 접근할 수 없지만, 일단 클래스이므로 꼭 생성자가 필요하다.
	private Orange(int num) {}
}

