const mongoose = require('mongoose');

// 引入模型
const Supplier = require('./models/Supplier');
const Product = require('./models/Product');
const Supply = require('./models/Supply');
const Sale = require('./models/Sale');

// 连接 MongoDB
mongoose.connect('mongodb://admin:MongoDB02@192.168.50.94:27017/YANGXIAOPINGDB')
.then(() => console.log('MongoDB 连接成功 ✔'))
.catch(err => console.log('连接失败', err));

// 1. 查询所有供应商
async function getSuppliers() {
    const data = await Supplier.find();
    console.log('\n=== Suppliers ==');
    console.log(data);
}

// 2. 查询所有商品
async function getProducts() {
    const data = await Product.find();
    console.log('\n=== Products ==');
    console.log(data);
}

// 3. 查询所有供货记录
async function getSupplies() {
    const data = await Supply.find();
    console.log('\n=== Supplies ==');
    console.log(data);
}

// 4. 查询所有销售记录
async function getSales() {
    const data = await Sale.find();
    console.log('\n=== Sales ==');
    console.log(data);
}

// 执行查询
async function main() {
    await getSuppliers();
    await getProducts();
    await getSupplies();
    await getSales();
}

main();