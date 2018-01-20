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


### Feign

1.配置：
添加依赖

```xml
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
 </dependency>
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-openfeign</artifactId>
</dependency>
```

2.新增注解支持 `@EnableFeignClients`

3.声明服务端
```java
@FeignClient("DEMO")
public interface OrderService {

    //获取所有订单
    @GetMapping(value = "/fetch")
    List<Order> findAll();


    //获取id
    @GetMapping(value = "/{id}")
    Order loadByItemCode(@PathVariable("id") String id);
}
```

4.依赖使用
```java
@Autowired
private OrderService orderService;
```
---

查询所有：
http://localhost:8610/orders/fetch

根据id查询：
http://localhost:8610/orders/abc

