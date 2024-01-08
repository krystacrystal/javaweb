// 导入路由创建的相关方法
import {createRouter, createWebHashHistory} from 'vue-router'

//导入相关组件
import Home from '../components/Home.vue'
import Add from '../components/Add.vue'
import list from '../components/List.vue'
import Update from '../components/Update.vue'

//创建路由对象
const router = createRouter({
    history: createWebHashHistory(),
    routes: [
        {
            path: '/',
            component: Home
        },
        {
            path: '/home',
            component: Home
        },
        {
            path: '/list',
            component: list
        },
        {
            path: '/add',
            component: Add
        },
        {
            path: '/update',
            component: Update
        }
    ]

})

export default router;