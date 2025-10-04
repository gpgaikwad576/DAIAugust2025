from assig3.dessert_items.DessertItem import DessertItem


class Cookie(DessertItem):
    def __init__(self, name: str, price: int):
        super().__init__(name, price)

    def get_cost(self):
        return self._price / 12

