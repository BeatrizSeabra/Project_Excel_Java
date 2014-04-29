#!/bin/sh
java -cp ../lib/antlr-3.5.2-complete.jar org.antlr.Tool -verbose ../src/csheets/core/formula/compiler/Formula.g
java -cp ../lib/antlr-3.5.2-complete.jar antlr.Tool -o ../src/csheets/ext/assertion ../src/csheets/ext/assertion/AssertionParser.g
