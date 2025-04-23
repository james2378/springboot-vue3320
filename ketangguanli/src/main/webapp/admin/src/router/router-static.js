import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'

     import users from '@/views/modules/users/list'
    import dictionary from '@/views/modules/dictionary/list'
    import jiaoshi from '@/views/modules/jiaoshi/list'
    import kaoqin from '@/views/modules/kaoqin/list'
    import kaoqinxiangqing from '@/views/modules/kaoqinxiangqing/list'
    import kecheng from '@/views/modules/kecheng/list'
    import news from '@/views/modules/news/list'
    import yonghu from '@/views/modules/yonghu/list'
    import zuoyehuida from '@/views/modules/zuoyehuida/list'
    import zuoyejilu from '@/views/modules/zuoyejilu/list'
    import dictionaryBanji from '@/views/modules/dictionaryBanji/list'
    import dictionaryKecheng from '@/views/modules/dictionaryKecheng/list'
    import dictionaryNews from '@/views/modules/dictionaryNews/list'
    import dictionarySex from '@/views/modules/dictionarySex/list'
    import dictionaryZuoyehuida from '@/views/modules/dictionaryZuoyehuida/list'
    import dictionaryZuoyejilu from '@/views/modules/dictionaryZuoyejilu/list'
    import kaoqinxiangqingAdd from '@/views/modules/kaoqinxiangqing/add-or-update'





//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    } ,{
        path: '/users',
        name: '管理信息',
        component: users
      }
    ,{
        path: '/dictionaryBanji',
        name: '班级',
        component: dictionaryBanji
    }
    ,{
        path: '/dictionaryKecheng',
        name: '课程类型',
        component: dictionaryKecheng
    }
    ,{
        path: '/dictionaryNews',
        name: '公告类型',
        component: dictionaryNews
    }
    ,{
        path: '/dictionarySex',
        name: '性别',
        component: dictionarySex
    }
    ,{
        path: '/dictionaryZuoyehuida',
        name: '状态',
        component: dictionaryZuoyehuida
    }
    ,{
        path: '/dictionaryZuoyejilu',
        name: '作业类型',
        component: dictionaryZuoyejilu
    }


    ,{
        path: '/dictionary',
        name: '字典表',
        component: dictionary
      }
    ,{
        path: '/jiaoshi',
        name: '教师',
        component: jiaoshi
      }
    ,{
        path: '/kaoqin',
        name: '考勤通知',
        component: kaoqin
      }
    ,{
        path: '/kaoqinxiangqing',
        name: '考勤详情',
        component: kaoqinxiangqing
      }
    ,{
        path: '/kecheng',
        name: '课程信息',
        component: kecheng
      }
    ,{
        path: '/news',
        name: '公告信息',
        component: news
      }
    ,{
        path: '/yonghu',
        name: '学生',
        component: yonghu
      }
    ,{
        path: '/zuoyehuida',
        name: '作业回答',
        component: zuoyehuida
      }
    ,{
        path: '/zuoyejilu',
        name: '作业发布',
        component: zuoyejilu
      }


    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
