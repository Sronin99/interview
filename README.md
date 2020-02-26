# Installations à faire sur l'environnement de DEV

##### Java JDK jdk1.8.0_241
##### Maven 3.6.3
##### Node v12.13.0
##### Angular CLI 9.0.3


# Exécution  

IntelliJ IDEA pour ma part:

##### mvn clean install sur le back-end
##### npm install sur le front-end
##### Configurer le Run sur L'IDE pour détecter la main class com.org.prj.PrjApplication
##### Pointer vers la bonne JRE dans la JDK installé : {JDK_PATH}\jre
##### Configurer le projet et ces modules sur l'installation du Maven 3.6.3 {MAVEN_PATH}
##### Configurer le fichier setting de l'utilisateur sur le fichier {MAVEN_PATH}\conf\settings.xml du Maven

Lancer le Run de l'application pour démarrer Sprint Boot
lancer le front par un npm start sur la route du module front-end (ou par configuration d'un Run 'npm' sur IntellJ en pointant sur le package.json)

Accéder à l'application sur l'url du front par défaut http://localhost:4200/