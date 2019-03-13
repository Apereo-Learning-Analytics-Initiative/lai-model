# Apereo LAI Model

This repository contains the OneRoster models.


### Command to build the package:
> Don't forget to edit the -Dversion
```bash
mvn package
cd target/
mvn install:install-file -DgroupId=org.apereo.model -DartifactId=lai-model -Dversion=1.0.9 -Dfile=lai-model-1.0.9.jar -Dpackaging=jar -DgeneratePom=true -DlocalRepositoryPath=. -DcreateChecksum=true
```