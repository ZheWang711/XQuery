#!/usr/bin/env bash
echo "starting CSE232B environment"
export CLASSPATH=".:$PWD/lib/antlr-4.3-complete.jar"
alias antlr4="java -jar $PWD/lib/antlr-4.3-complete.jar"
alias grun="java org.antlr.v4.gui.TestRig"
