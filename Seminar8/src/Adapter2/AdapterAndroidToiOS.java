package Adapter2;

public class AdapterAndroidToiOS implements iOS{

    private Android android;

    public AdapterAndroidToiOS(Android android) {
        this.android = android;
    }

    @Override
    public void runIOSApp() {
        android.runningOnAndroid();
    }
}
