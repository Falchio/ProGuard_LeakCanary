package ru.falchio.proguardmemoryleak;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private final String TAG=  this.getClass().getSimpleName();

    //не забудь добавить в манифест App (android:name=".App")

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start();
    }

    private void start(){
        new AsyncTask<Void, Void, Void>(){

            @Override
            protected Void doInBackground(Void... voids) {
                for (int i = 0; i < 30; i++) {
                    Log.d(TAG, "doInBackground: " + MainActivity.this);
                    SystemClock.sleep(1000);
                }

                return null;
            }
        }.execute();
    }
}
