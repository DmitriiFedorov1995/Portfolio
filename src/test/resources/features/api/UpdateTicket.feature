#language:ru
@test

Функционал: PUT запрос для обновления тикета из статуса закрыт в открыт/
  - Создание тикета
  - Авторизация в системе: запрос токена
  - Поиск ранее созданного тикета по ID
  - Отправка PUT запроса для на обновление статуса


  Сценарий: Запрос в Helpdesk
    #создать тикет
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
    | resp_id | $.id |

    #получить токен
  * создать запрос
    | method | path       | body              |
    | POST   | /api/login | Autorization.json |
  *  добавить header
    | Content-Type | application/json |
  * отправить запрос
  * статус код 200

  * извлечь данные
    | resp_token | $.token |

    # найти тикет по id
  * создать запрос
    | method | path                    |
    | GET    | /api/tickets/${resp_id} |

  *  добавить header
    | Authorization | Token ${resp_token} |

  * отправить запрос
  * статус код 200

  * извлечь данные
    | resp_title    | $.title      |
    | resp_priority | $.priority   |
    | resp_status   | $.status     |

  * сравнить значения
    | ${title}    | == | ${resp_title}    |
    | ${priority} | == | ${resp_priority} |
    | ${resp_status} | == | 1 |

    # обновить значения закрыть тикет
    * сгенерировать переменные
      | title   | ${resp_title} |
      | queue   | ${resp_priority} |
      | priority | 4 |

    * создать запрос
      | method | path                     | body            |
      | PUT    | /api/tickets/${resp_id} | CreateTicket.json |
    *  добавить header
      | Content-Type | application/json |
    *  добавить header
      | Authorization | Token ${resp_token} |
    * отправить запрос
    * статус код 422





