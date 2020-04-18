package com.github.avli.lox;

public class Token {
    final TokenType type; // kind of a language lexical unit
    final String lexeme;  // sequence of characters that matches the pattern for a token
    final Object literal;
    final int line;

    public Token(TokenType type, String lexeme, Object literal, int line) {
        this.type = type;
        this.lexeme = lexeme;
        this.literal = literal;
        this.line = line;
    }

    public String toString() {
        return type + " " + lexeme + " " + literal;
    }
}
