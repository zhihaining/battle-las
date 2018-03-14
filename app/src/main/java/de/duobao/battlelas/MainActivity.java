package de.duobao.battlelas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import de.duobao.battlelas.gui.GameInterface;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);


        GameInterface gameInterface = new GameInterface(this);
        setContentView(gameInterface);
    }
}
