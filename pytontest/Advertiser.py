from BaseAdvertising import BaseAdvertising


class Advertiser(BaseAdvertising):
    advertisers = []

    def __init__(self, id, name, clicks, views):
        BaseAdvertising.__init__(self, id, clicks, views)
        self.__name = name
        self.advertisers.append(self)

    def describe_me(self):
        describe = "The task of this class, " \
                   "namely Advertiser, " \
                   "is to maintain the information of system advertisers."
        return describe

    @staticmethod
    def help():
        help_str = "This class has four fields as follows:\n" \
                   "The id field is the specific identifier of each advertiser, " \
                   "which is usually a natural number and must be unique for each advertiser. " \
                   "The name field is the name of the advertiser, " \
                   "which is stored as a string. " \
                   "The clicks and views fields are equal to the number of clicks and the number of" \
                   " views of an advertiser, respectively."
        return help_str

    @staticmethod
    def getTotalClicks():
        total_clicks = 0
        for advertiser in Advertiser.advertisers:
            total_clicks += advertiser.__getattribute__("_BaseAdvertising__clicks")
        return total_clicks;
