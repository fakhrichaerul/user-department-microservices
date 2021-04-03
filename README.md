# Aplikasi Microservices User dan Department

Cara menjalankan :

1. konfigurasi global secara otomatis diambil dari git repo https://github.com/fakhrichaerul/user-department-microservices-cloud-config
   menggunakan dependency spring cloud config pada `config-service`

2. Jalankan `config-service` dan `discovery-server` terlebih dahulu

2. Kemudian Jalankan `gateway-service`, `user-service` dan `department-service`

5. Start aplikasi

    ```
    mvn clean spring-boot:run
    ```

7. Akses ke aplikasi user-service di endpoint `http://localhost:10001/users/`

    ```
    curl http://localhost:10001/users/
    ```
   
    Contoh request post json di user-service
    
    ```json
    {
      "userId" : "1",
      "firstName" : "Fakhri",
      "lastName" : "Chaerul",
      "email" : "fakhrichaerul@gmail.com",
      "departmentId" : "IT-001"
    }
    ```
    
    Akses ke aplikasi department-service di endpoint `http://localhost:10002/departments/`

    ```
    curl http://localhost:10002/departments/
    ```
   
    Contoh request post json di department-service
    
    ```json
    {
      "departmentId" : "IT-001",
      "departmentName" : "IT",
      "departmentAddress" : "Bandung",
      "departmentCode" : "IT"
    }
    ```
