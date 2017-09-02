package com.example.joovictorfirmino.segurodevida;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v("CicloVida", "onCreate()");

        Button bt = (Button) findViewById(R.id.button);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, Tela2Activity.class);
                startActivity(it);
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("CicloVida", "onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("CicloVida", "onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.w("CicloVida", "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("CicloVida", "onStop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.w("CicloVida", "onRestart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("CicloVida", "onDestroy()");
    }
}
