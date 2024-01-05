<script setup>

import {reactive} from "vue";

let user = reactive({
  name: "zhangsan",
  age: 18
})

let hbs = reactive([])

</script>

<template>
  <div>
    <input type="text" v-model="user.name"/><br>
    姓名：{{ user.name }}<br>
    爱好：<br>
    唱：<input type="checkbox" name="hbs" v-model="hbs" value="sing">
    跳：<input type="checkbox" name="hbs" v-model="hbs" value="dance">
    rap：<input type="checkbox" name="hbs" v-model="hbs" value="rap">
    <br>
    显示爱好： {{ hbs }}
  </div>

</template>

<style scoped>

</style>
