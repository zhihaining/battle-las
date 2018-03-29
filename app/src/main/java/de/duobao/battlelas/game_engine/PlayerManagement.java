package de.duobao.battlelas.game_engine;

import de.duobao.battlelas.computer_player.ArtificialIntelligence;

public class PlayerManagement
{
    public Player getOpponent()
    {
        return new ArtificialIntelligence();
    }
}
