<script setup>

import {reactive} from "vue";

let carts = reactive([
  {
    name: "薯片",
    price: 10,
    number: 5
  },
  {
    name: "炸鸡",
    price: 20,
    number: 10,
  },
  {
    name: "可乐",
    price: 3,
    number: 2
  }
])


//删除购物项方法
function removeCart(index) {
  carts.splice(index, 1);
}

//计算购物车总金额
function compute() {
  let count = 0;
  for (let index in carts) {
    count += carts[index].price * carts[index].number;
  }
  return count;
}

</script>

<template>
  <div>
    <table border="1px">
      <thead>
      <td>序号</td>
      <td>名称</td>
      <td>价格</td>
      <td>数量</td>
      <td>小计</td>
      <td>操作</td>
      </thead>
      <tbody v-if="carts.length>0">
      <tr v-for="(cart,index) in carts">
        <td>{{ index + 1 }}</td>
        <td>{{ cart.name }}</td>
        <td>{{ cart.price }}</td>
        <td>{{ cart.number }}</td>
        <td>{{ cart.price * cart.number }}</td>
        <td>
          <button @click="removeCart(index)">删除</button>
        </td>
      </tr>
      </tbody>
      <tbody v-else>
      <td colspan="6">购物车没有物品！</td>
      </tbody>
    </table>
    购物车总金额：{{ compute() }}元
  </div>

</template>

<style scoped>

</style>
