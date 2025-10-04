from assig3.dessert_items.Candy import Candy
from assig3.dessert_items.DessertItem import DessertItem
import json

from assig3.exceptions.CartIsEmptyException import CartIsEmptyException


class Checkout:
    __cash_register = {}  #aka cart

    @classmethod
    def cash_register(cls):
        return cls.__cash_register

    @classmethod
    def add_item(cls,items_quant):
        for item,quant in items_quant.items():
            cls.__cash_register[item] = quant


    @classmethod
    def clear_cash_reg(cls):
        cls.__cash_register.clear()

    @classmethod
    def get_number_of_items(cls):
        cnt=0
        for item,quant in cls.__cash_register.items():
            if isinstance(item,Candy):  #can i do it without if condition and no memory usage?
                cnt+=1
                continue
            cnt+=quant
        return cnt

    @classmethod
    def get_total_cost(cls):
        if len(cls.__cash_register.items()) ==0:
            raise CartIsEmptyException
        total_cost =0
        for item,quant in cls.__cash_register.items():
            total_cost+=(item.get_cost() *quant)
        return total_cost

    @classmethod
    def get_cash_register(cls):
        # return "\n".join([item.__repr__() for item in cls.cash_register])
        # json_list = []
        # for item,quant in cls.__cash_register.items():
        #     base_data = json.loads(super().__repr__())
        #     invoice_line = {**base_data, "quantity": quant, "cost": item.get_cost() * quant}
        #     json_list.append(json.dumps(invoice_line))
        # return json_list

        item_lst = []
        for item,quant in cls.__cash_register.items():
            temp = item.__repr__()
            temp["quantity"]=quant
            temp["cost"] = item.get_cost()*quant
            item_lst.append(temp)
        return item_lst

























