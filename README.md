# Descrição

Neste projeto tem API Rest de consulta de cidades do Brasil com seus dados. Navegando pelas boas práticas de Java e do Spring, popular o bando de dados e criar um serviço para o buscar as cidade, estados, países pelo nome.

## Tecnologias

- Java 11
- Spring
- PostgreSQL
- Git
- JPA / Hibernate
- Maven

## EndPoints

- Busca país por id
```
http://localhost:8080/countries/2
``` 
- Exemplo Json

```
{
    "id": 2,
    "name": "Afghanistan",
    "portugueseName": "Afeganistão",
    "code": "AF",
    "bacen": 132
}
```

- Busca todos os países paginados
```
http://localhost:8080/countries?page=0&size=2
``` 
- Exemplo Json

```
{
    "content": [
        {
            "id": 1,
            "name": "Brazil",
            "portugueseName": "Brasil",
            "code": "BR",
            "bacen": 1058
        },
        {
            "id": 2,
            "name": "Afghanistan",
            "portugueseName": "Afeganistão",
            "code": "AF",
            "bacen": 132
        }
    ],
    "pageable": {
        "sort": {
            "empty": true,
            "sorted": false,
            "unsorted": true
        },
        "offset": 0,
        "pageSize": 2,
        "pageNumber": 0,
        "unpaged": false,
        "paged": true
    },
    "last": false,
    "totalElements": 255,
    "totalPages": 128,
    "number": 0,
    "size": 2,
    "sort": {
        "empty": true,
        "sorted": false,
        "unsorted": true
    },
    "first": true,
    "numberOfElements": 2,
    "empty": false
}
```
- Busca país por nome
```
http://localhost:8080/countries?name=br
``` 
- Exemplo Json

```
{
    "content": [
        {
            "id": 1,
            "name": "Brazil",
            "portugueseName": "Brasil",
            "code": "BR",
            "bacen": 1058
        },
        {
            "id": 31,
            "name": "British Indian Ocean Territory",
            "portugueseName": "Território Britânico do Oceano Indico",
            "code": "IO",
            "bacen": 7820
        },
        {
            "id": 32,
            "name": "Brunei Darussalam",
            "portugueseName": "Brunei",
            "code": "BN",
            "bacen": 1082
        },
        {
            "id": 84,
            "name": "Gibraltar",
            "portugueseName": "Gibraltar",
            "code": "GI",
            "bacen": 2933
        },
        {
            "id": 232,
            "name": "Virgin Islands (British)",
            "portugueseName": "Virgens, Ilhas (Britânicas)",
            "code": "VG",
            "bacen": 8630
        }
    ],
    "pageable": {
        "sort": {
            "empty": true,
            "sorted": false,
            "unsorted": true
        },
        "offset": 0,
        "pageSize": 20,
        "pageNumber": 0,
        "unpaged": false,
        "paged": true
    },
    "last": true,
    "totalElements": 5,
    "totalPages": 1,
    "number": 0,
    "size": 20,
    "sort": {
        "empty": true,
        "sorted": false,
        "unsorted": true
    },
    "first": true,
    "numberOfElements": 5,
    "empty": false
}
```





- Busca estado por id
```
http://localhost:8080/staties/1
``` 
- Exemplo Json

```
{
    "id": 1,
    "name": "Acre",
    "uf": "AC",
    "ibge": 12,
    "country": {
        "id": 1,
        "name": "Brazil",
        "portugueseName": "Brasil",
        "code": "BR",
        "bacen": 1058
    },
    "ddd": [
        "68"
    ]
}
```

- Busca todos os estados paginados
```
http://localhost:8080/staties?page=0&size=2
``` 
- Exemplo Json

```
{
    "content": [
        {
            "id": 1,
            "name": "Acre",
            "uf": "AC",
            "ibge": 12,
            "country": {
                "id": 1,
                "name": "Brazil",
                "portugueseName": "Brasil",
                "code": "BR",
                "bacen": 1058
            },
            "ddd": [
                "68"
            ]
        },
        {
            "id": 2,
            "name": "Alagoas",
            "uf": "AL",
            "ibge": 27,
            "country": {
                "id": 1,
                "name": "Brazil",
                "portugueseName": "Brasil",
                "code": "BR",
                "bacen": 1058
            },
            "ddd": [
                "82"
            ]
        }
    ],
    "pageable": {
        "sort": {
            "empty": true,
            "sorted": false,
            "unsorted": true
        },
        "offset": 0,
        "pageSize": 2,
        "pageNumber": 0,
        "unpaged": false,
        "paged": true
    },
    "last": false,
    "totalElements": 28,
    "totalPages": 14,
    "number": 0,
    "size": 2,
    "sort": {
        "empty": true,
        "sorted": false,
        "unsorted": true
    },
    "first": true,
    "numberOfElements": 2,
    "empty": false
}
```
- Busca estado por nome
```
http://localhost:8080/staties?name=são
``` 
- Exemplo Json

