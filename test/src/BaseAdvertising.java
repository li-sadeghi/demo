public class BaseAdvertising {
    protected long id;
    protected long clicks;
    protected long views;

    public BaseAdvertising(long id, long clicks, long views) {
        setId(id);
        setClicks(clicks);
        setViews(views);
    }

    public BaseAdvertising() {
    }

    public String describeMe() {
        String describe = "This class has two subclasses, " +
                "advertisement and advertisers, and in them, " +
                "it stores the system advertisement information and their advertisers.";
        return describe;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getClicks() {
        return clicks;
    }

    public void setClicks(long clicks) {
        this.clicks = clicks;
    }

    public long getViews() {
        return views;
    }

    public void setViews(long views) {
        this.views = views;
    }

    public void incClicks() {
        this.clicks += 1;
    }

    public void incViews() {
        this.views += 1;
    }
}
