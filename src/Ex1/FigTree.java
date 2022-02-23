package Ex1;

public class FigTree extends Tree {

    FigTree(int height, Season season) {
        super(height, season, null);
        changePropertiesBySeason(true);
    }

    @Override
    public String toString() {

        switch (this.season) {
            case WINTER:
                return "Fig tree. " +
                        "My height is: " + this.height +
                        " and I have no leaves";
            case SPRING:
            case FALL:
                return "Fig tree. " +
                        "My height is: " + this.height +
                        " and my color is: " + this.leavesColor;
            case SUMMER:
                return "Fig tree. " +
                        "I give fruit. " +
                        "My height is: " + this.height +
                        " and my color is: " + this.leavesColor;
            default:
                return null;
        }
    }

    @Override
    public void changeSeason() {
        this.season = Season.getNext(this.season);
        changePropertiesBySeason(false);
    }


    private void changePropertiesBySeason(Boolean start){
        switch (this.season) {
            case WINTER:
                this.height += start? 0 : 20;
                this.leavesColor = null;
                this.haveLeaves = false;
                this.haveFruit = false;
                break;
            case SPRING:
                this.height += start? 0 : 30;
                this.leavesColor = Color.GREEN;
                this.haveLeaves = true;
                this.haveFruit = false;
                break;
            case SUMMER:
                this.height += start? 0 : 30;
                this.leavesColor = Color.GREEN;
                this.haveLeaves = true;
                this.haveFruit = true;
                break;
            case FALL:
                this.height += start? 0 : 20;
                this.leavesColor = Color.YELLOW;
                this.haveLeaves = true;
                this.haveFruit = false;
                break;
            default:
                break;
        }
    }
}
