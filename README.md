###Spring Security - Authentication + JWT Authorization

- ####Generate JSON Web Token (JWT)
Create POST request (localhost:8080/authenticate) and provide username and password in request body as given below.
 ![](C:\Users\kerchi\Downloads\spring-boot-jwt-request.jfif)


- ####JWT Request Response
Validate JSON Web Token (JWT) by sending a request to  localhost:8080/greeting with above generated JWT Token in header request.
![](C:\Users\kerchi\Downloads\spring-boot-jwt-validate-response.jfif)