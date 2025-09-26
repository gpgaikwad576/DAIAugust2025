from class_def.Employee import Employee
from class_def.Manager import Manager
from emp_man_complete.class_def.MarketingExec import MarketingExec

if __name__=="__main__":
    e = Employee("Pankaj",50000)
    print(e)
    print(e.get_eid(),e.get_pt(),e.basic_sal,e.calc_gross(),e.calc_nett())
    print()



    e.basic_sal=60000
    e.change_pt(300)
    print(e)
    print(e.get_eid(),e.get_pt(),e.basic_sal, e.calc_gross(), e.calc_nett())
    print()

    e = Employee("Pawan", 40000)
    print(e)
    print(e.get_eid(), e.get_pt(), e.basic_sal, e.calc_gross(), e.calc_nett())
    print()


    m = MarketingExec("Ravi",90000,10)
    print(m)
    print(m.get_eid(), m.get_phone_allow(),m.kms_travelled,m.get_pt(), m.basic_sal, m.calc_gross(), m.calc_nett())
    print()

    m.basic_sal = 120000
    m.change_pt(400)
    m.change_phone_allow(2000)
    m.kms_travelled = 20
    print(m)
    print(m.get_eid(), m.get_phone_allow(),m.kms_travelled,m.get_pt(), m.basic_sal, m.calc_gross(), m.calc_nett())




