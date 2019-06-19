package win.regin.mvvm


import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().context
        assertEquals("win.regin.mvvm", appContext.packageName)
    }

    @Test
    fun getLogSEP() {
        val fileSEP = System.getProperty("file.separator")
        val lineSEP = System.getProperty("line.separator")
        println("$fileSEP--$lineSEP")
    }
}
