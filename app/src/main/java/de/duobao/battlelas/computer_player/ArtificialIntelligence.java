package de.duobao.battlelas.computer_player;

import de.duobao.battlelas.data_objects.Tile;
import de.duobao.battlelas.game_engine.Game;
import de.duobao.battlelas.game_engine.Player;

public class ArtificialIntelligence extends Player
{
    public ArtificialIntelligence(Game parent)
    {
        super(parent);
    }

    /**
     * triggers the player to send a map to logic
     */
    public void askForMap()
    {
        Tile[][] myMap = new Tile[parent.getSettings().mapHSize][parent.getSettings().mapVSize];
        for (int i=0; i<parent.getSettings().mapHSize; ++i)
        {
            for(int j=0; j<parent.getSettings().mapVSize; ++j)
            {
                myMap[i][j] = new Tile();
            }
        }
        myMap[3][3].setType(Tile.Type.shipPart);
        myMap[3][3].setState(Tile.State.UNDETECTED);

        saveMap(myMap);
        parent.setPlayerMapReady(this);
    }

    @Override
    public void giveTurnToPlayer(Player player)
    {
        super.giveTurnToPlayer(player);

        //todo calculate probabilities of each Tile and decide one to shoot.
    }
}
