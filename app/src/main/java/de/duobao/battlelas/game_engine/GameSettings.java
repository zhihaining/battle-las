package de.duobao.battlelas.game_engine;

/**
 * Created by Deen zhi on 29.03.2018.
 */

public class GameSettings
{
    public int mapHSize = 10;
    public int mapVSize = 10;
    public int battleObjectSize = 3;

    public enum GameType
    {
        Land,
        Air,
        Ship,
        All
    }

    public GameType gameType = GameType.Ship;
}
