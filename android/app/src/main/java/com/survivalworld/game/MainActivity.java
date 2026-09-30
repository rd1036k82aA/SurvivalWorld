package com.survivalworld.game;

import android.os.Bundle;
import android.util.Log;

import com.getcapacitor.BridgeActivity;

public class MainActivity extends BridgeActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d("SurvivalWorld", "MainActivity iniciou");
        Log.d("SurvivalWorld", "Capacitor Bridge iniciado");
    }
}
