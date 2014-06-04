/**
 * Technical documentation regarding the user story 040: Wizard básico inserir função
 * <br/>
 * <br/>
 * 
 * <b>Requirement</b><br/>
 * Deve existir uma janela que permite escolher a função que de deseja executar.
 * Ela apresenta numa edit box a sintaxe para se escrever.
 * Deve apresentar um "help" com o que faz a função.
 * Quando se confirma o texto da função é escrito na barra de fórmulas.
 * <br/>
 * <br/>
 *  
 * <b>S040a: Analysis</b><br/>
 * Para o utilizador poder escolher a função que deseja executar, é necessário mostrá-las todas. Para isso, é preciso saber onde estão guardadas todas as instâncias da classe Function.
 * Mostrando todas as funções, deve ser seleccionada por omissão a primeira função da lista e mudada a selecção quando o utilizador escolhe outra das funções apresentadas.
 * Utilizar o método getIdentifier() para mostrar o operador da função na sintaxe.
 * Para apresentar um "help" com o que faz a função seleccionada, deve ser criado um método getDescription() na classe Function.
 * <br/>
 * <br/>
 * 
 * <b>S040d: Design</b><br/>
 * Para realizar este caso de uso é necessário guardar as funções disponíveis (de modo a poder mostrá-las para que o utilizador escolha uma).
 * Será necessário criar uma subclasse de Extension, de UIExtension, de BaseAction, e de JFrame (que será a janela que queremos criar).
 * 
 * <br/>
 * <br/>
 * @author 1120268
 */

package csheets.userstories.us040;
