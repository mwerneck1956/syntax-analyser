rm logs/application.log

mvn -q antlr4:antlr4

for file in $(find ./sintaxe/certo -name "*.lan"); do
    echo -e "Processing file: $file \n" >> ./resultados_testes/testesCertos.txt
    mvn -q exec:java -Dexec.mainClass=com.compiler.App -Dexec.args="$file" >> ./resultados_testes/testesCertos.txt
    echo -e "\n------Proximoteste---------\n" >> ./resultados_testes/testesCertos.txt
done

for file in $(find ./sintaxe/errado -name "*.lan"); do
    echo -e "Processing file: $file \n" >> ./resultados_testes/testesErrados.txt
    mvn -q exec:java -Dexec.mainClass=com.compiler.App -Dexec.args="$file" >> ./resultados_testes/testesErrados.txt
    echo -e "\n------Proximoteste---------\n" >> ./resultados_testes/testesErrados.txt
done
