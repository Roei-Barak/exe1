public class FigTree extends Tree {

    FigTree(int height, Season season) {
        // TODO: Implement.
        super(height, season, Color.YELLOW);
        this.explement = "";
    }

    @Override
    public String toString() {
        if (explement == "I have no leaves")
            return "Fig tree. My height is: " + this.height + " and " + explement;

        return "Fig tree." + explement + " My height is: " + this.height + " and my color is: " + leavesColor;
    }

    @Override
    public void changeSeason() {                        //111111111
        super.changeSeason();
        if (season == Season.WINTER) {
            height += 20;
            explement = "I have no leaves";
        } else if (season == Season.SPRING) {
            height += 30;
            leavesColor = Color.GREEN;
            explement = "";
        } else if (season == Season.SUMMER) {
            height += 30;
            explement = " I give fruit.";
        } else if (season == Season.FALL) {
            height += 20;
            leavesColor = Color.YELLOW;
            explement = "";
        }
    }
}
