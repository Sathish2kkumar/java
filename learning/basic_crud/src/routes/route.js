const express = require('express');
const { saveusers,getUsers } = require('../controllers/usercontroller');
const router = express.Router();

router.post('/api/users',saveusers);
router.get('/api/users',getUsers);  

module.exports = router;