package de.duobao.battlelas.data_objects;

public abstract class Map<T>
{
    protected final int horizontalSize = 10;
    protected final int verticalSize = 10;

    /**
     * the tiles of the map expand from left bottom to top right
     */
    protected T tiles[][];

    public T[][] getMap()
    {
        return tiles;
    }

    protected abstract void initializeMap();
}
