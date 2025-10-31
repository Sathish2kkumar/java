const ChatSession = require('../models/ChatSession');
const { getChannel } = require('../config/rabbitmq');

const sendMessageToQueue = async (userId, message) => {
    const channel = getChannel();
    if (channel) {
        channel.sendToQueue('chatQueue', Buffer.from(JSON.stringify({ userId, message })));
    }
};

const saveChatMessage = async (userId, message) => {
    let chatSession = await ChatSession.findOne({ userId });
    if (!chatSession) {
        chatSession = new ChatSession({ userId, messages: [] });
    }
    chatSession.messages.push(message);
    await chatSession.save();
};

module.exports = { sendMessageToQueue, saveChatMessage };
