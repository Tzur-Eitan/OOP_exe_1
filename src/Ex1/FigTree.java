package Ex1;

public class FigTree extends Tree {
    protected Boolean haveLeafs = null;
    protected Boolean haveFruit = null;

    FigTree(int height, Season season) {
        super(height, season, null);
//        changePropertiesBySeason();
    }

    @Override
    public String toString() {

        return switch (this.season) {
            case WINTER -> "Fig tree. " +
                    "My height is: " + this.height +
                    " and I have no leaves";
            case SPRING, FALL -> "Fig tree. " +
                    "My height is: " + this.height +
                    " and my color is: " + this.leavesColor;
            case SUMMER -> "Fig tree. " +
                    "I give fruit. " +
                    "My height is: " + this.height +
                    " and my color is: " + this.leavesColor;
        };
    }

    @Override
    public void changeSeason() {
        this.season = Season.getNext(this.season);
        changePropertiesBySeason();
    }

    private void changePropertiesBySeason(){
        switch (this.season) {
            case WINTER -> {
                this.height += 20;
                this.leavesColor = null;
                this.haveLeafs = false;
                this.haveFruit = false;
            }
            case SPRING -> {
                this.height += 30;
                this.leavesColor = Color.GREEN;
                this.haveLeafs = true;
                this.haveFruit = false;
            }
            case SUMMER -> {
                this.height += 30;
                this.leavesColor = Color.GREEN;
                this.haveLeafs = true;
                this.haveFruit = true;
            }
            case FALL -> {
                this.height += 20;
                this.leavesColor = Color.YELLOW;
                this.haveLeafs = true;
                this.haveFruit = false;
            }
            default -> {
            }
        }
    }
}
