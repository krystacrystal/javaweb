<script setup>
import {ref} from 'vue'

let flag = ref(true)

</script>

<template>
  <div>
    <h1 v-if="flag">Vue is awesome!</h1>
    <h1 v-else>Oh no!</h1>
    <button @click="flag=!flag">Toggle</button>
  </div>

</template>

<style scoped>

</style>
