require('dotenv').config();
const express = require('express');
const connectDB= require('./src/config/database')
const userRoutes = require('./src/routes/route')
const app = express();
const port = process.env.port||3000;


app.use(express.json());
app.use('/api/users',userRoutes);
app.listen(port,()=>{
    console.log(`server running on a port ${port}`);
})