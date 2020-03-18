const mongoose = require('mongoose');

const Users = new mongoose.Schema({
  name: {
    type: String,
    required: true
  },
  mail: {
    type: String,
    required: true
  }
}, {
  timestamps: true
});

// Export
mongoose.model('users', Users);



// EXAMPLE
// var mongoose = require('mongoose');
// var Schema = mongoose.Schema;

// var blogSchema = new Schema({
//   title: String, // String is shorthand for {type: String}
//   author: String,
//   body: String,
//   comments: [{ body: String, date: Date }],
//   date: { type: Date, default: Date.now },
//   hidden: Boolean,
//   meta: {
//     votes: Number,
//     favs: Number
//   }
// });