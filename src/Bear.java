import Ex1.Season;

public class Bear extends Animal
{

    Bear(int weight, Season season)
    {
        // TODO: Implement.
        super(0,null,null);
    }
    @Override
    public String toString()
    {
        // TODO: Implement.
        return null;
    }
    @Override
    public void changeSeason()
    {
        this.season = Season.getNext(this.season);
    }
}
