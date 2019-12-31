# StuSYS
Spring Cloud Demo of Students Manage System
Spring Cloud Netflix oos解决方案
1.请根据名字食用
  dependencies：所有项目的共同依赖，以及版本管理
  service-consumer：服务消费者，分为feign方法和ribbon方法（二者均实现熔断器，Hystrix）
  eureka：eureka注册服务中心，搭建多个请自行修改配置
  zuul：路由
  zipkin：服务链路追踪
  config-server：远程配置中心
  config-client：配置客户端
  
