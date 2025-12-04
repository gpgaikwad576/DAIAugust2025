from flask import Flask, redirect, url_for

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
def hello_admin():
    return 'Hello admin'

@app.route('/guest/<guest>')
def hello_guest(guest):
    return f'Hello {guest}'

@app.route('/user/<name>')
def hello_name(name):
    if name =='admin':
        return redirect(url_for('hello_admin'))
    else:
        return redirect(url_for('hello_guest',guest = name))

if __name__ == "__main__":
    app.run(debug=True)