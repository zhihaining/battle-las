package de.duobao.battlelas.data_objects;

import java.util.Arrays;

public class Map
{
    protected int[] mapDatas;
    protected int horizonalSize = 10;
    protected int verticalSize = 10;

    protected Map(){
    }

    public int[] getMap(){
        return mapDatas;
    }

    protected void initializeMap(){
        mapDatas = new int[horizonalSize * verticalSize];
        Arrays.fill(mapDatas, 0);
    }

}
