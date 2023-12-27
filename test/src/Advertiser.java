import java.util.ArrayList;
import java.util.List;

public class Advertiser extends BaseAdvertising {
    private String name;
    private static List<Advertiser> advertisers = new ArrayList<>();

    public Advertiser(long id, String name) {
        super(id, 0, 0);
        setName(name);
        advertisers.add(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String help() {
        String help = "This class has four fields as follows:\n" +
                "The id field is the specific identifier of each advertiser, " +
                "which is usually a natural number and must be unique for each advertiser. " +
                "The name field is the name of the advertiser, " +
                "which is stored as a string. " +
                "The clicks and views fields are equal to the number of clicks and the number of" +
                " views of an advertiser, respectively.";
        return help;
    }

    public static long getTotalClicks() {
        int totalClicks = 0;
        for (Advertiser advertiser : advertisers) {
            totalClicks += advertiser.clicks;
        }
        return totalClicks;
    }

    public String describeMe() {
        String describe = "The task of this class, " +
                "namely Advertiser, " +
                "is to maintain the information of system advertisers.";
        return describe;
    }
}
