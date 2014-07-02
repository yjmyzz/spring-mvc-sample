package jimmy.mvc.exception;

/**
 * 参数异常
 * 
 * @author Administrator
 * 
 */
public class ParameterException extends Exception {

	private static final long serialVersionUID = 7242749020956121483L;

	public ParameterException() {

	}

	public ParameterException(String message) {
		super(message);

	}

	public ParameterException(Throwable cause) {
		super(cause);

	}

	public ParameterException(String message, Throwable cause) {
		super(message, cause);

	}

}
