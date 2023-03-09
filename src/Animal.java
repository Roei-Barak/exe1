public abstract class Animal implements Seasonable,Comparable<Animal>{
    protected int weight;
    private Season season;
    protected Color color;
    // TODO: Add auxiliary fields and functions.

    Animal(int weight, Season season, Color color){
        this.weight =weight;
        this.season =season;
        this.color =color;
    }

    @Override
    public Season getCurrentSeason() {
        return season;
    }
    public void changeSeason(){                                        //11111
        this.season = season.next();
    }

    @Override
    public int compareTo(Animal other) {
        return Integer.compare(this.weight, other.weight);
    }
}
