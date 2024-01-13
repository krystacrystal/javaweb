<script setup>
//接收传递过来的路径参数
import {useRoute} from 'vue-router'
import {ref,onUpdated} from 'vue'

let route = useRoute()
let languageId = ref("")
let languageName = ref("")

languageId.value = route.query.id
languageName.value = route.query.language

onUpdated(()=>{
  languageId.value = route.query.id
  languageName.value = route.query.language
})

</script>

<template>
  <div>
    <h1>ShowDetail2接收键值对参数</h1>
    <h3>{{languageId}}{{languageName}}是世界上最好的语言</h3>
  </div>
</template>

<style scoped>

</style>

