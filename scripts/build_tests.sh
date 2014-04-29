#!/bin/sh
# javac -cp ../src-tests:../dist/csheets.jar:../lib/antlr-3.5.2-complete.jar:../lib/junit-4.10.jar ../src-tests/csheets/ext/comments/*.java ../src-tests/csheets/core/*.java 
find ../src-tests -name "*.java" | xargs javac -cp ../src-tests:../dist/csheets.jar:../lib/antlr-3.5.2-complete.jar:../lib/junit-4.10.jar -d ../tmp-build-tests 
