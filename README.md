# springbuiltdocker

This is basic springboot application integrated with docker via spring cloud native libraries

we need not to create any docker files .
after done with code changes in terminal type below command and hit 
mvn spring-boot:build-image

After running above command our application will be compiled packaged and converted into docker image 

next type below command and hit 
docker run --tty --publish 9898:8787 springbuiltdocker:0.0.1-SNAPSHOT
9898 is port running on docker container
8787 is port running on application 
springbuiltdocker:0.0.1-SNAPSHOT is docker image which is created


After running 2nd command docker run application will get started 
![image](https://user-images.githubusercontent.com/115841974/211709952-0e89b65a-65d8-4b35-8ea5-760331e2e3e5.png)

![image](https://user-images.githubusercontent.com/115841974/211710113-2c5398d8-9669-4318-a8cf-6caf74e63be8.png)
u can see output 
 after running above 1st command docker image will be created 
 ![image](https://user-images.githubusercontent.com/115841974/211710211-855d3c08-b735-4d85-a7e3-c13aa24282e1.png)


