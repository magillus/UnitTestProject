package tests.com.unittestproject;

import android.os.Build;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.internal.util.MockUtil;
//import org.powermock.api.mockito.PowerMockito;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertTrue;

/**
 * Unit test to reproduce mock kotlin class error.
 */
@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = Build.VERSION_CODES.KITKAT)
public class ReproduceUnitTest {

    @Test
    public void testMockitoService1() throws Exception {
        TestService mockedService = Mockito.mock(TestService.class);
        assertTrue(new MockUtil().isMock(mockedService));
        Mockito.when(mockedService.shouldBeMockedMethod()).thenReturn(Boolean.TRUE);
        assertTrue(mockedService.shouldBeMockedMethod());
    }

    @Test
    public void testMockitoService2() throws Exception {
        TestService2 mockedService = Mockito.mock(TestService2.class);
        assertTrue(new MockUtil().isMock(mockedService));
        Mockito.when(mockedService.shouldBeMockedMethod()).thenReturn(Boolean.TRUE);
        assertTrue(mockedService.shouldBeMockedMethod());
    }
//
//    @Test
//    public void testPowerMockitoService1() throws Exception {
//        TestService testService = PowerMockito.mock(TestService.class);
//        assertTrue(new MockUtil().isMock(testService));
//        PowerMockito.when(testService.shouldBeMockedMethod()).thenReturn(Boolean.TRUE);
//        assertTrue(testService.shouldBeMockedMethod());
//    }
//
//    @Test
//    public void testPowerMockitoService2() throws Exception {
//        TestService2 testService2 = PowerMockito.mock(TestService2.class);
//        assertTrue(new MockUtil().isMock(testService2));
//        PowerMockito.when(testService2.shouldBeMockedMethod()).thenReturn(Boolean.TRUE);
//        assertTrue(testService2.shouldBeMockedMethod());
//    }

}