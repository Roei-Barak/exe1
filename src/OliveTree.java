public class OliveTree extends Tree {


    OliveTree(int height, Season season) {
        // TODO: Implement.
        super(height,season,null);
    }

    @Override
    public String toString() {
        return "OliveTree{" +explement+ "My height is:" + getHeight()+ "and my color is:" +leavesColor;
    }
    @Override
    public void changeSeason() {         //111111111
            super.changeSeason();
            if (season == Season.WINTER){
                height+=5;
            }
            else if (season == Season.SPRING){
                height+=10;
            }
            else if (season == Season.SUMMER){
                height+=10;
            }
            else if (season == Season.FALL){
                height+=5;
                explement = "An olive tree bears fruit";
            }
        }
    }
