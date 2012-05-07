package pl.tmc.map.source;

import android.content.res.Resources;
import java.io.*;
import pl.tmc.R;

/**
 *
 * @author Maciej Kwidziński <mkwidzinski@wp-sa.pl>
 */
public class ShapefileMapSource implements MapSource {

	private static final String MAP_FILE_NAME = "india.shp";
	private Resources resources;

	public ShapefileMapSource(Resources resources) {
		this.resources = resources;
	}

	public String getMap() throws UnreadableMapException {
		try {
			return readMap();
		} catch (IOException e) {
			throw new UnreadableMapException("Map cannot be read from shapefile " + MAP_FILE_NAME, e);
		}
	}

	private String readMap() throws IOException {
		BufferedReader reader = getMapReader();
		StringBuilder mapText = new StringBuilder();
		String line;
		do {
			line = reader.readLine();
			mapText.append(line).append("\n");
		} while (line != null);
		reader.close();
		return mapText.toString();
	}

	private BufferedReader getMapReader() throws IOException {
		InputStream stream = resources.openRawResource(R.raw.india_shp);
		return new BufferedReader(new InputStreamReader(stream));
	}
}
