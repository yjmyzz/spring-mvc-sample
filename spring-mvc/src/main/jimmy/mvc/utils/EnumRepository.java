package jimmy.mvc.utils;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

import jimmy.mvc.enums.DEGREE;
import jimmy.mvc.enums.HOBBY;
import jimmy.mvc.enums.SEX;

public final class EnumRepository {

	static Map<String, String> sexMap = null;
	static Map<String, String> hobbyMap = null;
	static Map<String, String> degreeMap = null;

	public static Map<String, String> getSexMap() {
		if (sexMap == null) {
			sexMap = new HashMap<String, String>();
			EnumSet<SEX> sexs = EnumSet.allOf(SEX.class);
			for (SEX sex : sexs) {
				sexMap.put(sex.getValue(), sex.getDescription());
			}
		}
		return sexMap;
	}

	public static Map<String, String> getHobbyMap() {
		if (hobbyMap == null) {
			hobbyMap = new HashMap<String, String>();
			EnumSet<HOBBY> hobbies = EnumSet.allOf(HOBBY.class);
			for (HOBBY h : hobbies) {
				hobbyMap.put(h.getValue(), h.getDescription());
			}
		}
		return hobbyMap;
	}

	public static Map<String, String> getDegreeMap() {
		if (degreeMap == null) {
			degreeMap = new HashMap<String, String>();
			EnumSet<DEGREE> degrees = EnumSet.allOf(DEGREE.class);
			for (DEGREE h : degrees) {
				degreeMap.put(h.getValue(), h.getDescription());
			}
		}
		return degreeMap;
	}

}
