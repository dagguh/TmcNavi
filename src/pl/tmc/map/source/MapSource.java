package pl.tmc.map.source;

/**
 *
 * @author Maciej Kwidziński <mkwidzinski@wp-sa.pl>
 */
public interface MapSource {

	String getMap() throws UnreadableMapException;
}
