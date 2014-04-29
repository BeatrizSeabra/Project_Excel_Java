#!/bin/sh
echo Compiling...
./build.sh

echo Copying resource files...
cp -R ../src-resources/csheets ../tmp-build 

echo Creating archive...
jar cmf makejar.mf ../dist/csheets.jar -C ../tmp-build csheets

echo Copiar as dependencias
cp ../lib/antlr-3.5.2-complete.jar ../dist/antlr-3.5.2-complete.jar

# echo Removing temporary files...
# rm -R jar
