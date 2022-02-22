public class Bear extends Animal
{
    Bear(int weight, Season season)
    {
        super(weight,season,Color.BROWN);
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

        switch (this.season)
        {
            case WINTER -> this.weight -= (this.weight * 0.2);
            case SPRING -> this.weight -= (this.weight * 0.25);
            case SUMMER -> this.weight += (this.weight * (1.0 / 3.0));
            case FALL -> this.weight += (this.weight * 0.25);
        }
    }
}
