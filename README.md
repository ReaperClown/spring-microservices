# Spring Cloud - Product Catalog Microservice

Spring Boot Microservice created during Bootcamp Santander Full-Stack Developer.

## Prepare your enviroment
- Docker 20.10.7
- Docker compose 1.29.2
- Java OpenJDK 16
- Gradle
- Spring Boot 2.5.3


## Running

Run the application on your prefered IDE and keep an eye out on that information:

```bash
 .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / / 
 =========|_|==============|___/=/_/_/_/  
 :: Spring Boot ::                (v2.5.3)

2021-08-18 22:13:53.071  INFO 131448 --- [           main] c.s.c.p.c.ProductCatalogApplication      : Starting ProductCatalogApplication using Java 16.0.1 on DESKTOP-HOF2JLD with PID 131448 (C:\Users\ReaperClown\Documents\Desenvolvimento\_repos\spring-microservices\product-catalog\bin\main started by ReaperClown in C:\Users\ReaperClown\Documents\Desenvolvimento\_repos\spring-microservices)
2021-08-18 22:13:53.127  INFO 131448 --- [           main] c.s.c.p.c.ProductCatalogApplication      : No active profile set, falling back to default profiles: default
2021-08-18 22:13:56.654  INFO 131448 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data Elasticsearch repositories in DEFAULT mode.
2021-08-18 22:13:56.848  INFO 131448 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 180 ms. Found 1 Elasticsearch repository interfaces.
2021-08-18 22:13:58.064  INFO 131448 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data Reactive Elasticsearch repositories in DEFAULT mode.
2021-08-18 22:13:58.083  INFO 131448 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 15 ms. Found 0 Reactive Elasticsearch repository interfaces.
2021-08-18 22:13:59.840  INFO 131448 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2021-08-18 22:13:59.908  INFO 131448 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2021-08-18 22:13:59.912  INFO 131448 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.50]
2021-08-18 22:14:00.932  INFO 131448 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2021-08-18 22:14:00.936  INFO 131448 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 7364 ms
2021-08-18 22:14:03.858  INFO 131448 --- [           main] o.s.d.elasticsearch.support.VersionInfo  : Version Spring Data Elasticsearch: 4.2.3
2021-08-18 22:14:03.862  INFO 131448 --- [           main] o.s.d.elasticsearch.support.VersionInfo  : Version Elasticsearch Client in build: 7.12.1
2021-08-18 22:14:03.863  INFO 131448 --- [           main] o.s.d.elasticsearch.support.VersionInfo  : Version Elasticsearch Client used: 7.12.1
2021-08-18 22:14:07.021  INFO 131448 --- [           main] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 1 endpoint(s) beneath base path '/actuator'
2021-08-18 22:14:07.494  INFO 131448 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2021-08-18 22:14:07.717  INFO 131448 --- [           main] c.s.c.p.c.ProductCatalogApplication      : Started ProductCatalogApplication in 17.977 seconds (JVM running for 21.282)
```


### This is what we're looking for
```bash
Exposing 1 endpoint(s) beneath base path '/actuator'
Tomcat started on port(s): 8080 (http) with context path ''
```

### With that we can see our endpoints, with the following url
```unix
~$  curl http://localhost:8080/actuator | json_pp
```

## This is the spected return
```json
% Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
                               Dload  Upload   Total   Spent    Left  Speed
100   243    0   243    0     0  13453      0 --:--:-- --:--:-- --:--:-- 14294
{
   "_links" : {
      "self" : {
         "templated" : false,
         "href" : "http://localhost:8080/actuator"
      },
      "health" : {
         "href" : "http://localhost:8080/actuator/health",
         "templated" : false
      },
      "health-path" : {
         "href" : "http://localhost:8080/actuator/health/{*path}",
         "templated" : true
      }
   }
}
```

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License
[MIT](https://choosealicense.com/licenses/mit/)