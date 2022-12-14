import java.io.FileWriter;
import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main {
	public static void main(String[] args) throws IOException {
		// ler codigo -> passar para o lexico -> passar para o sintatico -> fazer a
		// traducao
		System.out.println("[+] Entre com  seu codigo:");

		// fazer leitura do codigo do usuario
		CharStream input = CharStreams.fromStream(System.in);

		MyErrorListener errorListener = new MyErrorListener();

		try {
			// instanciar o analisador lexico
			atribuicaoLexer lexer = new atribuicaoLexer(input);
			lexer.removeErrorListeners();
			lexer.addErrorListener(errorListener);

			// gerar os tokens
			CommonTokenStream tokens = new CommonTokenStream(lexer);

			// instanciar o analisador sintatico
			atribuicaoParser parser = new atribuicaoParser(tokens);
			parser.removeErrorListeners();
			parser.addErrorListener(errorListener);
			ParseTree tree = parser.comece();

			// andar sobre a arvore de derivacao
			ParseTreeWalker walker = new ParseTreeWalker();

			tradutor tr = new tradutor();
			walker.walk(tr, tree);

			try {
				FileWriter writer = new FileWriter("Out.java");
				writer.write(" ");
				writer.write("import java.util.Scanner;  \n\n public class Out {\n   public static void main(String[] args) {\n   Scanner entrada = new Scanner(System.in);    \n " + tr.codigo + "\n    }\n}\n");
				writer.close();
			} catch (IOException e) {
				System.out.println("\u001B[31m" + "[+] Ocorreu um erro ao criar o arquivo Out.java [+]" + "\u001B[0m");
				e.printStackTrace();
			}

			System.out.println("\u001B[32m" + "[!] COMPILADO COM SUCESSO [!] -> Msg: Não houveram erros durante a Compilação." + "\u001B[0m");
		} catch (Exception e) {
			
		}
	}
}