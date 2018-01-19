# Demo模块

spring各种技术demo集成测试

## 测试

### 负载均衡

1. 打包后启动多个服务
```cmd
java -jar open-demo.jar
java -jar open-demo.jar --server.port=2200
```

2. 访问测试
http://localhost:8761/ 看到是多个服务

http://localhost:8610/hello 刷新后看到不同的服务端口

