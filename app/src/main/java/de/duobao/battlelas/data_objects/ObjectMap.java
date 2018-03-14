package de.duobao.battlelas.data_objects;

/**
 * Created by Deen zhi on 12.03.2018.
 * this class describes a battle object map
 * the position, rotation, and shape of objects.
 */

public abstract class ObjectMap extends Map
{
    private final BattleObject[] battleObjects = new BattleObject[0];

    public ObjectMap(){
    }
}
