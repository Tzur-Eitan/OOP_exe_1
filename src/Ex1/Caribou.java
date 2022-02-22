package Ex1;

public class Caribou extends Animal
{

    Caribou(int weight, Season season)
    {
        super(weight, season, Color.BROWN);
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
        setColor();
    }

    public void setColor()
    {
        switch (this.season)
        {
            case Season.WINTER -> this.color = Color.WHITE;
            case Season.SPRING -> this.color = Color.BROWN;
        }
    }
}
