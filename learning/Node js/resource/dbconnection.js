const mongoose = require('mongoose');
// mongoose.set('debug', true);
// mongoose.connect('mongodb://127.0.0.1:27017/crud_node', { useUnifiedTopology: true })
//   .then(() => console.log('MongoDB connected'))
//   .catch((err) => console.log(err));
//   const mongoose = require('mongoose');

mongoose.connect('mongodb://127.0.0.1:27017/crud_node', {
  useNewUrlParser: true,
  useUnifiedTopology: true,
  serverSelectionTimeoutMS: 5000, // Increase timeout
})
  .then(() => console.log('MongoDB connected'))
  .catch((err) => console.error('MongoDB connection error:', err));
  
  // Test inserting a document