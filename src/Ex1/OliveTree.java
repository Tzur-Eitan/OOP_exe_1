package Ex1;

public class OliveTree extends Tree {

    OliveTree(int height, Season season) {
        super(height,season,Color.GREEN);
//        changePropertiesBySeason();
    }

    @Override
    public String toString() {
        String giveFruit = this.haveFruit? "i give fruit. " : "";
        String color = this.haveLeafs? String.format("and my color is: %s", this.leavesColor) : "and i have no leaves";
        return String.format("Olive tree. %1$s My height is: %2$d %3$s", giveFruit, this.height, color);
    }

    @Override
    public void changeSeason() {
        this.season = Season.getNext(this.season);
        changePropertiesBySeason();
    }

    private void changePropertiesBySeason(){
        switch (this.season) {
            case WINTER -> {
                this.height += 5;
                this.leavesColor = Color.GREEN;
                this.haveLeafs = true;
                this.haveFruit = false;
            }
            case SPRING, SUMMER -> {
                this.height += 10;
                this.leavesColor = Color.GREEN;
                this.haveLeafs = true;
                this.haveFruit = false;
            }
            case FALL -> {
                this.height += 5;
                this.leavesColor = Color.GREEN;
                this.haveLeafs = true;
                this.haveFruit = true;
            }
            default -> {
            }
        }
    }
}
