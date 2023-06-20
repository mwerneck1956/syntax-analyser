package com.compiler.parser;

import java.io.*;
import com.compiler.ast.Node;
import java.util.List;

// Adaptador para classe de parser. a Função parseFile deve retornar null caso o parser resulte em erro. 

public interface ParseAdaptor {
   public abstract Node parseFile(String path);
}
