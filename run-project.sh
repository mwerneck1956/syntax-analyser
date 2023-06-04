rm logs/application.log

mvn antlr4:antlr4
mvn  exec:java -Dexec.mainClass=com.compiler.App -Dexec.args="sample.txt"
