@echo off

echo Compiling...
call build

echo Copying temporary files...
call xcopy ..\src-resources\csheets ..\tmp-build\csheets /S /Q /Y > nul

echo Creating archive...
rmdir /S /Q  ..\dist 
mkdir ..\dist
call jar cfm ../dist/csheets.jar makejar.mf -C ../tmp-build/ csheets

echo Copiar as dependencias
call copy /Y ..\lib\*.jar ..\dist 
<<<<<<< HEAD

call jar cfm ../dist/csheets.jar makejar.mf -C ../tmp-build/csheets
call jar uf ../dist/csheets.jar makejar.mf -C ../src/META-INF/persistence.xml
=======
>>>>>>> 4d643b4ad07dc85b1f9813bdfb2029dd0961b8d9

REM echo Removing temporary files...
REM call rmdir jar /Q /S
