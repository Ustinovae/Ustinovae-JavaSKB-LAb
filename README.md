# Ustinovae-JavaSKB-LAb
# Дз № 3
Код по этой задаче находится в TransportService проекте. В пакете DomainCore 
находятся основыне бины, а в Services/TransportService находится основной сервис,
который управляет созданием бинов и работой их методов.

# Дз № 4
Код по этой задаче находится в TransportService проекте. В пакете Configuration
находятся конфигурации, а в Resource сами вайлы профайлов. 

# Дз № 5
Код по этой задаче находится в TransportService проекте. В пакете 
Infrastructure нвходятся основыне пакеты EventHandling(обработчик событий, события и 
паблишеры), Exception(кастомные ошибки).


# Дз № 6
Весь код по этой задаче лежит в ShopService проекте

# Дз № 8
Весь код по этой задаче лежит в NotepadCasesService проекте

Валидация довольно прстенькая, просто проверяется, что name не пустая, а 
колличество дел не больше 10

В качестве БД взял NoSql MongoDB, так проще всего было бы со структурой, потому 
что это документоно ориентированная БД и вся структура - это просто одна коллекция

# Дз № 9

Весь код по этой задаче лежит в ShopService проекте

Сама реализация Аспекта довольно простенькая. После определенного кол-ва запросов 
блокируется метод API. Ограничение задается в application.properties

# Дз № 10

Весь код по этой задаче лежит в ShopService проекте

В пакете Infrastructure находятся котнроллеры с эндпоинтами и SecurityConfiguration,
в котором обозначены основные роли, пароли и логины. Так же в SecurityConfiguration 
используется все требования по шифрованию, аунтефикации и т.д.

# Дз № 11

Весь код по домашке находиться в проекте ShopService. 
Реализовал получения таких метрик, как кол-ва запросов и всремя выполнения запроса.
Также сделал свой актуатор TimeNowActuator. В целом, сделал все, кроме задания 
по создания совей метрики
