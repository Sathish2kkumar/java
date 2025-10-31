const express = require('express');
const bodyParser = require('body-parser');
console.log('Current directory:', __dirname);
console.log('Resolved path for route:', require.resolve('./route/route'));
const routedata = require('./route/route');

const app = express();

app.use(bodyParser.json());

app.use('/', routedata);

app.listen(7000, () => {
  console.log('Server started on port 3000');
});
const mongoose = require('mongoose');

main().catch(err => console.log(err));

async function main() {
  await mongoose.connect('mongodb://127.0.0.1:27017/crud_node');
}