package jimmy.mvc.exception;

/**
 * 业务异常
 * 
 * @author Administrator
 * 
 */
public class BusinessException extends Exception {

	private static final long serialVersionUID = -582638822384686574L;

	public BusinessException() {

	}

	public BusinessException(String message) {
		super(message);

	}

	public BusinessException(Throwable cause) {
		super(cause);

	}

	public BusinessException(String message, Throwable cause) {
		super(message, cause);

	}

}
