# pomodori
Trabalho em Java para Laboratório de Programação
___________________________________________________

###Banco de dados

O banco de dados do sistema Pomodori é em MySQL.
Para utilizá-lo, segue os passos.

Entre na pasta do projeto e execute o seguinte comando

`cd pomodori/`

`docker-compose up -d`

com isso será criado um container de nome **mysql_pomodori**, para criar as tabelas, 
você deve entrar dentro do container **mysql_pomodori** e rodar o script que foi 
mapeado para lá, segue os comandos.

`docker exec -it mysql_pomodori bash`

`./script.sh`

com isso você terá o banco de dados pronto.




