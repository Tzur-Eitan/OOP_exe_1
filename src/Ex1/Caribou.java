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
        String data = "Caribou. " +
                      "My weight is: " + this.weight + " " +
                      "and my color is: " + this.color;

        switch (this.season)
        {
            case WINTER -> data = "Caribou. " +
                                  "I am migrating south. " +
                                  "My weight is: " + this.weight + " " +
                                  "and my color is: " + this.color;
            case SUMMER -> data = "Caribou. " +
                                  "I am migrating north. " +
                                  "My weight is: " + this.weight + " " +
                                  "and my color is: " + this.color;
        }

        return data;
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
            case WINTER -> this.color = Color.WHITE;
            case SPRING -> this.color = Color.BROWN;
        }
    }
}
