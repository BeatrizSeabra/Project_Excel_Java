/**
 * Documentacao tecnica para a user story 061: Integrar BeanShell. 
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
 * <br/>
 * <br/>
 * 
 * <b>S061u: Unit Tests</b><br/>
 * <br/>
 * 
 * <b>S061f: Functional Tests</b><br/>
 * <br/>
 * <br/>
 * 
 * @author Fábio Carvalho 1121228
 */

package csheets.userstories.us061;
