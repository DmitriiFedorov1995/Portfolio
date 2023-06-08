#language:ru
@test

Функционал: Создание тикета с высоким приоритетом в системе HelpDesk

  Сценарий: Запрос в Helpdesk
  * сгенерировать переменные
    | title   | Тест 123 |
    | queue   | 1 |
    | priority | 1 |
    | status   | 1 |

  * создать запрос
    | method | path            | body            |
    | POST    | /api/tickets | CreateTicket.json |
  *  добавить header
    | Content-Type | application/json |
  * отправить запрос
  * статус код 201

  * извлечь данные
     | resp_title | $.title |
     | resp_priority | $.priority |
  * сравнить значения
     | ${title}   | == | ${resp_title}   |
     | ${priority} | == | ${resp_priority} |
