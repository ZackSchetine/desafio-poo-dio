Este projeto consiste em um sistema de ensino desenvolvido em Java, que permite o cadastro de cursos, mentoria, bootcamps e o acompanhamento do progresso dos desenvolvedores. O objetivo é simular um ambiente educacional onde os desenvolvedores podem se inscrever em conteúdos, progredir e acumular pontos de experiência (XP).

Descrição 
O sistema de ensino possui quatro entidades principais: Curso, Mentoria, Bootcamp e Dev. O Curso e a Mentoria são conteúdos de aprendizado com títulos, descrições e propriedades específicas, como carga horária e data. O Bootcamp é uma coleção de conteúdos e possui um nome, descrição e uma duração fixa de 45 dias. O Dev representa um desenvolvedor que pode se inscrever em conteúdos, progredir e acumular XP.

Habilidades e Conhecimentos Utilizados
Java: A linguagem principal utilizada para implementar a lógica do programa.
Programação Orientada a Objetos: Utilização de conceitos como classes, objetos, herança, polimorfismo e encapsulamento para modelar as entidades do sistema.
Coleções: Utilização de conjuntos (Sets) para armazenar e gerenciar os conteúdos inscritos e concluídos pelos desenvolvedores.
Manipulação de Datas: Utilização da classe LocalDate para trabalhar com datas e registrar a data de mentoria.
Estrutura de Dados: Organização dos conteúdos em estruturas de dados como LinkedHashSet para manter a ordem de inserção.
Testes e Depuração: Verificação do funcionamento correto do programa através da execução e depuração do código.
Organização e Modelagem: Separação das responsabilidades em diferentes classes e estruturação do código de acordo com os princípios de coesão e baixo acoplamento.

Funcionalidades
Cadastro de Cursos: Permite cadastrar cursos com título, descrição e carga horária.
Cadastro de Mentorias: Permite cadastrar mentorias com título, descrição e data.
Inscrição em Bootcamp: Um Dev pode se inscrever em um Bootcamp, que adiciona automaticamente os conteúdos ao conjunto de conteúdos inscritos do Dev.
Progresso e XP: Um Dev pode progredir nos conteúdos inscritos, removendo-os do conjunto de inscrições e adicionando-os ao conjunto de conteúdos concluídos. Cada conteúdo possui uma pontuação XP associada, que é acumulada para calcular o total de XP do Dev.

Como Executar o Projeto
Tenha o Java Development Kit (JDK) instalado em sua máquina.
Clone o repositório do projeto em seu ambiente local.
Abra o terminal na pasta do projeto.
Compile os arquivos Java com o seguinte comando:
javac -d . *.java
Execute o programa com o seguinte comando:
java dio.desafio.dominio.Main
Acompanhe as informações exibidas no terminal, que mostrarão as inscrições, progresso e XP dos desenvolvedores.
Desafie-se no mundo do desenvolvimento com o Sistema de Ensino.

Observação: Certifique-se de ter o JDK instalado corretamente em seu sistema antes de executar o projeto.