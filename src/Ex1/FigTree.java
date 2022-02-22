package Ex1;

public class FigTree extends Tree {

    FigTree(int height, Season season) {
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
                this.height += 5;
                break;

            case FALL:
                this.height += 20;
                break;

            case SUMMER:
                this.height += 30;
                break;
            default:
                break;
        }
    }
}
