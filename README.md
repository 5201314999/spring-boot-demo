# spring-boot-demo
spring-boot 小demo ，成果是 可以完成接收请求响应并且对logback.spring.xml 做了配置，第一次安装了一个maven，使用配置jar 包。作为代码库存着，以后说不定有用到，不用重新搭
第一次搭的话可能还是会遇到困难的。

spring-boot 其实跟spring mvc 或者 struts  的文件目录有一定的类似性，配置文件确实更少了，日志如果只是想简单配置的话设置不需要自己配置一个logback.xml。
1.4 跟1.5 的还是有点不一样的 

这里用的是1.5.7 的spring-boot 的版本.

spring-boot 项目是不需要tomcat 的，自己就可以启动,一开始我还把他放到tomcat 里，晕 。


实际开发的话还需要连接数据库的jar 包。 操作数据库的 jpa 包等。

网上还是有很多参考资料的。

1 sping-boot 的基础信息
1 文件目录
2 配置信息
3 controller  的url 映射
4 包的扫描
5 常见注释
http://blog.csdn.net/u012702547/article/details/53740047


2 logback 的理解

TRACE < DEBUG < INFO < WARN < ERROR < FATAL

http://blog.csdn.net/yingxiake/article/details/51274426
