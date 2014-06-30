----------------!!!NOTAS DOS ESPECIALISTAS!!!-----------------------------------
http://i.imgur.com/pi64Bat.jpg
-------------------------------------------------------------------------------
The 'scripts' folder contains executable files that can be used 
to perform important tasks of the project.

Scripts with the .sh extension are to be used in Linux and Mac OS. 
Scripts with the .bat extension are to be used in Windows.
Attention: You should always maintain the scripts up-to-date!

You should install Graphviz (http://www.graphviz.org/) in your computer 
to be able to generate all type of diagrams in javadoc!

Cleansheets uses two different versions of ANTLR. ANTLR v2 is used by
the assertion extension. ANTLR v3 (and ANTLRWorks) are used in the formula
parser and lexer. The antlr-3.5.2-complete.jar contains both APIs of 
ANTLR: v2 and v3. ANTLRWorks is contained in a jar file that is located
in the lib folder (antlrworks-1.5.2-complete.jar). You can run this jar
to open the IDE for developing ANTLR v3 grammars.

One of the first tasks is to generate technical documentation and study it.
For that you should do:
$> cd scripts
$> ./makeuml.sh
$> ./makedoc.sh
Then open the file doc/api/index.html in a browser.

Then you should study the scripts!

To build the csheets.jar you should do:
$> cd scripts
$> ./cc.sh
$> ./makejar.sh

To execute csheets (from csheets.jar):
$> cd scripts
$> ./run.sh

To build the tests
$> cd scripts
$> ./build_tests.sh

To execute the tests
$> cd scripts
$> ./run_tests.sh