public class Caribou extends Animal {

    Caribou(int weight, Season season) {
        // TODO: Implement.
        super(weight, season, Color.BROWN);
        if (season == Season.WINTER)
            this.color = Color.WHITE;
    }

    @Override
    public String toString() {
        // TODO: Implement.
        if (getCurrentSeason() == Season.WINTER)
            return "Caribou: I am migrating south." +
                    "My weight is: "+ weight +
                    " and my color is: " + color;
        if (getCurrentSeason() == Season.SUMMER)
            return "Caribou: I am migrating north. "+
                    "My weight is: "+ weight +
                    " and my color is: " + color;
        else
            return "Caribou: My weight is: " + weight +
                    " and my color is: " +color;
    }

    @Override
    public void changeSeason() {
        // TODO: Implement.
        super.changeSeason();
    }
}
