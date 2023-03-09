public class Bear extends Animal {

    Bear(int weight, Season season) {
        // TODO: Implement.
        super(weight, season, Color.BROWN);
    }

    @Override
    public String toString() {
        if (this.getCurrentSeason() == Season.WINTER)
            return "Bear." +
                    "I am sleeping."+
                    "My weight is: " + weight +
                    " and my color is: " + color;
        return "Bear. " +
                "My weight is: " + weight +
                " and my color is: " + color;
        // TODO: Implement.

    }

    @Override
    public Season getCurrentSeason() {
        return super.getCurrentSeason();
    }

    @Override
    public void changeSeason() {
        // TODO: Implement.
        super.changeSeason();
        Season current = getCurrentSeason();

        if (current == Season.WINTER)
            this.weight = Math.round((int) (weight - 0.2 * weight));
        else if (current == Season.SPRING)
            weight = Math.round((int) (weight - 0.25 * weight));
        else if (current == Season.SUMMER)
            weight = Math.round((int) ((float) (weight / 3) + weight));
        else if (current == Season.FALL)
            weight = Math.round((int) (weight + 0.25 * weight));
        color = Color.BROWN;

    }

}
