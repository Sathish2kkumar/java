const amqplib = require('amqplib');

let channel = null;

const connectRabbitMQ = async () => {
    try {
        const connection = await amqplib.connect(process.env.RABBITMQ_URL);
        channel = await connection.createChannel();
        await channel.assertQueue('chatQueue');
        console.log('RabbitMQ Connected');
    } catch (error) {
        console.error('RabbitMQ Connection Error:', error);
    }
};

const getChannel = () => channel;

module.exports = { connectRabbitMQ, getChannel };