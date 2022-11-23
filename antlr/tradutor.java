
import java.util.HashMap;
import java.util.Map;

public class tradutor extends atribuicaoBaseListener {
    public String codigo = "";
    public HashMap<String,Integer> example = new HashMap<String,Integer>();
    
    @Override
    public void enterComece(atribuicaoParser.ComeceContext ctx) {
    }

    @Override
    public void exitComando(atribuicaoParser.ComandoContext ctx) {
    }

    @Override
    public void exitRead(atribuicaoParser.ReadContext ctx) {
    }

    @Override
    public void enterComando_print(atribuicaoParser.Comando_printContext ctx) {
        codigo += "System.out.println";
    }

    @Override
    public void exitAspas(atribuicaoParser.AspasContext ctx) {
        codigo += " \" ";
    }

    @Override
    public void exitL_par(atribuicaoParser.L_parContext ctx) {
        codigo += "(";
    }

    @Override
    public void exitR_par(atribuicaoParser.R_parContext ctx) {
        codigo += ")";
    }

    @Override
    public void exitL_keys(atribuicaoParser.L_keysContext ctx) {
        codigo += "{\n";
    }

    @Override
    public void exitR_keys(atribuicaoParser.R_keysContext ctx) {
        codigo += "}\n";
    }

    @Override
    public void enterTexto(atribuicaoParser.TextoContext ctx) {
        codigo += "\"";
    }

    @Override
    public void exitTexto(atribuicaoParser.TextoContext ctx) {
        codigo += "\"";
    }

    @Override
    public void exitComando_matematico(atribuicaoParser.Comando_matematicoContext ctx) {
        codigo += ctx.getText();
    }

    @Override
    public void exitOperador_matematico(atribuicaoParser.Operador_matematicoContext ctx) {
        codigo += ctx.getText();
    }

    @Override
    public void enterComando_declaracao(atribuicaoParser.Comando_declaracaoContext ctx) {
        if(ctx.getText().contains("numero_inteiro")){
            String tipo_variavel = ctx.getText().substring(0, 14);
            String pega_variavel[] = ctx.getText().split("=");
            String nome_Variavel = pega_variavel[0].substring(14 , pega_variavel[0].length());
            if (example.containsKey(nome_Variavel) && example.containsValue(0)){
                System.out.println("\u001B[31m" + "[!] A variavel " + nome_Variavel + " do tipo " + tipo_variavel + " já foi definida neste escopo [!]" + "\u001B[0m");
                System.exit(0);
            }else{
                example.put(nome_Variavel, 0);
            }
        }else if(ctx.getText().contains("numero_quebrado")){
            String tipo_variavel = ctx.getText().substring(0, 15);
            String pega_variavel[] = ctx.getText().split("=");
            String nome_Variavel = pega_variavel[0].substring(15 , pega_variavel[0].length());
            if (example.containsKey(nome_Variavel) && example.containsValue(0)){
                System.out.println("\u001B[31m" + "[!] A variavel " + nome_Variavel + " do tipo " + tipo_variavel + " já foi definida neste escopo [!]" + "\u001B[0m");
                System.exit(0);
            }else{
                example.put(nome_Variavel, 0);
            }
        }else if(ctx.getText().contains("texto")){
            String tipo_variavel = ctx.getText().substring(0, 5);
            String pega_variavel[] = ctx.getText().split("=");
            String nome_Variavel = pega_variavel[0].substring(5 , pega_variavel[0].length());
            if (example.containsKey(nome_Variavel) && example.containsValue(0)){
                System.out.println("\u001B[31m" + "[!] A variavel " + nome_Variavel + " do tipo " + tipo_variavel + " já foi definida neste escopo [!]" + "\u001B[0m");
                System.exit(0);
            }else{
                example.put(nome_Variavel, 0);
            }
        }else if(ctx.getText().contains("caracter")){
            String tipo_variavel = ctx.getText().substring(0, 8);
            String pega_variavel[] = ctx.getText().split("=");
            String nome_Variavel = pega_variavel[0].substring(8 , pega_variavel[0].length());
            if (example.containsKey(nome_Variavel) && example.containsValue(0)){
                System.out.println("\u001B[31m" + "[!] A variavel " + nome_Variavel + " do tipo " + tipo_variavel + " já foi definida neste escopo [!]" + "\u001B[0m");
                System.exit(0);
            }else{
                example.put(nome_Variavel, 0);
            }
        }else if(ctx.getText().contains("booleano")){
            String tipo_variavel = ctx.getText().substring(0, 8);
            String pega_variavel[] = ctx.getText().split("=");
            String nome_Variavel = pega_variavel[0].substring(8 , pega_variavel[0].length());
            if (example.containsKey(nome_Variavel) && example.containsValue(0)){
                System.out.println("\u001B[31m" + "[!] A variavel " + nome_Variavel + " do tipo " + tipo_variavel + " já foi definida neste escopo [!]" + "\u001B[0m");
                System.exit(0);
            }else{
                example.put(nome_Variavel, 0);
            }
        }
    }

    @Override
    public void exitComando_atribuicao(atribuicaoParser.Comando_atribuicaoContext ctx){
        String pega_variavel[] = ctx.getText().split("=");
        String nome_Variavel = pega_variavel[0].substring(0 , pega_variavel[0].length());
        if (!example.containsKey(nome_Variavel)){
            System.out.println("\u001B[31m" + "[!] A variavel " + nome_Variavel + " não foi declarada [!]" + "\u001B[0m");
            System.exit(0);
        }
    }

    @Override
    public void exitComando_input(atribuicaoParser.Comando_inputContext ctx) {
        codigo += ctx.getText();
    }

    @Override
    public void exitComando_op_logico(atribuicaoParser.Comando_op_logicoContext ctx) {
    }

    @Override
    public void exitComando_op_do(atribuicaoParser.Comando_op_doContext ctx) {
    }

    @Override
    public void exitCondicional(atribuicaoParser.CondicionalContext ctx) {
        if (ctx.getText().equals("caso_sim")) {
            codigo += "if";
        } else if (ctx.getText().equals("caso_nao")) {
            codigo += "else";
        } else {
            codigo += "else if";
        }
    }

    @Override
    public void exitRepeticao(atribuicaoParser.RepeticaoContext ctx) {
        if (ctx.getText().equals("enquanto")) {
            codigo += "while ";
        } else {
            codigo += "do ";
        }
    }

    @Override
    public void exitTipo(atribuicaoParser.TipoContext ctx) {
        if (ctx.getText().equals("numero_inteiro")) {
            codigo += "int ";
        } else if (ctx.getText().equals("numero_quebrado")) {
            codigo += "float ";
        } else if (ctx.getText().equals("texto")) {
            codigo += "String ";
        } else if (ctx.getText().equals("caracter")) {
            codigo += "char ";
        } else {
            codigo += "boolean ";
        }
    }

    @Override
    public void exitOperador(atribuicaoParser.OperadorContext ctx) {
        codigo += ctx.getText();
    }

    @Override
    public void exitTermine(atribuicaoParser.TermineContext ctx) {
        codigo += ";\n";
    }

    @Override
    public void exitId(atribuicaoParser.IdContext ctx) {
        codigo += ctx.getText();
    }

    @Override
    public void exitNum(atribuicaoParser.NumContext ctx) {
        codigo += ctx.getText();
    }

    @Override
    public void exitNum_decimal(atribuicaoParser.Num_decimalContext ctx) {
        codigo += ctx.getText();
    }
}