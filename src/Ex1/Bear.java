package Ex1;

import Ex1.Season;

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
            case Season.WINTER -> this.weight -= (this.weight * 0.2);
            case Season.SPRING -> this.weight -= (this.weight * 0.25);
            case Season.SUMMER -> this.weight += (this.weight * (1.0 / 3.0));
            case Season.FALL -> this.weight += (this.weight * 0.25);
        }
    }
}