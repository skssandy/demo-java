#!/bin/bash
cd /var/www/demo/build/libs
sudo cp demo-0.0.1-SNAPSHOT.war /opt/tomcat/webapps/
sudo systemctl restart tomcat.service
