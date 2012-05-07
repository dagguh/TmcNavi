package pl.tmc.map.source;

/**
 *
 * @author Maciej Kwidziński <mkwidzinski@wp-sa.pl>
 */
public class UnreadableMapException extends Exception {

	private static final long serialVersionUID = 1L;

	/**
	 * Constructs an instance of
	 * <code>UnreadableMapException</code> with the specified detail message.
	 *
	 * @param msg the detail message.
	 */
	public UnreadableMapException(String msg) {
		super(msg);
	}

	public UnreadableMapException(String detailMessage, Throwable throwable) {
		super(detailMessage, throwable);
	}
}
