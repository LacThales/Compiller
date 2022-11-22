import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.RecognitionException;

public class MyErrorListener extends BaseErrorListener {
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
            String msg, RecognitionException e) {
        // method arguments should be used for more detailed report
        System.out.println("\u001B[31m" + "[!] ERRO [!] -> Linha: " + line + " | Coluna: " + charPositionInLine + " | Msg: " + msg + "\u001B[0m");
        throw new RuntimeException();
    }
}