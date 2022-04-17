# Kanban-Api-Rest

API para simular um board do Kanban.

A classe KanbanControler contém 4 método, GET, POST, PUT e Delete. 

A classe KanbanCardModel é uma simulação dos campos que poderia ter no board do Kanban.

Aplicação contém uma classe para teste KanbanApplicationTests, onde é testado o método POST e o DELETE.



### Instrução de uso

A API, vem com um data.sql com alguns scripts de inserção em uma tabela em memória. O banco usado é o H2.

Testando com o Postman:

- GET: localhost:8080/Kanban-Api-Rest/card/1

- POST: localhost:8080/Kanban-Api-Rest/card/novoCard

  - JSON de exemplo:

    - {

        "codigo": 3,

        "tipoCard": "Tipo Teste3",

        "tituloCard": "Titulo Teste3",

        "projeto": "Projeto Teste3",

        "prevista": "2022-04-16",

        "descricao": "Descricao Teste3",

        "equipe": "Equipe Teste3",

        "status": "Status teste3"

      }

- DELETE: localhost:8080/Kanban-Api-Rest/card/deletarCard

  - JSON de exemplo:

    - {

        "codigo": 3,

        "tipoCard": "Tipo Teste3",

        "tituloCard": "Titulo Teste3",

        "projeto": "Projeto Teste3",

        "prevista": "2022-04-16",

        "descricao": "Descricao Teste3",

        "equipe": "Equipe Teste3",

        "status": "Status teste3"

      }

- PUT: localhost:8080/Kanban-Api-Rest/card/atualizarCard

  - JSON de exemplo:

    - {

        "codigo": 2,

        "tipoCard": "Tipo Teste2 Atualizado",

        "tituloCard": "Titulo Teste2 Atualizado",

        "projeto": "Projeto Test2 Atualizado",

        "prevista": "2022-04-15",

        "descricao": "Descricao Teste2 Atualizado",

        "equipe": "Equipe Teste2 Atualizado",

        "status": "Status teste2 Atualizado"

      }