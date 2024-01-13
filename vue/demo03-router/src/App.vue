<script setup>
import {useRouter} from 'vue-router'
import {ref} from "vue"

const router = useRouter()

let page = ref("")

function showList() {
  // router.push("/list")
  router.push({path: "/list"})
}

function goMypage() {
  router.push(page.value)
}

</script>

<template>
  <div>
    <!--    声明式路由，点击链接切面页面-->
    <router-link to="/home">home页面</router-link>
    <br>
    <router-link to="/list">list页面</router-link>
    <br>
    <router-link to="/add">add页面</router-link>
    <br>
    <router-link to="/update">update页面</router-link>
    <br>

    <!--    编程式路由,点击按钮做页面的切换，将按钮绑定事件，在函数里写相应的js代码-->
    <button @click="showList()">到list页面</button>
    <br>
    <button @click="goMypage()">Go</button>
    <!--    去往哪个页面有输入框输入-->
    <input type="text" v-model="page">
    <hr/>

    <router-view></router-view>
  </div>
</template>

<style scoped>

</style>
