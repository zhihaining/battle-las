package de.duobao.battlelas.game_engine;

import de.duobao.battlelas.data_objects.Tile;
import de.duobao.battlelas.data_objects.BattleObject;
import de.duobao.battlelas.data_objects.Damage;
import de.duobao.battlelas.data_objects.Position;
import de.duobao.battlelas.game_engine.Game;

public abstract class Player
{
    Tile opponentMap[][] = new Tile[0][];
    BattleObject myBattleObjects[] = new BattleObject[0];
    Tile myMap[][] = new Tile[0][];
    private boolean myTurn;

    protected Game parent;

    public Player(Game parent)
    {
        this.parent = parent;
        opponentMap = new Tile[parent.getSettings().mapHSize][parent.getSettings().mapVSize];
        myBattleObjects = new BattleObject[parent.getSettings().battleObjectSize];
    }

    /**
     * triggers the player to send a map to logic
     */
    public abstract void askForMap();

    public void saveMap(Tile[][] mapToSave){
        myMap = mapToSave;
    }

    public void giveTurnToPlayer(final Player player)
    {
        myTurn = (player == this);
    }

    /**
     * This player is shot at.
     *
     * @param position
     * @return if hit & if dead
     */
    public Damage getDamage(final Position position)
    {
        Damage damage = new Damage();
        if(myMap[position.x][position.y].getType() == Tile.Type.shipPart ||
           myMap[position.x][position.y].getType() == Tile.Type.tankPart ||
           myMap[position.x][position.y].getType() == Tile.Type.planePart)
        {
            damage.isHit = true;
        }
        return damage;
    }

    /**
     * Reports the result of the last shot.
     *
     * @param damage the damage at the other player
     */
    public void setDamage(final Position position, final Damage damage)
    {
        if(damage.isHit)
        {
            myMap[position.x][position.y].setState(Tile.State.HIT);
        }
    }

    /**
     * Shoot at the other player.
     *
     * @param position
     */
    public boolean shoot(final Position position)
    {
        if(myMap[position.x][position.y].getState() != Tile.State.UNDETECTED)
        {
            return false;
        }
        else
        {
            parent.shoot(this, position);
        }
        return true;
    }

    public void retreat()
    {
        parent.retreat(this);
    }
}
