package Ex1;

public class OliveTree extends Tree {

    OliveTree(int height, Season season) {
        super(height,season,Color.GREEN);
        changePropertiesBySeason(true);
    }

    @Override
    public String toString() {
        String giveFruit = this.haveFruit? "i give fruit. " : "";
        String color = this.haveLeaves? String.format("and my color is: %s", this.leavesColor) : "and i have no leaves";
        return String.format("Olive tree. %1$sMy height is: %2$d %3$s", giveFruit, this.height, color);
    }

    @Override
    public void changeSeason() {
        this.season = Season.getNext(this.season);
        changePropertiesBySeason(false);
    }

    private void changePropertiesBySeason(Boolean start){
        switch (this.season) {
            case WINTER:
                this.height += start? 0 : 5;
                this.leavesColor = Color.GREEN;
                this.haveLeaves = true;
                this.haveFruit = false;
                break;
            case SPRING:
            case SUMMER:
                this.height += start? 0 : 10;
                this.leavesColor = Color.GREEN;
                this.haveLeaves = true;
                this.haveFruit = false;
                break;
            case FALL:
                this.height += start? 0 : 5;
                this.leavesColor = Color.GREEN;
                this.haveLeaves = true;
                this.haveFruit = true;
                break;
            default:
                break;
        }
    }
}
