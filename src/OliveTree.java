public class OliveTree extends Tree {


    OliveTree(int height, Season season) {
        // TODO: Implement.
        super(height, season, Color.GREEN);
        this.explement = "I give fruit.";
    }

    @Override
    public String toString() {
        return "Olive tree. "
                + explement +
                " My height is: " + this.height
                + " and my color is: " + this.leavesColor;
//        return "OliveTree{" + explement + "My height is:" + getHeight() + " and my color is:" + leavesColor;
    }

    @Override
    public void changeSeason() {         //111111111
        super.changeSeason();
        if (season == Season.WINTER) {
            height += 5;
            explement = "";
        } else if (season == Season.SPRING) {
            height += 10;
        } else if (season == Season.SUMMER) {
            height += 10;
        } else if (season == Season.FALL) {
            height += 5;
            explement = "An olive tree bears fruit";
        }
    }
}
