package Rooms;
        import Game.Runner;
        import People.Person;

public class FunRoom extends Rooms.Room{

    public FunRoom(int x, int y) {
        super(x, y);
    }

    /**
     * Teleports the player to a random location
     * @param x the Person entering
     */
    @Override
    public void enterRoom(Person x) {

        xLoc=(int)(Math.random()*3);
        x.setxLoc(this.xLoc);
        yLoc=(int)(Math.random()*3);
        x.setyLoc(this.yLoc);
    }


}