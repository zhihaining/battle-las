package de.duobao.battlelas.data_objects;

import java.util.Arrays;

public class Map
{
    protected int[] mapData;
    protected int horizontalSize = 10;
    protected int verticalSize = 10;

    protected Map(){
    }

    public int[] getMap(){
        return mapData;
    }

    protected void initializeMap(){
        mapData = new int[horizontalSize * verticalSize];
        Arrays.fill(mapData, 0);
    }

}
