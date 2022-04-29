package main;

import java.io.*;

import lexer.*;
import parser.*;

public class Main {
    /**
     * <h2>Main function entry here.</h2>
     *  <ol>
     *      <li> Run this function.</li>
     *      <li> Write or copy your code to the terminal.</li>
     *      <li> Type {@code "ls"} and press {@code "enter"} to run.</li>
     *      <li> The compiled result will print on the screen.</li>
     *  </ol>
     * @param args None
     * @throws IOException None
     */
    public static void main(String[] args) throws IOException {
        Lexer lex = new Lexer();
        Parser parse = new Parser(lex);
        parse.program();
        System.out.write('\n');
    }
}
