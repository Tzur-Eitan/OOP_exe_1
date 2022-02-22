public abstract class Animal implements Seasonable,Comparable<Animal>{
    protected int weight;
    private Season season;
    protected Color color;
    // TODO: Add auxiliary fields and functions.

    Animal(int weight, Season season, Color color){
        this.weight = weight;
        this.season = season;
        this.color = color;
    }

    @Override
    public Season getCurrentSeason() {
        return season;
    }

    @Override
    public int compareTo(Animal o)
    {
        return Integer.compare(this.weight, o.weight);
    }

    @Override
    public void changeSeason()
    {
        season = Season.getNext(this.season);
    }
}
