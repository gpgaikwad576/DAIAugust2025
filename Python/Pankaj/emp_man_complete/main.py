from class_def.Employee import Employee
from class_def.Manager import Manager
from class_def.MarketingExec import MarketingExec

if __name__=="__main__":
    e = Employee("Pankaj",50000)
    print(e,e.get_pt(),e.calc_gross(),e.calc_nett())
    print()



    # e.basic_sal=60000
    # e.change_pt(300)
    # print(e,e.get_pt(),e.calc_gross(),e.calc_nett())
    # print()

    e2 = Employee("Pawan", 40000)
    print(e2,e2.get_pt(), e2.calc_gross(), e2.calc_nett())
    print()


    m = MarketingExec("Ravi",90000,10)
    print(m,m.get_phone_allow(),m.kms_travelled,m.get_pt(),m.calc_gross(), m.calc_nett())
    print()

    # m.basic_sal = 120000
    # m.change_pt(400)
    # m.change_phone_allow(2000)
    # m.kms_travelled = 20
    # print(m,m.get_phone_allow(),m.kms_travelled,m.get_pt(), m.basic_sal, m.calc_gross(), m.calc_nett())

    m2 = MarketingExec("Savi", 90000, 10)
    print(m2, m2.get_phone_allow(), m2.kms_travelled, m2.get_pt(), m2.calc_gross(), m2.calc_nett())
    print()




