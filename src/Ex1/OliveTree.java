package Ex1;

public class OliveTree extends Tree {


    OliveTree(int height, Season season) {
        // TODO: Implement.
        super(0,null,null);
    }

    @Override
    public String toString() {
        // TODO: Implement.
        return null;
    }
    @Override
    public void changeSeason() {
        this.season = Season.getNext(this.season);
        changeHeightBySeason();
    }

    private void changeHeightBySeason(){
        switch (this.season){
            case WINTER:
            case FALL:
                this.height += 5;
                break;
            case SPRING:
            case SUMMER:
                this.height += 10;
                break;
            default:
                break;
        }
    }
}
