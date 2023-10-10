# Projeto Padrões de Projeto

Criação de uma APi com Spring Boot usando os padrões de projeto: Singleton, Strategy e Facade.

## Descrição

Uma Api Rest que criar um cliente (id, nome e endereco) com um endereço (cep, logradouro, complemento, bairro, localidade, uf, ibge, gia, ddd e siafi). Na hora da criação do cliente apenas o nome e cep são fornecidos, onde os demais campos são preechidos através da APi ViaCEP.

## Exemplo

Json enviada através do verbo http Post

```
{
    "nome": "José Filho",
    endereco:{
        "cep": "45829-016"
    }
}
```

Dado que é salvo em memória

```
"id": 1,
    "nome": "José Filho",
    "endereco": {
        "cep": "45829-016",
        "logradouro": "Rua Amazonas",
        "complemento": "",
        "bairro": "Matinha",
        "localidade": "Eunápolis",
        "uf": "BA",
        "ibge": "2910727",
        "gia": "",
        "ddd": "73",
        "siafi": "3117"
    }
}
```
