/**
 * Technical documentation regarding the user story 060: US060- Estender menus com macros
 * Contacts have associated a reference to the residence, and the contact can take a main residence and
 * a secondary residence (optional).
 * <br/>
 * <br/>
 * 
 * <b>Requisitos</b><br/>
 * Acrescentar uma extensao que permita escrever macros usando Java BeanShell. Deve aparecer uma janela que permita escrever o script e executa-lo.<br/>
 * <br/>
 * <br/>
 *  
 * <b>S061a: Analysis</b><br/>
 * Entender o conceito do BeanShell.<br/>
 * Como integrar o BeanShell no cleanSheets<br/>
 * Adicionar uma extensao.<br/>
 * Como usar macros com BeanShell.<br/>
 * <br/>
 * <br/>
 * 
 * <b>S061d: Design</b><br/>
 * Para implementar esta user story temos de criar as duas extensoes, BSExtension, UIExtensionBS. <br/>
 * Alem destas é necessário adicionar a libraria do BeanShell ao projecto.<br/>
 * Criar a classe UIBeanShell, e interpreter.<br/>
 * O Diagrama seguinte mostra o fluxo do programa:<br/>
 * <img src="../../../csheets/userstories/us061/doc-files/us061_design.png"> <br/>
 * <br/>
 * <br/>
 * 
 * <b>S061c: Coding</b><br/>
 * Foram criadas as extensoes necessarias a realizaçao do projecto, mais um interface grafica e uma classe com um metodo que executa o script.<br/>
 * <br/>
 * <br/>
 * 
 * <b>S061u: Unit Tests</b><br/>
 * Nao ha testes possiveis a fazer. Visto que existem apenas duas classes, sendo que uma é interface e a outra contem um metodo, que interage com a libraria do BeanShell nao sabendo qual o resultado esperado em cada teste.<br/>
 * <br/>
 * 
 * <b>S061f: Functional Tests</b><br/>
 * 1-Executar programa.<br/>
 * 2-Clicar em Extension>BeanShell>BeanShell<br/>
 * 3-Introduzir script.<br/>
 * 4-Executar script.<br/>
 * <br/>
 * <br/>
 * 
 * @author Fábio Carvalho 1121228
 */

package csheets.userstories.us061;
