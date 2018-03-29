package de.duobao.battlelas.gui;

import de.duobao.battlelas.data_objects.Damage;
import de.duobao.battlelas.data_objects.Position;

public interface GameInterface
{
    void askPlayerForMap();

    void saveMap();

    void setDamage(final Position position, final Damage damage);

}
