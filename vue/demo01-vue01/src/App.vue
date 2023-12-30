<script setup>
import {ref} from 'vue'

let count = ref(0)
let incrCount = () => {
  count.value++
}


</script>

<template>
  <div>
    <h1>count的值是:{{ count }}</h1>
    <button @click="incrCount">incrCount</button>
    <br>
    <button @click="count++">incrCount1</button>
  </div>

</template>

<style scoped>

</style>
