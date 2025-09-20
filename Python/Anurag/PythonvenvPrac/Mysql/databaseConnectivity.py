import pymysql as p
def execute_query(query,params=None,fetchall=True):
    con=p.connect(host="localhost",user='root',password="Anurag@1",database='pgdai_anurag',autocommit=True)
    cur=con.cursor()
    try:
        if params:
            cur.execute(query,params)
        else:
            cur.execute(query)
        if fetchall:
            return cur.fetchall()
        else:
            return cur.fetchone()
    except Exception as e:
        print(f"Error:{e}")
        return None
    finally:
        cur.close()
        con.close()






