# something about springboot configuration info

### 1: server.port=0 表示随机系统可用端口 【开发同学可以在本地测试的时候进行使用】              
具体有关server的设置请参考ServerProperties类

### 2: management.security.enabled=false 
Spring Boot 从1.5开始管理端的EndPoint默认设置为true  
具体有关management的设置请参考ManagementServerProperties类