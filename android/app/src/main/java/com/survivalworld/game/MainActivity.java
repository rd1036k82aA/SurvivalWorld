package com.survivalworld.game;

import android.os.Bundle;
import android.graphics.Color;
import android.widget.TextView;

import com.getcapacitor.BridgeActivity;

public class MainActivity extends BridgeActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView teste = new TextView(this);
        teste.setText("SURVIVALWORLD\n\nANDROID INICIOU");
        teste.setTextSize(28);
        teste.setTextColor(Color.WHITE);
        teste.setGravity(17);
        teste.setBackgroundColor(Color.rgb(17, 17, 17));

        setContentView(teste);
    }
}
