package de.duobao.battlelas.data_objects;

/**
 * Created by Deen zhi on 12.03.2018.
 */

public class BattleMap extends Map<Terrain>
{
    @Override
    protected void initializeMap()
    {
        // apply the same rule for every column
        for (int h = 0; h < horizontalSize; h++)
        {
            // simply divide the map in two parts: one land, the other sea
            int v;
            for (v = 0; v < verticalSize / 2; v++)
            {
                tiles[h][v] = Terrain.LAND;
            }
            for (; v < verticalSize; v++)
            {
                tiles[h][v] = Terrain.SEA;
            }
        }
    }
}
