const mongoose = require('mongoose');

const SaleSchema = new mongoose.Schema({
    product: String,
    quantity: Number,
    date: Date,
    supplier: String
});

module.exports = mongoose.model('Sale', SaleSchema);