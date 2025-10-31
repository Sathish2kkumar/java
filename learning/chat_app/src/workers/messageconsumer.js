const { getChannel } = require('../config/rabbitmq');
const { saveChatMessage } = require('../services/chatService');

const consumeMessages = async () => {
    const channel = getChannel();
    if (channel) {
        channel.consume('chatQueue', async (msg) => {
            if (msg !== null) {
                const { userId, message } = JSON.parse(msg.content.toString());
                await saveChatMessage(userId, message);
                console.log('Processed:', userId, message);
                channel.ack(msg);
            }
        });
    }
};

module.exports = consumeMessages;
