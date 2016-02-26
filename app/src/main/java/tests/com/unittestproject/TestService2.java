package tests.com.unittestproject;

import android.util.Log;

/**
 * Test service with method to be mocked - java
 */
public class TestService2 {
    private static String TAG = "TestService2";

    private Boolean mockedVariable;

    public TestService2() {
        mockedVariable = false;
    }

    public Boolean shouldBeMockedMethod() throws Exception {
        Log.d(TAG, "Mocked method executed");
        throw new Exception("Should not be executed");
        //return mockedVariable;
    }
}
