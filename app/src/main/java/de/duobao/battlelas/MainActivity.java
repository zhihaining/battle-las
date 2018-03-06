package de.duobao.battlelas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import de.duobao.battlelas.game_engine.Game;
import de.duobao.battlelas.gui.GameInterface;

public class MainActivity extends AppCompatActivity
{
    private final GameInterface gameInterface = new GameInterface(new Game());

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
