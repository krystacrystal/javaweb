<script setup>
import {ref, reactive} from 'vue'

let count = ref(0)

function incr() {
  //count.value++;
  data.counter++;
}

function decr() {
  // count.value--;
  data.counter--;
}

let data = reactive({
  counter: 0
})

</script>

<template>
  <div>
    <button @click="incr()">+</button>
    {{ data.counter }}
    <button @click="decr()">-</button>
    <br>
    <button @click="data.counter++">++</button>
    <button @click="data.counter--">--</button>
    <br>


  </div>

</template>

<style scoped>

</style>
