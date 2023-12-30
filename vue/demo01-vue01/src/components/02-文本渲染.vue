<script setup>

let msg = "hello vue3"
let getMsg = () => {
  return msg
}
let age = 19
let bee = "蜜 蜂"


</script>

<template>
  <div>
    <span v-text="msg"></span><br>
    <!--放函数-->
    <span v-text="getMsg()"></span><br>
    <!--运算表达式-->
    <span v-text="age>18?'true':'false'"></span><br>
    <!-- 对象函数-->
    <span v-text="bee.split(' ').reverse().join('>>')"></span><br>
    <span></span><br>
    <span></span><br>
    <span></span><br>

  </div>

</template>

<style scoped>

</style>

