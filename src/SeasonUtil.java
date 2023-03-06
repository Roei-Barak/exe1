import java.util.ArrayList;
import java.util.Arrays;

public class SeasonUtil {
    public static final Season[] SEASONS = Season.values();
    public static void sortSeasonable(Comparable[] seasonables) {
        // TODO: Implement.
        Arrays.sort(seasonables);
    }

    static String reportAll(Seasonable[] seasonables) {
        // TODO: Implement.
        String allSeason = "";
        for (Seasonable seasonable : seasonables) {
            allSeason += seasonable.toString() + '\n';
        }
        return allSeason;
    }
}
