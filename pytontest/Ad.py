from BaseAdvertising import BaseAdvertising


class Ad(BaseAdvertising):

    def __init__(self, id, title, imgUrl, link, advertiser, clicks, views):
        super().__init__(id, clicks, views)
        self.__title = title
        self.__imgUrl = imgUrl
        self.__link = link
        self.__advertiser = advertiser

    def describe_me(self):
        describe = "The task of this class, " \
                   "namely Ad, " \
                   "is to maintain the information of advertisements."
        return describe

    def incClicks(self):
        self.__setattr__("_BaseAdvertising__clicks", super().__getattribute__("_BaseAdvertising__clicks") + 1)
        self.__advertiser.incClicks()

    def incViews(self):
        self.__setattr__("_BaseAdvertising__views", super().__getattribute__("_BaseAdvertising__views") + 1)
        self.__advertiser.incViews()
