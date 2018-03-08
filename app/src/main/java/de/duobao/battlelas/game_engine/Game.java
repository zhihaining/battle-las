package de.duobao.battlelas.game_engine;

import de.duobao.battlelas.computer_player.ArtificialIntelligence;
import de.duobao.battlelas.data_objects.HumanPlayer;
import de.duobao.battlelas.data_objects.Map;

public class Game
{
    private final Player[] player = new Player[2];
    private final Map map = new Map();

    public Game()
    {
        player[0] = new HumanPlayer();
        player[1] = new ArtificialIntelligence();
    }
}
