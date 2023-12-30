<script setup>

const data = {
  name: '尚硅谷',
  url: "http://www.atguigu.com",
  logo: "http://www.atguigu.com/images/index_new/logo.png"
}

</script>

<template>
  <div>

    <a :href="data.url">
      <img v-bind:src="data.logo" :title="data.name"><br>
    </a>

  </div>

</template>

<style scoped>

</style>
