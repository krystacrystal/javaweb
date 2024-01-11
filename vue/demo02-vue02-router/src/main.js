import {createApp} from 'vue'

import App from './App.vue'
import router from "./routers/router.js";
let app = createApp(App)
//绑定路由对象
app.use(router)
app.mount('#app')
