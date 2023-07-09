.class public teste0
.super java/lang/Object

.field public static returnsList Ljava/util/ArrayList;
.field public static scanner Ljava/util/Scanner;

.method public static main([Ljava/lang/String;)V
    .limit stack 10
    .limit locals 4

    ; Variáveis locais:
    ; Variável 1: nlines
    ; Variável 2: i
    ; Variável 3: _a1
    ; Variável 4: _a2

    ; Inicializa o objeto ArrayList
    new java/util/ArrayList
    dup
    invokespecial java/util/ArrayList/<init>()V
    putstatic teste0/returnsList Ljava/util/ArrayList;

    ; Inicializa o objeto Scanner
    new java/util/Scanner
    dup
    getstatic java/lang/System/in Ljava/io/InputStream;
    invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V
    putstatic teste0/scanner Ljava/util/Scanner;

    ; Atribui valor a nlines
    ldc 5
    istore_1

    ; Atribui valor a i
    iload_1
    istore_2

    ; Loop externo
    iload_2
    ifle outerLoopEnd
outerLoopStart:
    ; Inicializa o loop interno
    iconst_0
    istore_3
    ; Verifica a condição do loop interno
    iload_3
    iload_2
    if_icmpge innerLoopEnd
innerLoopStart:
    ; Imprime '*'
    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "*"
    invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V

    ; Incrementa a variável do loop interno
    iinc 3 1
    ; Verifica a condição do loop interno
    iload_3
    iload_2
    if_icmplt innerLoopStart
innerLoopEnd:

    ; Decrementa a variável i
    iinc 2 -1

    ; Imprime '\n'
    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "\n"
    invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V

    ; Verifica a condição do loop externo
    iload_2
    ifgt outerLoopStart
outerLoopEnd:

    ; Fim do programa
    return
.end method