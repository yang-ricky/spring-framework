### 如何编译?
 * 预先编译
   *  切换到JDK11 ```sdk use java 11.0.11.j9-adpt```
   * ./gradlew :spring-oxm:compileTestJava
   * ./gradlew :spring-core:compileTestJava
 * 如何build整个项目？
   * ./gradlew build

### 踩过的坑?
   * [Test events were not received](https://blog.csdn.net/21aspnet/article/details/108867567)