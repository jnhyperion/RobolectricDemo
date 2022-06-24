package robolectric.demo.test;

import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;
import robolectric.demo.Utils;

@RunWith(AndroidJUnit4.class)
public class ExampleAndroidTest {

    @Test
    public void testExample() throws Throwable {
        Utils.readAssetFile("folder", "some.txt");
    }
}
