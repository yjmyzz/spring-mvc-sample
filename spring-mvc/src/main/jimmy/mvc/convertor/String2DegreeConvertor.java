package jimmy.mvc.convertor;

import jimmy.mvc.enums.DEGREE;

import org.springframework.core.convert.converter.Converter;

public class String2DegreeConvertor implements Converter<String, DEGREE> {

	@Override
	public DEGREE convert(String enumValueStr) {
		String value = enumValueStr.trim();
		if (value.isEmpty()) {
			return null;
		}
		return DEGREE.get(enumValueStr);
	}
}
