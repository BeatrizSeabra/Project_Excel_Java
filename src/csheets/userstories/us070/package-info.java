/**
 * Documentação técnica referente ao user story 070: Importação fihcie. 
 * <br/>
 * <br/>
 * 
 * <b>Requerimento</b><br/>
 * Deve ser possível importar dados de um ficheiro de texto, cujas colunas são divididas por ",". Os dados devem aparecer a partir de uma célula que é identificada como o canto superior esquerdo.
 * <br/>
 * <br/>
 *  
 * <b>S070a: Analysis</b><br/>
 * Devido à necessidade de criar uma funcionalidade para importar ficheiros de texto devemos estudar o comportamento das células de forma a conseguir importar os dados das mesmas.
 * Iremos utilizar como base a classe Codec que irá servir como classe mãe de maneira a que a nova classe consiga herdar o método read para ler o ficheiro com extensão txt.
 * Em relação à iteração com o utilizador terá de ser criado no opção Open, na ComboBox Fyles of Types, um novo item que possibilite a importação com o formato pretendido.
 * <br/>
 * <br/>
 * 
 * <b>S070d: Design</b><br/>
 * <br/>
 * <br/>
 * 
 * <b>S070c: Coding</b><br/>
 * <br/>
 * <br/>
 * 
 * <b>S070u: Unit Tests</b><br/>
 * <br/>
 * <br/>
 * 
* <b>S070f: Functional Tests</b><br/>
* Para testar o caso de uso, o utilizador deve seguir os seguintes passos::<br/>
* 1 - Abrir o cleansheets;<br/>
* 2 - Clicar no menu Extensions, deve aparecer uma lista de extensões implementadas, e clicar na opção Import, TXT;<br/>
* 3 - Irá abrir um FileChooser no qual terá de escolher um ficheiro com formato txt;<br/>
* 5 - Aparece uma showMessageDialog a dizer que foi importado o ficheiro com sucessoe e importo os dados a partir da célula activa. <br/>
 * <br/>
 * <br/>
 * 
 * @author Tiago
 */

package csheets.userstories.us070;