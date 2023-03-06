public abstract class Tree implements Comparable, Seasonable {
    public int getHeight() {
        return height;
    }

    protected int height;
    protected Season season;
    protected String explement;
    protected Color leavesColor;
    // TODO: Add auxiliary fields and functions.

    Tree(int height, Season season, Color leavesColor){
        this.height = height;
        this.season = season;
        this.leavesColor = leavesColor;
    }

    public void changeSeason(){                                        //11111
        season.next();
    }
    @Override
    public Season getCurrentSeason() {
        return season;
    }

    @Override
    public int compareTo(Object o) {                                    //111111111
        Tree hei= (Tree) o;
        if (this.getHeight()> hei.getHeight())
            return 1;
        if (this.getHeight()< hei.getHeight())
            return -1;
        return 0;
    }

    @Override
    public String toString() {                                        //1111111111
        return "Tree{" +
                "height=" + height +
                ", season=" + season +
                ", leavesColor=" + leavesColor +
                '}';
    }
}
