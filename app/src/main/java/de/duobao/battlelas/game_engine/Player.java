package de.duobao.battlelas.game_engine;

import android.service.quicksettings.Tile;

import de.duobao.battlelas.data_objects.BattleObject;
import de.duobao.battlelas.data_objects.Damage;
import de.duobao.battlelas.data_objects.Position;

public abstract class Player
{
    Tile myMap[][] = new Tile[0][];
    Tile opponentMap[][] = new Tile[0][];
    BattleObject myBattleObjects[] = new BattleObject[0];

    /**
     * triggers the player to send a map to logic
     */
    public abstract void askForMap();

    public abstract void saveMap();

    public abstract void giveTurnToPlayer(final Player player);

    /**
     * This player is shot at.
     *
     * @param position
     * @return if hit & if dead
     */
    public abstract Damage getDamage(final Position position);

    /**
     * Reports the result of the last shot.
     *
     * @param damage the damage at the other player
     */
    public abstract void setDamage(final Damage damage);

    /**
     * Shoot at the other player.
     *
     * @param position
     */
    public abstract void shoot(final Position position);

    public abstract void retreat();
}
