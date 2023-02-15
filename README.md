# Clínica
API REST - SPRING BOOT - Sistema para gestão de clínica com persistência de dados

Sistema faz gestão de cadastros de médicos com suporte as seguintes operações:

* Insert
* Update
* Select
* Delete 

# No cadastro do médico, devem ser cadastrados os seguintes itens:

* Nome do médico com no máximo 120 caractéres

* CRM: somente números com no máximo 7 caracteres

* Telefone fixo: somente números com no máximo 11 caracteres

* Telefone celular: somente números com no máximo 11 caracteres

* CEP: somente números
(Ao cadastrar o CEP, deve ser feita uma reqisição via XHR para a API dos correios e retornar todos os dados de endereço do cliente);

* Especialidade médica (mínimo de duas especialidades).

# Itens Importantes:

* padrão REST
* Para documentação e requisição utilizar o Postman
* Criar arquivo dockerFile e Docker-Compose para avaliação de teste

# Diferenciais:

* Estrutura e implementação autênticos
* Estruturação de banco de dados MySQL

# Ferramentas para serem utilizadas no desenvolvimento:

* Java (Seguir as seguintes orientações)
* SpringBoot e Hibernate
