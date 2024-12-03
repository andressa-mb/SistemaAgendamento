# Sistema de Agendamento

Este é um sistema de agendamento desenvolvido em Java, com foco em funcionalidades para gerenciar consultas de pacientes. O projeto utiliza uma interface gráfica construída com Swing, permitindo o gerenciamento eficiente de consultas. Os dados são armazenados em memória durante o tempo de execução, utilizando listas para manipulação de informações de pacientes e consultas.

## Funcionalidades

* **Cadastro de consultas:** Permite adicionar novas consultas com informações detalhadas.
* **Listagem de consultas:** Exibe todas as consultas registradas em uma tabela interativa.
* **Finalização de consultas:** Marca consultas como concluídas e exibe detalhes como receita médica ou observações.
* **Exclusão de consultas:** Remove consultas cadastradas no sistema.
* **Tratamento de erros:** Utiliza estruturas try-catch para garantir a estabilidade e informar mensagens amigáveis ao usuário em caso de falhas.

## Arquitetura do Sistema

* **Armazenamento em memória:**
      Os dados são gerenciados utilizando listas (List<Paciente>) e manipulados durante o tempo de execução do programa.
        Não há persistência após o encerramento da aplicação.

* **Modelos de dados:**
        O projeto implementa classes como Paciente e ListarPaciente para para organizar e manipular os dados localmente.

* **Interface gráfica (GUI):**
        Desenvolvida em Java Swing, oferecendo uma experiência visual intuitiva.
        Contém tabelas para exibir dados e botões para ações específicas.

* **Tratamento de erros:**
        Implementado com try-catch para lidar com exceções e evitar falhas inesperadas no sistema.

## Tecnologias Utilizadas

* Linguagem de programação: Java
* Interface gráfica: Java Swing
* Armazenamento: Dados mantidos em memória (sem integração com banco de dados)
* Tratamento de erros: Estruturas de controle try-catch

## Como Executar o Projeto

* Pré-requisitos:
        Java JDK instalado (versão 11 ou superior).
        IDE como IntelliJ IDEA, Eclipse ou NetBeans.

* Execução:
        Clone este repositório:
  ```
  git clone https://github.com/andressa-mb/SistemaAgendamento.git
  ```

* Abra o projeto na sua IDE preferida.
Compile e execute a classe principal (SistemaAgendamento.java).
