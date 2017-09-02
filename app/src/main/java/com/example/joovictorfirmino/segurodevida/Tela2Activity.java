package com.example.joovictorfirmino.segurodevida;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Tela2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        Log.i("CicloVida2", "OnCreate");

        Button bt = (Button) findViewById(R.id.button2);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

        @Override
        protected void onStart() {
            super.onStart();
            Log.d("CicloVida2", "onStart()");
        }

        @Override
        protected void onResume() {
            super.onResume();
            Log.i("CicloVida2", "onResume()");
        }

        @Override
        protected void onPause() {
            super.onPause();
            Log.w("CicloVida2", "onPause()");
        }

        @Override
        protected void onStop() {
            super.onStop();
            Log.i("CicloVida2", "onStop()");
        }

        @Override
        protected void onRestart() {
            super.onRestart();
            Log.w("CicloVida2", "onRestart()");
        }

        @Override
        protected void onDestroy() {
            super.onDestroy();
            Log.e("CicloVida2", "onDestroy()");
            finish();

        }
}

