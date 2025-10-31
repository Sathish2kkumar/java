const express = require('express');
const { sendMessage } = require('../controllers/chatController');
const { saveusers } = require('../controllers/userController');

const router = express.Router();

router.post('/send-message', sendMessage);
router.post('/saveusers',saveusers)

module.exports = router;