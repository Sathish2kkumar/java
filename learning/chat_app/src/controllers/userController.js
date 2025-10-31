const userservice = require('../services/Userservice');

exports.saveusers = async (req, res) => { 
          try{
            console.log("request data"+req)
            userservice.usersave(req);
          }
          catch(error){
            console.log(error)
          }
              }