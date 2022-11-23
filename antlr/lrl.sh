#!/usr/bin/env bash

# -----------------------------------------------------------------
# Script   : lrl.sh
# Descrição: Atalho para compilação da Lazy Recursive Language
# Versão   : 1.5
# Data     : Thu 22 Sep 2022
# Licença  : GNU/GPL v3.0
# -----------------------------------------------------------------
# Uso: lrl.sh arquivo_de_entrada.txt
# IMPORTANTE: Instalar o pacote astyle -> sudo apt-get install -y astyle
# -----------------------------------------------------------------

#---------------------------- BANNER --------------------------------
Banner()
{
echo "
	 █████                ███████████            █████      
	░░███                ░░███░░░░░███          ░░███       
	 ░███                 ░███    ░███           ░███       
	 ░███                 ░██████████            ░███       
	 ░███                 ░███░░░░░███           ░███       
	 ░███      █          ░███    ░███           ░███      █
	 ███████████    ██    █████   █████    ██    ███████████
	░░░░░░░░░░░    ░░    ░░░░░   ░░░░░    ░░    ░░░░░░░░░░░ 

                                    The Lazy Recursive Language
                                                Version: 1.0
                                                        
    	[!] A simple language.... for the lazy ones [!]
"
}

#---------------------------- DEPENDENCIES --------------------------------
Dependencies()
{
	echo -e "\033[01;31m[!] Instalando dependencias... [!]\033[0m"
	sudo apt-get install -y astyle
}

#---------------------------- MAIN --------------------------------
Main()
{	
	java -jar /usr/local/lib/antlr-4.10.1-complete.jar atribuicao.g4
	javac *.java
	#java Main < $1
	java Main < entrada.txt
}

#---------------------------- EXTRAS --------------------------------
Extra()
{	
	astyle --quiet Out.java
	javac Out.java
	echo -e "\033[01;31m[!] Saída do arquivo .java gerado: [!]\033[0m"
	echo " "
	echo "***************"
	java Out
	echo "***************"
	echo " "
	java org.antlr.v4.gui.TestRig atribuicao comece -ps output_img.ps < entrada.txt
	#java org.antlr.v4.gui.TestRig atribuicao comece -ps output_img.ps < $1
	xdg-open output_img.ps
}

#---------------------------- EXECUÇÃO --------------------------------
if [[ $1 == "-d" ]] 
then
	Dependencies
	exit 0
elif [[ $# -eq 0  ]]
then
	Banner
	#echo -e "\033[01;31m[!] Arquivo de entrada: $1 [!]\033[0m"
	echo " "
	echo -e "\033[01;31m[!] Starting the Compiling process... [!]\033[0m"
	sleep 1
	Main
	Extra
	echo -e "\033[01;31m[!] End of Compiling [!]\033[0m"
	#rm -f Out.class
	#rm -f output_img.ps
	exit 0
else
	echo -e "\033[01;31m[!] Parâmetro Desconhecido [!]\033[0m"
	exit 0
fi