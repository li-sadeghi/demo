public class Main {
    public static void main(String[] args) {
        BaseAdvertising baseAdvertising = new BaseAdvertising();
        Advertiser advertiser1 = new Advertiser(1, "name1");
        Advertiser advertiser2 = new Advertiser(2, "name2");
        Ad ad1 = new Ad(1, "title1", "img-url1", "link1", advertiser1);
        Ad ad2 = new Ad(2, "title2", "img-url2", "link2", advertiser2);
        System.out.println("describe of BaseAdvertising class:\n" + baseAdvertising.describeMe());
        System.out.println("describe of Ad class:\n" + ad2.describeMe());
        System.out.println("describe of Advertiser class:\n" + advertiser1.describeMe());
        ad1.incViews();
        ad1.incViews();
        ad1.incViews();
        ad1.incViews();
        ad2.incViews();
        ad1.incClicks();
        ad1.incClicks();
        ad2.incClicks();
        System.out.println("clicks of ad1: " + ad1.getClicks());
        System.out.println("clicks of ad2: " + ad2.getClicks());
        System.out.println("views of ad1: " + ad1.getViews());
        System.out.println("views of ad2: " + ad2.getViews());
        System.out.println("the current name of advertiser2: " + advertiser2.getName());
        advertiser2.setName("new name");
        System.out.println("the new name of advertiser2: " + advertiser2.getName());
        System.out.println("clicks of advertiser2: " + advertiser2.getClicks());
        System.out.println("the total clicks in system: " + Advertiser.getTotalClicks());
        System.out.println("help:\n" + Advertiser.help());
        System.out.println("slm");
    }
}