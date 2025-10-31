const userservice = require('../services/userservice');
const User = require('../models/user');

exports.getUsers = async (req, res) => {
    try {
        const users = await userservice.getAllUsers();
        res.json(users);
    } catch (error) {
        console.error('Error fetching users:', error);
        res.status(500).json({ error: 'Internal server error' });
    }
};
exports.saveusers = async(req,res)=>{ 
    try {
        const user = new User(req.body);
        const savedUser = await userservice.savedUser(user);
        res.json(savedUser);
    } catch (error) {
        console.error('Error saving user:', error);
        res.status(500).json({ error: 'Internal server error' });
    }
};