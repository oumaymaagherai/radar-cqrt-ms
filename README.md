
# Compte Rendu
## Architecture Technique du projet 
![image](https://user-images.githubusercontent.com/79479398/209482433-7f18064c-2372-4b66-8151-fa97c95e8317.png)
 
## Diagramme de classe  
![image](https://user-images.githubusercontent.com/79479398/209482460-dc18bd11-ac98-4caf-96f2-4b99b068dd62.png)

## Structure de projet 
![image](https://user-images.githubusercontent.com/79479398/209482479-f77bc6e3-d1ab-4e43-a1e1-97520848c229.png)

## Common-api
Le projet utilise un module « common-api » sous forme d’un projet maven qui déclare les composants communs aux différents projets comme les Commandes, les Evénements, les Queries, les DTOs. 


![image](https://user-images.githubusercontent.com/79479398/209482494-1907e1e6-fa91-468e-af13-776a529ecdba.png)


## Radar Service
![image](https://user-images.githubusercontent.com/79479398/209482508-87a48c93-99d0-494b-a261-25f3ece8ae34.png)

### tester les controller avec Swagger 
![image](https://user-images.githubusercontent.com/79479398/209482535-0ee4aeb5-e5fd-4371-9e68-ba59337ca45a.png)

##### Ajouter Radar : 
![image](https://user-images.githubusercontent.com/79479398/209482547-fed8a76c-d81d-47e8-a0d8-7a48f66b8461.png)

![image](https://user-images.githubusercontent.com/79479398/209482549-c24328d0-7e5b-4e01-be2a-f24407c916da.png)


##### Liste Radars : 
![image](https://user-images.githubusercontent.com/79479398/209482564-12788b52-3771-42be-b44e-180ee7806864.png)


#### Radar By Id : 
![image](https://user-images.githubusercontent.com/79479398/209482573-4af40c07-cc0e-4b8d-923e-99d9e55b4957.png)


## Immatriculation service 
![image](https://user-images.githubusercontent.com/79479398/209482598-cfebd833-def0-4153-b9d2-5c51fe359175.png)

### tester les controlers avec Swagger 
![image](https://user-images.githubusercontent.com/79479398/209482607-6c3acb55-5379-4bf6-8608-693945805b99.png)


#### Ajouter propriétaire : 
![image](https://user-images.githubusercontent.com/79479398/209482613-809c8acf-e875-4811-adcf-0813f6d608bd.png)

![image](https://user-images.githubusercontent.com/79479398/209482621-fcabfcca-ffb9-4f41-969b-97d09d7ec224.png)


#### Ajouter Véhicule : 
![image](https://user-images.githubusercontent.com/79479398/209482628-62ba0d4a-c7e3-405e-aa05-e6e854cfa713.png)

![image](https://user-images.githubusercontent.com/79479398/209482629-418b59a3-6f22-4a54-b2e8-20cd8b8bce77.png)


#### Liste Propriétaires :
![image](https://user-images.githubusercontent.com/79479398/209482636-b047dd39-10a0-41cc-ab5c-3cf14377ae9e.png)


#### Liste Véhicules : 
![image](https://user-images.githubusercontent.com/79479398/209482643-c38cd9a0-e0a2-4322-88f7-b774769e6f4a.png)


#### Modifier propriétaire : 
![image](https://user-images.githubusercontent.com/79479398/209482655-ef571593-9ae9-401a-8360-f63a6d3b27f7.png)

![image](https://user-images.githubusercontent.com/79479398/209482656-e7313c22-bf86-49ea-9a7d-d09a8eeecca4.png)


## Infraction Service : 
![image](https://user-images.githubusercontent.com/79479398/209482660-7897e649-e025-4b0d-ac1b-b61ee2a6c185.png)


### Tester les controllers avec swagger : 
![image](https://user-images.githubusercontent.com/79479398/209482668-16055c7f-d4cc-426d-bfd9-b911801a8861.png)


#### ajouter une infraction 
![image](https://user-images.githubusercontent.com/79479398/209482678-2300d52d-3537-41fb-89d7-fffbea930577.png)

![image](https://user-images.githubusercontent.com/79479398/209482680-c9d4a523-f756-48a4-8f03-12454e54f1d3.png)


#### Liste des infractions :
![image](https://user-images.githubusercontent.com/79479398/209482690-f5a67745-f680-4d5a-94db-df4ca7e83e82.png)


### Eureka Discovery service et Gateway
![image](https://user-images.githubusercontent.com/79479398/209482700-c0d8a66b-bbfd-4400-a41a-1c5335d78369.png)

#### Acceder aux services à partire de Gateway : 
Radar Service 
![image](https://user-images.githubusercontent.com/79479398/209482718-3ac603ac-0b41-47b0-bd68-714b328101d4.png)


Vehicule Service 
![image](https://user-images.githubusercontent.com/79479398/209482729-fce6f347-84c9-4273-871c-1d7e3e91ddc0.png)

Infraction Service 
![image](https://user-images.githubusercontent.com/79479398/209482736-52a428ef-2978-4fd5-9711-2b0234644615.png)

