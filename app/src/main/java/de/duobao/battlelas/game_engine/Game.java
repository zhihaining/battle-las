package de.duobao.battlelas.game_engine;

import de.duobao.battlelas.computer_player.ArtificialIntelligence;
import de.duobao.battlelas.data_objects.Position;
import de.duobao.battlelas.data_objects.Damage;

public class Game
{
    private final Player[] players = new Player[2];
    private Player currentTurnForPlayer;
    private GameSettings settings;

    public Game()
    {
        players[0] = new HumanPlayer(this);
        players[1] = new ArtificialIntelligence(this);

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

    public void setPlayerMapReady(final Player player)
    {

    }

    public void shoot(final Player player, final Position position)
    {

    }

    public void retreat(final Player player)
    {
    }

    public void createGame(final Player player1, final Player player2)
    {

    }

    public GameSettings getSettings()
    {
        return settings;
    }

    public void setSettings(GameSettings settings)
    {
        this.settings = settings;
    }
}
