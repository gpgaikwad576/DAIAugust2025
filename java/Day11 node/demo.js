var express =require("express")
var app=express()

app.get("/",function(request,response){
    response.send("Hello world from nodejs")
}

)

app.get("/date",function(request,response){
    response.send("Date: "+ new Date().toDateString())
}
)

app.listen(8080)

