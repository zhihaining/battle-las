package de.duobao.battlelas.game_engine;

import de.duobao.battlelas.computer_player.ArtificialIntelligence;
import de.duobao.battlelas.data_objects.BattleMap;
import de.duobao.battlelas.data_objects.HumanPlayer;
import de.duobao.battlelas.data_objects.Map;

public class Game
{
    private final Player[] player = new Player[2];
    private final Map myMap = new BattleMap();
    private final Map otherMap = new BattleMap();
    private GameType gameType = GameType.Ship;
    private boolean myTurn;

    public Game()
    {
        player[0] = new HumanPlayer();
        player[1] = new ArtificialIntelligence();

        /* ToDO
        * 1. create game, define map size, game type and game rules.
        * 1. or filter search and join a game and go to step 3.
        * 2. select one of the challenger. AI is always there.
        *   User can search or filter the challengers
        * 3. select from pattern or create own battle object map
        * 4. start game. Exchange CRC of maps for anti-cheating.
        * 5. play in turn.
        * 6. end the game, if game ending condition is satisfied.
        * 7. exchange maps and calculate CRCs again for anti-cheating.
        * 8. Calculate scores and increase level of the players, refer to number of turns
        *   long of time, the whole scores and level of the other player.
        * 9. User can pause a game if the other player is AI. If it is a human, the one,
        *   who has first left the game will loose one score.
        */
    }

    private enum GameType
    {
        Land,
        Air,
        Ship,
        All
    }


}
