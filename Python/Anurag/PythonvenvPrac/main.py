
from sklearn.ensemble import IsolationForest
from sklearn.metrics import root_mean_squared_error
from statsmodels.tsa.arima.model import ARIMA
import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns
from statsmodels.graphics.tsaplots import  plot_acf

from ipywidgets import interact,widgets


df=pd.read_csv(r"D:\Datasets\FRED-NROUST.csv")


y_train,y_test=df['Value'].iloc[:-8],df['Value'].iloc[-8:]
# y_train.shape,y_test.shape


def arima(p,d,q):
    model=ARIMA(y_train,order=(p,d,q))
    model_fir=model.fit(maxiter=1000)
    pred=model.predict(start=len(y_train),end=len(y_train)+len(y_test)-1)
    y_test.plot(color='pink',label='test')
    pred.plot(color='purple',label='forcast')
    rsme=root_mean_squared_error(y_test,pred)
    plt.title(f"RMSE:{rsme:.2f}")
    plt.legend(loc='best')
    plt.show()
widgets.interact(arima,p=(0,5,1),d=(0,5,1),q=(0,5,1))
plt.show()
