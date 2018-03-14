package de.duobao.battlelas.gui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.View;

import de.duobao.battlelas.game_engine.Game;

public class GameInterface extends View
{
    private final Game game;

    /* @todo BEGIN: THIS SECTION IS FOR TESTS ONLY */
    private final Drawable myGameObject;
    private final Paint myCoolPaint;
    /* @todo END  : THIS SECTION IS FOR TESTS ONLY */


    public GameInterface(Context context)
    {
        super(context);
        this.game = new Game(); /* @todo delete */
        /* @todo this.game = game; */

        /* create paint object to define how things are drawn */
        myCoolPaint = new Paint();
        myCoolPaint.setColor(Color.BLUE);


        /* create something that can be drawn */
        myGameObject = new ShapeDrawable(new OvalShape()); /* easy example */
        myGameObject.setBounds(10, 10, 110, 110);
    }

    @Override
    protected void onDraw(Canvas canvas)
    {
        myGameObject.draw(canvas);
    }
}
