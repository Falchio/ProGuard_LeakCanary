package ru.falchio.proguardmemoryleak;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        if (!LeakCanary.isInAnalyzerProcess(this)) {
            LeakCanary.install(this);
        }
    }
}
