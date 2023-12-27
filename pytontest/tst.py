class Test:
    def __init__(self):
        self.dicount = 90
test = Test()
print(getattr(test, "dicount"))