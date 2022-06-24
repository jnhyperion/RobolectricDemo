package robolectric.demo.test;

import android.os.Build;

import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.annotation.Config;

import robolectric.demo.Utils;

@RunWith(AndroidJUnit4.class)
@Config(sdk = Build.VERSION_CODES.P)
public class ExampleTest {

    @Test
    public void testExample() throws Throwable {
        Utils.readAssetFile("foo", "bar.txt");
    }
}
