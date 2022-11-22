public class tradutor extends atribuicaoBaseListener {
    public String codigo = "";
    
    @Override
    public void enterComece(atribuicaoParser.ComeceContext ctx) {
        //System.out.println("** STARTED **");
    }

    @Override
    public void exitComando(atribuicaoParser.ComandoContext ctx) {
        System.out.println("");
    }

    @Override
    public void exitRead(atribuicaoParser.ReadContext ctx) {
        System.out.println("");
    }

    @Override
    public void enterComando_print(atribuicaoParser.Comando_printContext ctx) {
        System.out.print("System.out.println");
        codigo += "System.out.println";
    }

    @Override
    public void exitAspas(atribuicaoParser.AspasContext ctx) {
        System.out.print(" \" ");
        codigo += " \" ";
    }

    @Override
    public void exitL_par(atribuicaoParser.L_parContext ctx) {
        System.out.print("(");
        codigo += "(";
    }

    @Override
    public void exitR_par(atribuicaoParser.R_parContext ctx) {
        System.out.print(")");
        codigo += ")";
    }

    @Override
    public void exitL_keys(atribuicaoParser.L_keysContext ctx) {
        System.out.print("{");
        codigo += "{\n";
        System.out.println();
    }

    @Override
    public void exitR_keys(atribuicaoParser.R_keysContext ctx) {
        System.out.print("}");
        codigo += "}\n";
    }

    @Override
    public void enterTexto(atribuicaoParser.TextoContext ctx) {
        System.out.print("\"");
        codigo += "\"";
    }

    @Override
    public void exitTexto(atribuicaoParser.TextoContext ctx) {
        System.out.print("\"");
        codigo += "\"";
    }

    @Override
    public void exitComando_matematico(atribuicaoParser.Comando_matematicoContext ctx) {
        System.out.print(ctx.getText());
        codigo += ctx.getText();
    }

    @Override
    public void exitOperador_matematico(atribuicaoParser.Operador_matematicoContext ctx) {
        System.out.print(ctx.getText());
        codigo += ctx.getText();
    }

    @Override
    public void exitComando_declaracao(atribuicaoParser.Comando_declaracaoContext ctx) {
        //
    }

    @Override
    public void exitComando_input(atribuicaoParser.Comando_inputContext ctx) {
        System.out.print(ctx.getText());
        codigo += ctx.getText();
    }

    //@Override
    //public void exitInput(atribuicaoParser.InputContext ctx) {
        //System.out.println(ctx.getText());
        //codigo += ctx.getText();
    //}

    @Override
    public void exitComando_op_logico(atribuicaoParser.Comando_op_logicoContext ctx) {
        //
    }

    @Override
    public void exitComando_op_do(atribuicaoParser.Comando_op_doContext ctx) {
        //
    }

    @Override
    public void exitCondicional(atribuicaoParser.CondicionalContext ctx) {
        if (ctx.getText().equals("caso_sim")) {
            System.out.print("if");
            codigo += "if";
        } else if (ctx.getText().equals("caso_nao")) {
            System.out.print("else");
            codigo += "else";
        } else {
            System.out.print("else if");
            codigo += "else if";
        }
    }

    @Override
    public void exitRepeticao(atribuicaoParser.RepeticaoContext ctx) {
        if (ctx.getText().equals("enquanto")) {
            System.out.print("while ");
            codigo += "while ";
        } else {
            System.out.print("do ");
            codigo += "do ";
        }
    }

    @Override
    public void exitTipo(atribuicaoParser.TipoContext ctx) {
        if (ctx.getText().equals("numero_inteiro")) {
            System.out.print("int ");
            codigo += "int ";
        } else if (ctx.getText().equals("numero_quebrado")) {
            System.out.print("float ");
            codigo += "float ";
        } else if (ctx.getText().equals("texto")) {
            System.out.print("String ");
            codigo += "String ";
        } else if (ctx.getText().equals("caracter")) {
            System.out.print("char ");
            codigo += "char ";
        } else {
            System.out.print("boolean ");
            codigo += "boolean ";
        }
    }

    @Override
    public void exitOperador(atribuicaoParser.OperadorContext ctx) {
        System.out.print(ctx.getText());
        codigo += ctx.getText();
    }

    @Override
    public void exitTermine(atribuicaoParser.TermineContext ctx) {
        System.out.print(";");
        codigo += ";\n";
        System.out.println("");
    }

    @Override
    public void exitId(atribuicaoParser.IdContext ctx) {
        System.out.print(ctx.getText());
        codigo += ctx.getText();
    }

    @Override
    public void exitNum(atribuicaoParser.NumContext ctx) {
        System.out.print(ctx.getText());
        codigo += ctx.getText();
    }

    @Override
    public void exitNum_decimal(atribuicaoParser.Num_decimalContext ctx) {
        System.out.print(ctx.getText());
        codigo += ctx.getText();
    }
}