package jimmy.mvc.convertor;

import jimmy.mvc.enums.SEX;

import org.springframework.core.convert.converter.Converter;

public class String2SexConvertor implements Converter<String, SEX> {

	@Override
	public SEX convert(String enumValueStr) {
		String value = enumValueStr.trim();
		if (value.isEmpty()) {
			return null;
		}
		return SEX.get(enumValueStr);
	}
}
