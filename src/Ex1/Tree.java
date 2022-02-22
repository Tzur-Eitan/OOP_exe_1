package Ex1;

public abstract class Tree implements Comparable<Tree>, Seasonable {
    protected int height;
    protected Season season;
    protected Color leavesColor;
    // TODO: Add auxiliary fields and functions.

    Tree(int height, Season season, Color leavesColor){
        this.height = height;
        this.season = season;
        this.leavesColor = leavesColor;
    }

    @Override
    public Season getCurrentSeason() {
        return season;
    }

    //Compare trees heights
    @Override
    public int compareTo(Tree tree) {
        return Integer.compare(this.height, tree.height);
    }
}
