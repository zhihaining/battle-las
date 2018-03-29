package de.duobao.battlelas.data_objects;

public class Tile
{
    public enum State
    {
        UNDETECTED,
        HIT,
        MISS
    }
    private State state;

    public enum Type
    {
        shipPart, tankPart, planePart, EMPTY,
        LAND,
        SEA
    }

    private Type type;

    public State getState()
    {
        return state;
    }

    public Type getType()
    {
        return type;
    }

    public void setState(State state)
    {
        this.state = state;
    }

    public void setType(Type type)
    {
        this.type = type;
    }
}
