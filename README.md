# Aplikasi Microservices User dan Department

Cara menjalankan :

1. konfigurasi global application.yml diambil dari git repo https://github.com/fakhrichaerul/user-department-microservices-cloud-config
   menggunakan dependency spring cloud config di `config-service`

2. Jalankan `config-service` dan `discovery-server` terlebih dahulu

3. Kemudian Jalankan `gateway-service`, `user-service` dan `department-service`

4. Start aplikasi

    ```
    mvn clean spring-boot:run
    ```
    
5. Akses ke aplikasi discovery-server di endpoint `http://localhost:8761`

6. Akses ke aplikasi user-service di endpoint `http://localhost:9999/users/`

    ```
    curl http://localhost:9999/users/
    ```
   
    Contoh request post json di user-service
    
    ```json
    {
    "firstName": "Fakhri",
    "lastName": "Chaerul",
    "email": "fakhrichaerul@gmail.com",
    "departmentId": 1
    }
    ```
    
7.  Akses ke aplikasi department-service di endpoint `http://localhost:9999/departments/`

    ```
    curl http://localhost:9999/departments/
    ```
   
    Contoh request post json di department-service
    
    ```json
    {
    "departmentName": "IT",
    "departmentAddress": "Bandung",
    "departmentCode": "IT-001"
    }
    ```
