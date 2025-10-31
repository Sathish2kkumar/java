require('dotenv').config();
const express = require('express');
const http = require('http');
const dbconnection = require('./src/config/database');
const { connectRabbitMQ } = require('./src/config/rabbitmq');
const chatRoutes = require('./src/routes/chatroutes');
const setupWebSocket = require('./src/websocket/socket');
const consumeMessages = require('./src/workers/messageConsumer');

const app = express();
app.use(express.json());

dbconnection();
connectRabbitMQ().then(() => consumeMessages());

app.use('/api/chat', chatRoutes);

const server = http.createServer(app);
setupWebSocket(server);

const PORT = process.env.PORT || 5000;
server.listen(PORT, () => console.log(`Server running on port ${PORT}`));

