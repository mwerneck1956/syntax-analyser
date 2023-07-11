.class Ponto
.super java/lang/Object
.field public x:I
.field public y:I

.method public <init>()V
    aload_0
    invokespecial java/lang/Object/init()V
    return
    .end method


.source teste
.class public teste
.super java/lang/Object


    .method public static main([Ljava/lang/String;)V
        .limit stack 1
        invokestatic teste/inicio()I
        return
    .end method