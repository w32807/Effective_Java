package enumWithAnnotation.item37;

import java.util.EnumMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Plant {
	// 한해살이, 여러해살이, 두해살이
	enum LifeCycle{ANNUAL, PERENNIAL, BIENNIAL}
	
	final String name;
	final LifeCycle lifeCycle;
	
	public Plant(String name, LifeCycle lifeCycle) {
		this.name = name;
		this.lifeCycle = lifeCycle;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	public static void main(String[] args) {
		// EnumMap은 Map의 Key를 Enum 값으로만 한정시키는 Map이다.
		Map<Plant.LifeCycle, Set<Plant>> plantsByLifeCycle = new EnumMap<>(Plant.LifeCycle.class);
		for(Plant.LifeCycle lc : Plant.LifeCycle.values())
			plantsByLifeCycle.put(lc, new HashSet<Plant>());
		System.out.println(plantsByLifeCycle);
	}
	
}
