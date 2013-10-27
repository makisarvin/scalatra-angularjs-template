# Esub Config #

## Build & Run ##

	sh
	$ cd Cyclodeo_2.0
	$ ./sbt
	> container:start
	> browse


If `browse` doesn't launch your browser, manually open [http://localhost:8080/](http://localhost:8080/) in your browser.

## Installation ##

### Scalatra

you need to have java installed (prefer JDK7). You need to download the JDK. After installing java run the following commands into your terminal

	$ java -version
	java version "1.7.0_09"
	Java(TM) SE Runtime Environment (build 1.7.0_09-b05)
	Java HotSpot(TM) 64-Bit Server VM (build 23.5-b02, mixed mode)

	$javac -version
	javac 1.7.0_09

Then you have to install scala 2.10.x from [http://www.scala-lang.org/](http://www.scala-lang.org/)

After installing scala you need to install sbt (min version 0.12.2) [http://www.scala-sbt.org/](http://www.scala-sbt.org/)

#### Optional install giter8

You don't need giter8 for this project but if you want to be able to create sample scalatra project then go to 
[https://github.com/n8han/giter8/](https://github.com/n8han/giter8/) and follow the installation instructions


## Compile and Run ##
Since we are using sbt most of the operations are handled inside SBT. So on the root of the project:

	$ sbt
	$ compile
	$ container:start
	$ ~; copy-resources; aux-compile

The last command will recompile and deploy the project on every code change

	$ container:stop 

To stop the container.

However to compile the SASS templates into CSS you need ot do it from the root of the webapp (/src/main/webapp). Open a second terminal and type:

	$ compass compile

To compile once or 

	$ compass watch

To compile the css every time a change happens.

small change to build

