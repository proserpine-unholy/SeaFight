package players.classes;

import players.interfaces.Player;
import ships.classes.Vessel;

import java.util.List;

public class User implements Player {
    private List<Vessel> vessels;

    @Override
    public void getReadyForGame() {

    }

    @Override
    public boolean isReadyToPlay() {
        return false;
    }

    @Override
    public List<Vessel> getVessels() {
        return null;
    }
}