## use
    mvn install:install-file -Dfile="C:\Users\sala L310\Downloads\proyectoPrueba\Proyecto1-2108\Proyecto1-2108.jar" -DartifactId=Proyecto1-2108 -DgroupId="co.edu.uptc" -Dversion="1.0.0" -Dpacaking=jar

    <dependency>
        <groupId>co.edu.uptc</groupId>
        <artifactId>Proyecto1-2108</artifactId>
        <version>1.0.0</version>
        <scope>system</scope>
        <systemPath>${basedir}/lib/Proyecto1-2108.jar</systemPath>
    </dependency>