```
{
    "content": [
        {
            "id": 26,
            "name": "São Paulo",
            "uf": "SP",
            "ibge": 35,
            "country": {
                "id": 1,
                "name": "Brazil",
                "portugueseName": "Brasil",
                "code": "BR",
                "bacen": 1058
            },
            "ddd": [
                "11,12,13,14,15,16,17,18,19"
            ]
        }
    ],
    "pageable": {
        "sort": {
            "empty": true,
            "sorted": false,
            "unsorted": true
        },
        "offset": 0,
        "pageSize": 20,
        "pageNumber": 0,
        "unpaged": false,
        "paged": true
    },
    "last": true,
    "totalElements": 1,
    "totalPages": 1,
    "number": 0,
    "size": 20,
    "sort": {
        "empty": true,
        "sorted": false,
        "unsorted": true
    },
    "first": true,
    "numberOfElements": 1,
    "empty": false
}
```





- Busca cidade por id
```
http://localhost:8080/cities/1
``` 
- Exemplo Json

```
{
    "id": 1,
    "name": "Afonso Cláudio",
    "ibge": 3200102,
    "geolocation": "(-20.0778007507324006,-41.1260986328125)",
    "latitude": -200778007507324000,
    "longitude": -411260986328125,
    "codTom": 5601,
    "state": {
        "id": 8,
        "name": "Espírito Santo",
        "uf": "ES",
        "ibge": 32,
        "country": {
            "id": 1,
            "name": "Brazil",
            "portugueseName": "Brasil",
            "code": "BR",
            "bacen": 1058
        },
        "ddd": [
            "28,27"
        ]
    }
}
```

- Busca todos as cidades paginadas
```
http://localhost:8080/cities?page=0&size=2
``` 
- Exemplo Json

```
{
    "content": [
        {
            "id": 1,
            "name": "Afonso Cláudio",
            "ibge": 3200102,
            "geolocation": "(-20.0778007507324006,-41.1260986328125)",
            "latitude": -200778007507324000,
            "longitude": -411260986328125,
            "codTom": 5601,
            "state": {
                "id": 8,
                "name": "Espírito Santo",
                "uf": "ES",
                "ibge": 32,
                "country": {
                    "id": 1,
                    "name": "Brazil",
                    "portugueseName": "Brasil",
                    "code": "BR",
                    "bacen": 1058
                },
                "ddd": [
                    "28,27"
                ]
            }
        },
        {
            "id": 2,
            "name": "Água Doce do Norte",
            "ibge": 3200169,
            "geolocation": "(-18.5482006072998011,-40.9854011535645029)",
            "latitude": -185482006072998000,
            "longitude": -409854011535645000,
            "codTom": 5717,
            "state": {
                "id": 8,
                "name": "Espírito Santo",
                "uf": "ES",
                "ibge": 32,
                "country": {
                    "id": 1,
                    "name": "Brazil",
                    "portugueseName": "Brasil",
                    "code": "BR",
                    "bacen": 1058
                },
                "ddd": [
                    "28,27"
                ]
            }
        }
    ],
    "pageable": {
        "sort": {
            "empty": true,
            "sorted": false,
            "unsorted": true
        },
        "offset": 0,
        "pageSize": 2,
        "pageNumber": 0,
        "unpaged": false,
        "paged": true
    },
    "last": false,
    "totalElements": 5594,
    "totalPages": 2797,
    "number": 0,
    "size": 2,
    "sort": {
        "empty": true,
        "sorted": false,
        "unsorted": true
    },
    "first": true,
    "numberOfElements": 2,
    "empty": false
}
```
- Busca cidade por nome
```
http://localhost:8080/cities?name=bar&size=2
``` 
- Exemplo Json

```
{
    "content": [
        {
            "id": 12,
            "name": "Barra de São Francisco",
            "ibge": 3200904,
            "geolocation": "(-18.7548007965087997,-40.896499633789098)",
            "latitude": -187548007965087000,
            "longitude": -40896499633789000,
            "codTom": 5617,
            "state": {
                "id": 8,
                "name": "Espírito Santo",
                "uf": "ES",
                "ibge": 32,
                "country": {
                    "id": 1,
                    "name": "Brazil",
                    "portugueseName": "Brasil",
                    "code": "BR",
                    "bacen": 1058
                },
                "ddd": [
                    "28,27"
                ]
            }
        },
        {
            "id": 20,
            "name": "Conceição da Barra",
            "ibge": 3201605,
            "geolocation": "(-18.5883007049561009,-39.7361984252929972)",
            "latitude": -185883007049561000,
            "longitude": -397361984252929000,
            "codTom": 5631,
            "state": {
                "id": 8,
                "name": "Espírito Santo",
                "uf": "ES",
                "ibge": 32,
                "country": {
                    "id": 1,
                    "name": "Brazil",
                    "portugueseName": "Brasil",
                    "code": "BR",
                    "bacen": 1058
                },
                "ddd": [
                    "28,27"
                ]
            }
        }
    ],
    "pageable": {
        "sort": {
            "empty": true,
            "sorted": false,
            "unsorted": true
        },
        "offset": 0,
        "pageSize": 2,
        "pageNumber": 0,
        "unpaged": false,
        "paged": true
    },
    "last": false,
    "totalElements": 129,
    "totalPages": 65,
    "number": 0,
    "size": 2,
    "sort": {
        "empty": true,
        "sorted": false,
        "unsorted": true
    },
    "first": true,
    "numberOfElements": 2,
    "empty": false
}
```
