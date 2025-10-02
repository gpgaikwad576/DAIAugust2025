from assig3.dessert_items.Candy import Candy
from assig3.dessert_items.DessertItem import DessertItem


class Checkout:
    cash_register = []   #aka cart

    @classmethod
    def add_item(cls,item:DessertItem):
        cls.cash_register.append(item)

    @classmethod
    def clear_cash_reg(cls):
        cls.cash_register.clear()

    @classmethod
    def get_number_of_items(cls):
        cnt=0
        for item in cls.cash_register:
            if isinstance(item,Candy):  #can i do it without if condition and no memory usage?
                cnt+=1
                continue
            cnt+=item.quantity
        return cnt

    @classmethod
    def get_total_cost(cls):
        total_cost =0
        for item in cls.cash_register:
            total_cost+=item.get_cost()
        return total_cost

    @classmethod
    def get_invoice(cls):
        return "\n".join([item.__repr__() for item in cls.cash_register])











