package robolectric.demo;

import androidx.test.core.app.ApplicationProvider;
import androidx.test.platform.app.InstrumentationRegistry;

import java.io.File;
import java.io.IOException;

public class Utils {

    public static void readAssetFile(String folderName, String fileName) throws IOException {
        ApplicationProvider.getApplicationContext().getAssets().open(folderName + File.separator + fileName);
    }
}
