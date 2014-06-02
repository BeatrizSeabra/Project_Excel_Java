/**
 * Technical documentation regarding the user story 085: Jogos Simples em Rede 
 * <br/>
 * <br/>
 * 
 * <b>Requirement</b><br/>
 * Jogos Simples em Rede. Fazer uma extensão que permita pequenos jogos entre 2 instâncias do cleansheets.
 * A extensão deve permitir que duas instâncias do cleansheets estabelecem uma ligação para jogarem jogos.
 * As opções dos jogos são: jogo do enforcado e jogo do galo. Os jogadores devem chegar a um acordo.
 * Cada utilizador deve definir o seu nome e imagem que devem ser transmitidos à outra instância.
 * <br/>
 * <br/>
 *  
 * <b>S085a: Analysis</b><br/>
 * Como tenho que fazer uma extensão para o cleansheets, existem condições que são obrigatorias satisfazer, nomeadamente:
 * -Extender a class <code>Extensible</code>.
 * -providenciar uma <code>UIExtension</code> que funciona como um "placeholder" para receber componentes especificos para a interface grafica da extenção.
 * Como tem que haver comuncação entre 2 instancias do cleansheets, será necessario o uso das ferramentas disponibilizadas pelo package <code>java.net</code> para a comunicação.
 * Como temos varias opções de jogos, teremos que ter uma superclass jogo para podermos abstrair a extenção do jogo.
 * Temos necessariamente que ter um metodo de decisão, como são apenas 2 instancias do cleancheet's em simultaneo, temos que usar outro metodo
 *      adicional ao nº de votos num jogo, a opção mas lógica será o tempo, o primeira sugestão para o proximo jogo, é a vencedora.
 * Cada utilizador deve ter um perfil com nome e imagem, ssendo ambos obrigatóriamente guardados num formato que possa ser transmitido.
 * 
 * <br/>
 * <br/>
 * 
 * 
 * @author 1120588
 */

package csheets.userstories.us085;