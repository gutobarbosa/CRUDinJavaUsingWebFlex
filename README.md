# CRUDinJavaUsingWebFlex

Spring WebFlux O Spring Framework 5 suporta programação reativa via Reactive Stream, a especificação que padroniza o uso de streams reativas dentro da JVM. Internamente, o Spring Framework implementa a Reactive Stream através do Reactor. Note que as classes Flux e Mono, dois publishers de stream reativas, são parte do Reactor. As classes Flux e o Mono são expostas nas APIs reativas do Spring Framework: Flux é um stream reativo formado 0 ou N elementos. Mono é um stream reativo formado por 0 ou 1 elemento. O webflux é um módulo do Spring Framework 5, que provê suporte para aplicações web reativas do lado servidor. Porém, além disso, o módulo evolui a stack de tecnologias Spring para web, colocando uma outra abordagem para construção de serviços web, paralela à API Servlets. Apesar de compatível com API Servlet 3.1 non-blocking, não precisamos do Servlet container para executar uma aplicação webflux.


### Como utilizar a aplicação

* Bastar ter instalado o postman para testar os endpoints
* Ter o MongoDB instalado para salvar os dados
