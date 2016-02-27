package tests.com.unittestproject

import android.util.Log

/**
 * Test service with a method to be mocked - kotlin.
 */
open class TestService {
    private val TAG: String = "TestService"

    private var mockedVariable: Boolean

    init {
        mockedVariable = false;
    }

    open fun shouldBeMockedMethod(): Boolean {
        Log.d(TAG, "Mocked method executed");
        throw Exception("Should not be executed");
        return mockedVariable;
    }
}

