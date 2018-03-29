package de.duobao.battlelas.data_objects;

class Tile
{
    boolean isHit;

    enum type
    {
        shipPart1, tankPart1, planePart1, EMPTY,
        LAND,
        SEA
    }
}
