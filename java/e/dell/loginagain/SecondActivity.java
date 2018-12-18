package e.dell.loginagain;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("lifecycle","onStart is invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lifecycle","onResume is invoked");
        }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("lifecycle","onPause is invoked");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("lifecycle","onStop is invoked");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("lifecycle","onRestart is invoked");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("lifecycle","onDestroy is invoked");

    }
}
