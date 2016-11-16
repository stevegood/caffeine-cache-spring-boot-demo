# Caffeine Cache + Spring Boot Demo

This is a sample application that implements a very basic cache through Spring Boot and Caffeine. This repo is a companion to [my blog post of the subject](http://www.stevegood.rocks/post/2016/11/15/implementing-caffeine-cache-with-spring-boot/).

## Usage
1. Run ```./gradlew bootRun```
2. Open a browser window and navigate to [localhost:8080](http://localhost:8080)
3. The **Now** time will update with each refresh while the **Cached** time will stay the same for 30 seconds.
    - Every 30 seconds the cache will be evicted and the time will be updated 

## Reference

- [Spring Boot Caching Docs](http://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-caching.html)
- [Spring Boot Caching + Caffeine Docs](http://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-caching.html#boot-features-caching-provider-caffeine)
