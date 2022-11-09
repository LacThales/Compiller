#!/bin/bash
#grun='java org.antlr.v4.gui.TestRig'
java -jar /usr/local/lib/antlr-4.10.1-complete.jar atribuicao.g4
javac *.java
java Main < entrada.txt
