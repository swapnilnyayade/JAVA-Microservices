# Microservices

Youtube:
1) https://www.youtube.com/watch?v=BnknNTN8icw&t=4288s

Run:
1) EServer - Run as java application
2) ConfigServer - Run as java application
3) APIGateway - Run as java application
4) DepartmentService - Run as java application
5) UserService - Run as java application
6) HystrixDashboard - Run as Java application

Warning:
1) User.class the name 'user' is reserved in DB, so use table @Table(name="users")
2) Add :
   spring.config.import = configserver:http://localhost:9005
  
   in application.properties file don't need to create bootstrap.properties (as well as yml) file
3) After installing zipkin server, while adding dependencies in services, add version of zipkin and sleuth as 2.2.8.RELEASE 
   and
   spring.main.allow-circular-references = true
   in application.properties
   
4) Hystrix dashboard always show loading
