package de.duobao.battlelas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import de.duobao.battlelas.gui.GameInterface;

public class MainActivity extends AppCompatActivity
{
    private final GameInterface gameInterface;

    public MainActivity()
    {
        gameInterface = new GameInterface(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
