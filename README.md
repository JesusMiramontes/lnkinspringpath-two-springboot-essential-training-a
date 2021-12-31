# 2) Linkedin Spring Learning Path: Spring Boot 2.0 Essential Training - A
## Summary
Code part of course: https://www.linkedin.com/learning/spring-boot-2-0-essential-training-2   
Controllers and restcontrollers for a demo hotel app. Statically creates rooms and guests and displays them in table.

## Topics
1) Spring Profiles
2) yaml application properties

## Tools
1) Docker
2) Thymeleaf
3) H2 DB
4) UUID.randomUUID().toString();

### Notes
* Set environment variables as spring.profiles.active for the profile. Ej. spring.profiles.active=dev
* **Build docker:** docker build -t booting-web .
* **Run Docker:** docker run -p 8080:8080 -d booting-web