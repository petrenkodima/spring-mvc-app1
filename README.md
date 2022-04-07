# ru.petrenko.spring

CRUD, REST, Паттерн DAO (Data Access Object)
HTTP - запросы (request) и HTTP - ответы (response) на localhost.
1) С помощью  HttpSeervletRequest
2) С помощью аннотации @RequestMapping

Вся логика работы с БД для модели Person инкапсулируется в класс PersonDAO.
Или можно реализовать через паттерн Repository. Его я и использовал для Hibernate и Spring Data JPA.
Паттерн предоставляет большую абстракцию над БД, чем DAO.

Связь Java приложения с БД: JDBC API, JdbcTemplate, Hibernate