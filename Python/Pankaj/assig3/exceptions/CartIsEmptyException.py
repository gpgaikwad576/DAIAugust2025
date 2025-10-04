class CartIsEmptyException(Exception):
    def __init__(self):
        self.__message = 'Cart is Empty'
        super().__init__(self.__message)

