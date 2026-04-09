const mongoose = require('mongoose');

const SupplySchema = new mongoose.Schema({
    supplier: String,
    product: String,
    supply_price: Number,
    date: Date,
    quantity: Number
});

module.exports = mongoose.model('Supply', SupplySchema);