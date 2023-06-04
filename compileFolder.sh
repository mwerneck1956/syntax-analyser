rm logs/application.log

mvn -q antlr4:antlr4

for file in $(find ./sintaxe/certo -name "*.lan"); do
    mvn -q exec:java -Dexec.mainClass=com.compiler.App -Dexec.args="$file" >> testesCertos.txt
    echo -e "\n------Proximoteste---------\n" >> testesCertos.txt
done

for file in $(find ./sintaxe/errado -name "*.lan"); do
    mvn -q exec:java -Dexec.mainClass=com.compiler.App -Dexec.args="$file" >> testesErrados.txt
    echo -e "\n------Proximoteste---------\n" >> testesErrados.txt
done

rm logs/application.log

mvn -q antlr4:antlr4
mvn exec:java -Dexec.mainClass=com.compiler.App -Dexec.args="./sintaxe/certo/attrADD.lan"