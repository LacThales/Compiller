#!/bin/sh

Banner()
{
banner = '''

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
''' 

echo banner
}

Main()
{
	java -jar /usr/local/lib/antlr-4.10.1-complete.jar atribuicao.g4
	javac *.java
	java Main < entrada.txt
}

extra()
{	
	
	xdg-open output_img.ps
	javac out.java
	java out
}

Banner
echo "[!] Starting the Compiling process... [!]"
Main
extra
echo "[!] End of Compiling... Sucess [!]"