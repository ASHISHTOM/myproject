# we are extending everything from tomcat:8.0 image ...
FROM tomcat:9.0
MAINTAINER ashish
# COPY path-to-your-application-war path-to-webapps-in-docker-tomcat
COPY Sampleproject-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/