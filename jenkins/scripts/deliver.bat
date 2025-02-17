NAME=`mvn -q -DforceStdout help:evaluate -Dexpression=project.name`
VERSION=`mvn -q -DforceStdout help:evaluate -Dexpression=project.version`
java -jar target/${NAME}-${VERSION}.jar