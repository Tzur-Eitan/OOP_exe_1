package Ex1;

public abstract class Tree implements Comparable<Tree>, Seasonable {
    protected int height;
    protected Season season;
    protected Color leavesColor;
    protected Boolean haveLeafs;
    protected Boolean haveFruit;

    Tree(int height, Season season, Color leavesColor){
        this.height = height;
        this.season = season;
        this.leavesColor = leavesColor;
        //default values are given
        this.haveLeafs = false;
        this.haveFruit = false;
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
