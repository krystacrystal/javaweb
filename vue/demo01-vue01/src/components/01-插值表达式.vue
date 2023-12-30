


<script setup>

let msg = "hello vue3"
let age = 19
let bee = "蜜 蜂"

let funMsg = () => {
  return "function hello vue3"
}

const carts = [{name: "可乐", price: 3, number: 10}, {name: "薯片", price: 8, number: 20}];

// 计算购物车总金额
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
    <h1>{{ msg }}</h1>
    getMsg返回的值为:{{ funMsg() }} <br>
    是否成年？{{ age > 18 ? "true" : "false" }}<br>
    反转：{{ bee.split(" ").reverse().join("--") }}<br>
    购物车总金额：{{ compute() }}
  </div>


</template>

<style scoped>

</style>
