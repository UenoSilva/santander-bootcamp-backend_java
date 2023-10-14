## Desafio

### Tecnológias

- Spring Data JPA
- Spring Web
- H2 databese
- Postgresql

### Descrição

Api Rest para catalogo de animes, com informaões do titulo, descrição, genero, data de lançamento e encerramento, número de episodios, studio e imagens.

### Diagrama de Classes

```mermaid
classDiagram
  class Anime {
    - titulo: String
    - genero: Genero[]
    - descricao: String
    - dataLancamento: String
    - dataEncerramento: String
    - episodios: int
    - imagens: String[]
    - studio: Studio
  }

  class Genero {
    - genero: String
  }

  class Studio {
    - name: String
  }

  Anime "1" -- "1" Studio : produzido por
  Anime "1" -- "*" Genero : pertence a
```