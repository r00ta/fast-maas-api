# fast-maas-api

For very very very large installations, you might use this tool to access your MAAS machines in an incredibly fast way. 

This is a **community** tool: use it at your own risk.

## Install

Just use the snap (WIP)

```shell
sudo snap install fast-maas-api
```

and run it according to your configs

```shell
fast-maas-api --host 0.0.0.0 --port 1337 --dbuser maas --dbpassword maas --dbhost localhost --dbname maasdb
```

## Local development

Prerequisites:
- maven >= 3.9.0
- java >= 11

Run 

```shell
mvn clean compile quarkus:dev
```

and access the swagger-ui at `http://localhost:8080/q/swagger-ui`.
