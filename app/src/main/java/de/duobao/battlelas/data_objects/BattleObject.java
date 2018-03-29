package de.duobao.battlelas.data_objects;


/**
 * Created by Deen zhi on 12.03.2018.
 * this class describes a battle object
 * the position, rotation, and shape of th object.
 */

public class BattleObject
{
    private Tile shape[][];
    /**
     * the left-most lowest point of the shape
     */
    private Position position;

    public BattleObject(){
    }

    boolean isHit()
    {
        return false;
    }

    public void rotate()
    {
    }

    public void move(final Position offset)
    {
    }

    public Tile[][] getShape()
    {
        return shape;
    }
}
