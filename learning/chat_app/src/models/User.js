const mongoose = require('mongoose');
const userschema = new mongoose.Schema({
    name:{type:String,require:true},
    email:{type:String,unique:true,require:true},

})
module.exports=mongoose.model('User',userschema);