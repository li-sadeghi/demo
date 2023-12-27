public class Ad extends BaseAdvertising {
    private String title;
    private String imgUrl;
    private String link;
    private Advertiser advertiser;

    public Ad(long id, String title, String imgUrl, String link, Advertiser advertiser) {
        super(id, 0, 0);
        setTitle(title);
        setImgUrl(imgUrl);
        setLink(link);
        setAdvertiser(advertiser);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Advertiser getAdvertiser() {
        return advertiser;
    }

    public void setAdvertiser(Advertiser advertiser) {
        this.advertiser = advertiser;
    }

    public String describeMe() {
        String describe = "The task of this class, " +
                "namely Ad, " +
                "is to maintain the information of advertisements.";
        return describe;
    }

    public void incClicks() {
        this.clicks += 1;
        advertiser.incClicks();
    }

    public void incViews() {
        this.views += 1;
        advertiser.incViews();
    }
}
