# demo-springboot-app

接口开发示例

## 包名

```
.
└── demo_springboot_app
    ├── DemoSpringBootAppApplication.java    // 启动类
    ├── common                               // 公共包
    │   ├── bean                             // 公共bean
    │   ├── config                           // 公共配置
    │   └── controller                       // 公共控制层
    ├── component                            // 组件
    │   ├── base                             // 基础组件
    │   └── business                         // 业务组件
    ├── error                                // 错误
    ├── log                                  // 日志
    ├── swagger                              // swagger
    ├── system                               // 系统包
    │   ├── business                         // 业务层
    │   ├── check                            // 校验层
    │   ├── db                               // 数据库层
    │   │   ├── elasticsearch                // es
    │   │   ├── mongo                        // mongodb
    │   │   ├── mysql                        // mysql
    │   │   ├── oracle                       // oracle
    │   │   └── redis                        // redis
    │   ├── vo                               // vo
    │   │   ├── param                        // 参数
    │   │   └── result                       // 返回
    │   └── service                          // 服务层
    └── util                                 // 工具类
```
