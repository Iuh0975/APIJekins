@echo off
echo The following Maven command installs your Maven-built Java application
echo into the local Maven repository, which will ultimately be stored in
echo Jenkins's local Maven repository.

:: Enable command echoing
echo on
mvn jar:jar install:install help:evaluate -Dexpression=project.name
echo off

echo Extracting the value of the <name/> element from pom.xml...
for /f "delims=" %%i in ('mvn -q -DforceStdout help:evaluate -Dexpression=project.name') do set NAME=%%i

echo Extracting the value of the <version/> element from pom.xml...
for /f "delims=" %%i in ('mvn -q -DforceStdout help:evaluate -Dexpression=project.version') do set VERSION=%%i

echo Running the Java application...
echo on
java -jar target\%NAME%-%VERSION%.jar
echo off