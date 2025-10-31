
var http = require('http');
var calc = require('./calc');
http.createServer(function (req, res) {
    res.writeHead(200, {'Content-Type': 'text/html'});
    res.write("<p>the output is "+calc.add(2,3)+"</p>");
    res.write("<h1>hi there</h1>");
    res.end();
}).listen(8080);