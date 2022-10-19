Tematy:
    * różne implementacje DAO:
        * DAOHibernateImpl
        * DAOJpaImpl
        * JpaRepository
    * JpaRepository (rozszerzane za pomocą EmployeeRepository, podajemy klasę encji i klasę id)
        * w EmployeeRepository info co tam jeszcze ciekawego można ogarnąć
    * Spring Data REST:
        * mając entity (Employee) i JpaRepository (EmployeeRepository) od razy dostajemy ukryty kontroler z endpointami:
            (encja + s -> Employee -> employees)
            POST - /employees                   --> create new
            GET - /employees                    --> get all
            GET - /employees/{employeeId}       --> get by id
            PUT - /employees/{employeeId}       --> update by id
            DELETE - /employees/{employeeId}    --> delete by id
        * wcześniej używałem EmployeeRestControllerStandard, potem wszystko zakomentowane, i tak działa
        * zwracany json zawiera też url
        * w application.properties są propertiesy dla spring data
    * Wyjątki
        * w EmployeeRestControllerStandard rzucam CustomerNotFoundException
        * CustomerExceptionHandler łapie wyjątek
            * @ExceptionHandler wskazuje, że metoda łapie wyjątki typu jaki przyjmuje argument
            * @ControllerAdvice uwidacznia metody z @ExceptionHandler z tej klasy dla w całej aplikacji
                i pozwala przechwytywać wyjątki z metod oznaczonych @RequestMapping
    * Pagination
        * w Spring Data REST domyślnie strona ma 20 pozycji
        * paginacja jest przekazywana w url (np, /employees?page=0), zaczynając od 0
        * w propertiesach można ustawić m.in.:
            * defaultową liczbę pozycji (spring.data.rest.default-page-size)
            * maksymalną liczbę pozycji (spring.data.rest.max-page-size)
    * Sorting
        * w Spring Data REST można sortować dodając w endpoincie "?sort=[pole z encji]...,[sposób sortowania]"
            * np. /employees?sort=firstName,lastName,desc


