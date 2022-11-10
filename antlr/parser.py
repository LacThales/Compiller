class Token:
  def __init__(self, tipo, lexema):
    self.tipo = tipo
    self.lexema = lexema


class Parser:
  def __init__(self, tokens):
    self.tokens = tokens
    self.token = tokens[0]

  def proximo_token(self):
    tem_tokens = len(self.tokens) > 0
    if tem_tokens:
      current_token = self.tokens[0]
      self.tokens.pop(0)
      return current_token
    return Token("EOF", ";")

  def entrada_reconhecida(self):
    print("Entrada reconhecida!")

  def erro(self, mensagem):
    print("-- ERRO --")
    print("Esperado: " + mensagem)
    print(f"Token recebido: <{self.token.tipo}, \"{self.token.lexema}\">")
    exit()

  def executa(self):
    self.token = self.proximo_token()
    self.function()
    self.entrada_reconhecida()

  def function(self):
    if self.token.tipo == "tipoRetornoFuncao":
        self.token = self.proximo_token()
        self.id()
        if self.token.tipo == "parenEsquerdo":
            self.token = self.proximo_token()
            self.args()
            if self.token.tipo == "parenDireito":
                self.token = self.proximo_token()
                if self.token.tipo == "chaveEsquerda":
                    self.token = self.proximo_token()
                    self.comando()
                    if self.token.tipo == "chaveDireita":
                      self.token = self.proximo_token()
                    else:
                      self.erro("chaveDireita")
                else:
                  self.erro("chaveEsquerda")
            else:
              self.erro("parenDireito")
        else:
          self.erro("parenEsquerdo")
    else:
      self.erro("tipoRetornoFuncao")

  def comando(self):
    if self.token.tipo == "retorno":
      self.token = self.proximo_token()
      self.expressao()
    else:
      self.erro("comando")

  def expressao(self):
    self.termo()
    self.expressaoLinha()

  def expressaoLinha(self):
    if self.token.tipo == "operadorMat":
      self.token = self.proximo_token()
      self.termo()
      self.expressaoLinha()

  def termo(self):
    self.fator()
    self.termoLinha()

  def termoLinha(self):
    if self.token.tipo == "operadorMat":
      self.token = self.proximo_token()
      self.fator()
      self.termoLinha()

  def fator(self):
    if self.token.tipo == "id":
      self.token = self.proximo_token()
    elif self.token.tipo == "num":
      self.token = self.proximo_token()
    elif self.token.tipo == "parenEsquerdo":
      self.token = self.proximo_token()
      self.expressao()
      if self.token.tipo == "parenDireito":
        self.token = self.proximo_token()
      else:
        self.erro("fator")
    else:
      self.erro("fator")

  def args(self):
    self.tipo()
    self.id()

  def tipo(self):
    if self.token.tipo == "tipoId":
      self.token = self.proximo_token()
    else:
      self.erro("tipo")

  def id(self):
    if self.token.tipo == "id":
        self.token = self.proximo_token()
    else:
        self.erro("id")

  def num(self):
    if self.token.tipo == "num":
        self.token = self.proximo_token()
    else:
        self.erro("num")


def main():
  tokens = []

  tokens.append(Token("tipoRetornoFuncao", "float"))
  tokens.append(Token("id", "equacao"))
  tokens.append(Token("parenEsquerdo", "("))
  tokens.append(Token("tipoId", "int"))
  tokens.append(Token("id", "x"))
  tokens.append(Token("parenDireito", ")"))
  tokens.append(Token("chaveEsquerda", "{"))
  tokens.append(Token("retorno", "return"))
  tokens.append(Token("parenEsquerdo", "("))
  tokens.append(Token("id", "x"))
  tokens.append(Token("operadorMat", "+"))
  tokens.append(Token("id", "x"))
  tokens.append(Token("parenDireito", ")"))
  tokens.append(Token("operadorMat", "/"))
  tokens.append(Token("num", "2"))
  tokens.append(Token("operadorMat", "+"))
  tokens.append(Token("num", "9"))
  tokens.append(Token("chaveDireita", "}"))

  parser = Parser(tokens)
  parser.executa()


if __name__ == "__main__":
  main()
