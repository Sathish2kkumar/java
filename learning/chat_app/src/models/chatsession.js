const mongoose = require('mongoose');
const chatsessionschema = mongoose.Schema({
    userempid:{type:String,require:true},
    message:{type:String,require:true}
})
module.exports=mongoose.model('chatmodule',chatsessionschema);