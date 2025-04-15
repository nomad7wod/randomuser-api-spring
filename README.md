# Reto Bootcamp SalesFroce

Este proyecto es parte del reto técnico de **NTT Data**, y consiste en desarrollar una API REST que consuma datos de [randomuser.me](https://randomuser.me/) y los exponga en un formato personalizado.  
La arquitectura está dividida en un back-end con Spring Boot y un front-end simple en HTML/JS.

---

## Tecnologías utilizadas

- [Spring Boot 3.4.4](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/) – Framework para desarrollo de aplicaciones Java
- [Spring Web](https://docs.spring.io/spring-framework/reference/web/webmvc.html) – Para construcción de APIs REST
- [Springdoc OpenAPI](https://springdoc.org/) – Para generar documentación Swagger automática
- Java 17
- HTML5 + CSS3 + JavaScript

---

## Cómo ejecutar el proyecto

### 1. Clonar el repositorio


git clone https://github.com/nomad7wod/randomuser-api-spring.git
cd randomuser_api

con el wrapper ya no se necesita instalar el mvn
solo ejecuta:
mvnw.cmd clean install

se corre con:
mvnw.cmd spring-boot:run


### 2. Compilar y ejecutar la aplicación en el IDE de tu preferencia 

Esto va a levantar el servidor en  
http://localhost:8080

### 3. Probar el endpoint principal

En cualquier navegador , en postman:

GET http://localhost:8080/api/personas

También se puede abrir el archivo frontend/index.html  en el navegador para ver el frontend.

---

## Documentacion(Swagger)

Puedes acceder a la documentación generada automáticamente desde:

[http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)

---

## Experiencia personal y uso del framework

Durante este reto, apliqué los conocimientos que adquirí integrando sistemas reales para una compañía Argentina, donde trabajamos con microservicios y orquestación entre Oracle ERP, JD Edwards y aplicaciones en Spring Boot. Esto me permitió estructurar adecuadamente el proyecto y aprovechar el framework de forma efectiva.

### Funcionalidades desarrolladas por mí:

- Definición del controlador con `@RestController` y `@GetMapping` para exponer `/api/persons`  
  [Controladores REST](https://docs.spring.io/spring-framework/reference/web/webmvc/mvc-controller.html)

- Consumo de API externa con `RestTemplate` desde un servicio anotado con `@Service`  
  [RestTemplate (Spring Framework)](https://docs.spring.io/spring-framework/reference/web/webmvc-client.html#webmvc-resttemplate)

- Configuración global de CORS usando `WebMvcConfigurer`  
  [CORS en Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc-cors.html#page-title)

- Documentación de la API con `springdoc-openapi` y anotaciones `@Operation` y `@Tag`  
  [Springdoc OpenAPI](https://springdoc.org/)

---

## Front-End

El front-end está separado en la carpeta [`frontend/`](./frontend/index.html), y puede abrirse directamente desde un navegador o usando Live Server.  
Este archivo HTML realiza una petición `fetch()` al back-end para mostrar las personas en pantalla.

---

## Conclusión

El proyecto cumple con todos los requisitos del reto técnico bajo el enfoque back-end.

Estoy abierto a recibir feedback para seguir creciendo como desarrollador.
