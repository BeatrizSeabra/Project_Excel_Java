@echo off

echo Compiling...
call build

echo Copying temporary files...
call xcopy ..\src-resources\csheets ..\tmp-build\csheets /S /Q /Y >nul

echo Creating archive...
rmdir /S /Q  ..\dist 
mkdir ..\dist
call jar cfm ../dist/csheets.jar makejar.mf -C ../tmp-build/ csheets

echo Copiar as dependencias
call copy /Y ..\lib\*.jar ..\dist 

call jar cfm ../dist/csheets.jar makejar.mf -C ../tmp-build/csheets
call jar uf ../dist/csheets.jar makejar.mf -C ../src/META-INF/persistence.xml

REM echo Removing temporary files...
REM call rmdir jar /Q /S
