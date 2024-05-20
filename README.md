# SpringBoot API REST with Java 17 and PostgreSQL on Docker Project

## Request

- GET

`localhost:8080/api/users`

- POST

`localhost:8080/api/users`

Body > RAW > JSON

{
    "name":"Jorge",
    "lastname":"Silva",
    "email":"jorge@mail.com",
    "username":"jorgesilva",
    "password":"123456"
}

- PUT

`localhost:8080/api/users/{id}`

{
    "name":"Jorge",
    "lastname":"Salvia",
    "email":"jorges@mail.com",
    "username":"jorgesalvia",
    "password":"654321"
}

- DELETE

`localhost:8080/api/users/{id}`