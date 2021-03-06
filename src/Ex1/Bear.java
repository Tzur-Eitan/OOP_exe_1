package Ex1;

public class Bear extends Animal
{
    Bear(int weight, Season season)
    {
        super(weight,season,Color.BROWN);
    }

    @Override
    public String toString()
    {
        if (this.season.compareTo(Season.WINTER) == 0)
        {
            return "Bear. " +
                    "I am sleeping. " +
                    "My weight is: " + this.weight + " " +
                    "and my color is: " + this.color;
        }

        else
        {
            return "Bear. " +
                    "My weight is: " + this.weight + " " +
                    "and my color is: " + this.color;
        }
    }

    @Override
    public void changeSeason()
    {
        this.season = Season.getNext(this.season);

        switch (this.season)
        {
            case WINTER:
                this.weight -= (int)Math.ceil(((double)weight * 0.2));
                break;
            case SPRING:
                this.weight -= (int)Math.ceil(((double)weight * 0.25));
                break;
            case SUMMER:
                this.weight = (int)Math.floor(((double)weight * 4d / 3d));
                break;
            case FALL:
                this.weight += (int)Math.floor(((double)weight * 0.25));
                break;
            default:
                break;
        }
    }
}
