from flask import Flask, redirect, url_for, render_template, request

app = Flask(__name__)

@app.route('/hello')
def hello_world():
    return "Hello World"

@app.route('/index')
def hello_index():
    return 'Welcome to Index page'

# @app.route('/hello/<name>')
# def hello_name(name):
#     return f"hello {name}"


## Redirecting part 
@app.route('/admin')
def hello_admin(user):
    return render_template('helloworld.html',name = user)

@app.route('/guest/<guest>')
def hello_guest(guest):
    return f'Hello {guest}'

@app.route('/user/<name>')
def hello_name(name):
    if name =='admin':
        return redirect(url_for('hello_admin'))
    else:
        return redirect(url_for('hello_guest',guest = name))

@app.route('/result',methods = ['post'])
def fun_result():
    name = request.form['name']
    phy = int(request.form['phy'])
    che = int(request.form['che'])
    mat = int(request.form['mat'])
    per = (phy + che + mat)/3
    return render_template('result2.html',value = per)

if __name__ == "__main__":
    app.run(debug=True)