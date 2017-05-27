# Choco as a Service

Pour lancer l'application en local :
```
heroku local
```
ou
```
java -jar target/dependency/webapp-runner.jar target/*.war
```

Ensuite l'application est accessible à l'adresse `http://localhost:8080`
L'api REST se trouve sur `http://localhost:8080/choco`
Deux routes sont créées :
    - `/choco/problem` en POST (revoie juste HTTP 200)
    - `/choco/problem/{id}` en GET (revoie juste HTTP 200)

Thomas Lailler
Théo Andrieux
Juliette Fretay