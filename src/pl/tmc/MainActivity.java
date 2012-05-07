package pl.tmc;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;
import pl.tmc.map.source.MapSource;
import pl.tmc.map.source.ShapefileMapSource;
import pl.tmc.map.source.UnreadableMapException;

public class MainActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		tryToReadMap();
	}

	private void tryToReadMap() {
		try {
			display("Reading the map...");
			MapSource ms = new ShapefileMapSource(getResources());
			String mapText = ms.getMap();
			display("HERE GOES: " + mapText);
		} catch (UnreadableMapException e) {
			Toast.makeText(getApplicationContext(), "Problems: " + e.getMessage() + "asdsa", 1).show();
		}

	}

	private void display(String message) {
		Toast progressToast = Toast.makeText(getBaseContext(), message, Toast.LENGTH_LONG);
		progressToast.show();
	}
}