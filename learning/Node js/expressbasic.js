
const express = require('express');
app = express();
app.get('/', function (req, res) {
    res.send("hello world");
})
app.get('/hello', function (req, res) {
    res.send("hello universe");
})

app.get('/bye/:id', function (req, res) {
    const data = req.params.id;
    res.send("bye " + data);
})
app.get('/hi', function (req, res) {
    const data = req.query.id;
    res.send("hi " + data);
})
// app.listen(8001, function () {
//     console.log('Server is running on http://localhost:8080');
// });
