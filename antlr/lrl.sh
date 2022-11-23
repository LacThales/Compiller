#!/usr/bin/env bash

# -----------------------------------------------------------------
# Script   : lrl.sh
# Descrição: Atalho para compilação da Lazy Recursive Language
# Versão   : 2.0
# Data     : Thu 22 Sep 2022
# Licença  : GNU/GPL v3.0
# -----------------------------------------------------------------
# Uso: lrl.sh arquivo_de_entrada.txt
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
echo " "
echo -e "\033[01;31m[!] Starting the Compiling process... [!]\033[0m"
sleep 1
}

#---------------------------- MAIN --------------------------------
Main()
{	
	java -jar /usr/local/lib/antlr-4.10.1-complete.jar atribuicao.g4
	javac *.java
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
	xdg-open output_img.ps
	echo -e "\033[01;31m[!] End of Compiling [!]\033[0m"
}

#---------------------------- EXECUÇÃO --------------------------------
if [[  ! $(dpkg -l astyle) ]]
then
	echo -e "\033[01;31m[!] Instalando dependencias... [!]\033[0m"
	sudo apt install -y astyle;
	echo " ********************** "
	Banner
	Main
	Extra
	exit 0
else
	echo -e "\033[01;31m[!] O pacote astyle já está instalado [!]\033[0m"
	echo " "
	Banner
	Main
	Extra
	exit 0
fi
