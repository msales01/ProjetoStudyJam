package com.matheussales.projetofinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirReceita1(View view){
        setContentView(R.layout.receita1);
        Log.v("MainActivity", "abrindo receita 1");
    }

    public void abrirReceita2(View view){

        setContentView(R.layout.receita2);
        Log.v("MainActivity", "abrindo receita 2");
    }

    public void abrirReceita3(View view){

        setContentView(R.layout.receita3);
        Log.v("MainActivity", "abrindo receita 3");
    }

    public void abrirReceita4(View view){

        setContentView(R.layout.receita4);
        Log.v("MainActivity", "abrindo receita 4");
    }

    public void abrirReceita5(View view){

        setContentView(R.layout.receita5);
        Log.v("MainACtivity", "abrindo receita 5");
    }

    public void BotaoHome(View v){

        setContentView(R.layout.activity_main);
    }
}
