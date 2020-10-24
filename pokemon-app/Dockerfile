# instalacion del apache tomcat

From tomcat:8.5.16-jre8-alpine

RUN rm -rf /usr/local/tomcat/webapps/*

COPY ./target/*.war /usr/local/tomcat/webapps/ROOT.war

# creacion de variables de entorno

# ENV JAVA_OPTS="-Dnombre_variable_properties=clave_asignado"

CMD ["catalina.sh","run"]

# creacion de la imagen localmente

# docker image build -t backendapp .

# creacion de contenedor

# docker container run -p 6060:8080 -it -d nombre_image_docker_image