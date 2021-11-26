# Engage-21

Microsoft Engage 2021

## Description - Scheduler

This feature that allows students to submit weekly preferences for attending class in-person or remotely. The tool then assigns available seats to students who want to physically attend class and provides the faculty with a roster of who has been cleared to attend.

## Short description & Tool used for implementation

1. Font-end: React.js - Redux & Material-UI
2. Back-end: Java - Spring Boot & PostgreSQL

Micro-service architecture: (for backend)

- Config-server: for storing configuration
- Discovery-server (Eureka-server): for discovery of micro-services
- API gateway: for routing requests to micro-services
- Circuit breaker & Fallback: for handling errors
- Hystrix-dashboard: for monitoring
- JWT Authentication: for authentication (NOT working: Dependency issue with spring-cloud-security & spring-cloud-starter-gateway)


## Installations

1. Install & Connect Database - PostgreSQL

```
For Ubuntu:

$ sudo apt-get update
$ sudo apt install postgresql postgresql-contrib
$ sudo -u postgres psql postgres

    postgres=# CREATE ROLE "Shiru99" WITH PASSWORD '1234';
    postgres=# ALTER ROLE  "Shiru99" WITH LOGIN;
    postgres=# CREATE DATABASE collegeconnect

$ psql -U Shiru99 -h localhost -p 5432 collegeconnect 
```

2. Install Java (14)


## Sequence of microservices to run the application

### connect database

### Backend:

1. config-server
2. discovery-server
3. api-gateway
4. feature microservices/my-authentication-service
5. feature microservices/student-scheduler
6. feature microservices/teacher-scheduler
7. feature microservices/class-scheduler

### Frontend :

1. run react application

