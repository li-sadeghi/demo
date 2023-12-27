from Ad import Ad
from Advertiser import Advertiser
from BaseAdvertising import BaseAdvertising

if __name__ == '__main__':
    base_advertising = BaseAdvertising(0, 0, 0)
    advertiser1 = Advertiser(1, "name1", 0, 0)
    advertiser2 = Advertiser(2, "name2", 0, 0)
    ad1 = Ad(1, "title1", "img-url1", "link1", advertiser1, 0, 0)
    ad2 = Ad(2, "title2", "img-url2", "link2", advertiser2, 0, 0)
    print("describe of BaseAdvertising class:\n" + base_advertising.describe_me())
    print("describe of Ad class:\n" + ad2.describe_me())
    print("describe of Advertiser class:\n" + advertiser1.describe_me())
    ad1.incViews()
    ad1.incViews()
    ad1.incViews()
    ad1.incViews()
    ad2.incViews()
    ad1.incClicks()
    ad1.incClicks()
    ad2.incClicks()
    print("clicks of ad1: %ld" % ad1.__getattribute__("_BaseAdvertising__clicks"))
    print("clicks of ad2: %ld" % ad2.__getattribute__("_BaseAdvertising__clicks"))
    print("views of ad1: %ld" % ad1.__getattribute__("_BaseAdvertising__views"))
    print("views of ad2: %ld" % ad2.__getattribute__("_BaseAdvertising__views"))
    print("the current name of advertiser2: " + advertiser2.__getattribute__("_Advertiser__name"))
    advertiser2.__setattr__("_Advertiser__name", "new name")
    print("the new name of advertiser2: " + advertiser2.__getattribute__("_Advertiser__name"))
    print("clicks of advertiser2: %ld" % advertiser2.__getattribute__("_BaseAdvertising__clicks"))
    print("the total clicks in system: %ld" % Advertiser.getTotalClicks())
    ("help:\n" + Advertiser.help())
