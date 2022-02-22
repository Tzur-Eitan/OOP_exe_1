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
            case WINTER -> this.weight = (int)Math.floor((weight * 0.8));
            case SPRING -> this.weight = (int)Math.floor((weight * 0.75));
            case SUMMER -> this.weight = (int)Math.floor((weight * 4d / 3d));
            case FALL -> this.weight += (this.weight * 1.25);
        }
    }
}
