const mongoose = require('mongoose');

const SupplierSchema = new mongoose.Schema({
    name: String,
    phone: String,
    city: String
});

module.exports = mongoose.model('Supplier', SupplierSchema);