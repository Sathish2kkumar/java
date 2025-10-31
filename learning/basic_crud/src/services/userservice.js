const User = require('../models/user');
exports.getallusers = async () => {
    try {
        const users = await User.find();
        return users;
    } catch (error) {
        console.error('Error fetching users:', error);  
    }
}
exports.saveusers = async (user) => {
    try {
        const existinguser = await User.findOne({ mail: user.mail });
        if (existinguser) {
            throw new Error('User already exists');
        }
        const savedUser = await user.save(user);
        return savedUser;
    } catch (error) {
        console.error('Error saving user:', error);  
    }
}