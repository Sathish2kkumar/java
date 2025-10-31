const User = require('../models/User');
exports.usersave = async (user) => {
    try {
        const usersave = new User(user);
        await usersave.save();
        console.log('User saved successfully:', user);
    } catch (error) {
        console.error('Error saving user:', error);
    }
}