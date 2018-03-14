package de.duobao.battlelas.data_objects;

import android.graphics.Point;
import android.graphics.drawable.Drawable;

/**
 * Created by Deen zhi on 12.03.2018.
 * this class describes a battle object
 * the position, rotation, and shape of th object.
 */

public class BattleObject
{
    private Drawable shape;
    private float rotation;
    /**
     * the left-most lowest point of the shape
     */
    private Point position;

    public BattleObject(){
    }

    public void rotate()
    {
    }

    public void move(final Point offset)
    {
    }

    public Drawable getShape()
    {
        return shape;
    }
}
