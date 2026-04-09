const mongoose = require('mongoose');

const ProductSchema = new mongoose.Schema({
    name: String,
    type: String,
    price: Number,
    stock: Number,
    specs: Object,
    tags: [String]
});

module.exports = mongoose.model('Product', ProductSchema);
