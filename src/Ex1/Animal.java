package Ex1;

public abstract class Animal implements Seasonable,Comparable<Animal>{
    protected int weight;
    protected Season season;
    protected Color color;

    Animal(int weight, Season season, Color color)
    {
        this.weight = weight;
        this.season = season;
        this.color = color;
    }

    @Override
    public Season getCurrentSeason()
    {
        return season;
    }

    @Override
    public int compareTo(Animal o)
    {
        return Integer.compare(this.weight, o.weight);
    }
}
