@echo off
rmdir /S /Q  ..\tmp-build 
mkdir ..\tmp-build
REM del /S /Q ..\tmp-build\*.class >nul
dir /B /S /O:N ..\src\*.java > c.lst
javac -cp ..\src;..\lib\antlr-3.5.2-complete.jar;..\lib\h2-1.4.178.jar;..\lib\AbsoluteLayout.jar;..\lib\jasypt-1.9.0.jar;..\lib\eclipselink.jar;..\lib\hibernate-jpa-2.0-api-1.0.1.Final.jar;..\lib\javax.persistence_2.1.0.v201304241213.jar;..\lib\org.eclipse.persistence.jpa.jpql_2.5.1.v20130918-f2b9fc5.jar;..\lib\org.eclipse.persistence.jpa.modelgen_2.5.1.v20130918-f2b9fc5.jar;..\lib\bsh-2.0b4.jar;..\lib\itextpdf-5.5.1.jar;..\lib\javax.mail.jar -d ..\tmp-build @c.lst %1 %2 %3
del c.lst