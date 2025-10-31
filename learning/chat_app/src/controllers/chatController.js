const { sendMessageToQueue } = require('../services/chatService');

const sendMessage = async (req, res) => {
    const { userId, message } = req.body;
    await sendMessageToQueue(userId, message);
    res.json({ success: true, message: 'Message sent to queue' });
};

module.exports = { sendMessage };