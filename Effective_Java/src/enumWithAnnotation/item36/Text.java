package enumWithAnnotation.item36;

import java.util.EnumSet;
import java.util.Set;

public class Text {
	// 2의 거듭제곱 값들을 비트별 OR을 사용해 상수의 집합으로 만든 것이 비트 필드이다.
	// 그러나 이제 EnumSet을 이용하자!
	/*
	public static final int STYLE_BOLD = 1 << 0;
	public static final int STYLE_ITALIC = 1 << 1;
	public static final int STYLE_UNDERLINE = 1 << 2;
	public static final int STYLE_STRIKETHROUGH = 1 << 3;
	
	public void applyStyles(int styles) {}
	*/
	
	// Enum set 사용!
	public enum Style{ BOLD, ITALIC, UNDERLINE, STRIKETHROUGHT}

	// EnumSet도 Set 인터페이스의 구현체이므로 다음과 같이 매개변수를 받도록 작성하자.
	public void applyStyles(Set<Style> styles) {
		System.out.println("applyStyles에서 출력한 Style set입니다." + styles);
	}
	
	public static void main(String[] args) {
		Text text = new Text();
		// EnumSet의 of 메소드를 이용하여 매개변수를 전달하는 순간 set을 만들어서 전달한다.
		text.applyStyles(EnumSet.of(Style.BOLD, Style.ITALIC));
	}
	
	

}
