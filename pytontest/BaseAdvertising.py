class BaseAdvertising:

    def __init__(self, id, clicks, views):
        self.__id = id
        self.__clicks = clicks
        self.__views = views

    def describe_me(self):
        describe = "This class has two subclasses, advertisement and advertisers," \
                   " and in them, it stores the system " \
                   "advertisement information and their advertisers."
        return describe

    def incClicks(self):
        self.__clicks += 1

    def incViews(self):
        self.__views += 1
