# prudent_gaming

1.Use this commands to start Zookeeper and Kafka :
        .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
        .\bin\windows\kafka-server-start.bat .\config\server.properties 

2.After starting the zookeeper and kafka, run the spring boot project.

3.Use this URL to post the data of user in db with the request body

URL
http://localhost:8080/user/saveUser

Json Body
{
    "id": 1,
    "numbets": 1,
    "game": "blackjack",
    "stake": 100.0,
    "returns": 100.0,
    "clientid": 2,
    "date": "2020-05-16"
}


4.Use this URL to get the data of user by Client id

http://localhost:8080/user/getUserByClientId/1
http://localhost:8080/user/getUserByClientId/2

5.Use this URL to get the data of user by game

http://localhost:8080/user/getUserByGame/roulette
http://localhost:8080/user/getUserByGame/baccarat
http://localhost:8080/user/getUserByGame/blackjack

6.Use this URL to get the data of user by date

http://localhost:8080/user/getUserByDate/2020-05-16
http://localhost:8080/user/getUserByDate/2020-05-17

7.Use this URL to get the kafka message(Pass the message in " ")

http://localhost:8080/user/producerMessage?message="  "
