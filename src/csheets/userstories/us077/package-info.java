/**
 * Documentacao tecnica para a user story 077: Pesquisa background. 
 * <br/>
 * <br/>
 * 
 * <b>Requirement</b><br/>
 * A pesquisa efectuada no use case anteiror(US076) deve ser feita em background/paralelo e os resultados vão aparecendo numa janela sidebar.<br/>
 * <br/>
 * <br/>
 *  
 * <b>S077a: Analysis</b><br/>
 * Uma vez que o metodo de pesquisa de ficheiros ja esta implementado, e necessario analisar como funciona threads em java.A thread a usar sera uma classe que estende a classe Thread <br/> 
 * O use case 77 para alem da pesquisa em segundo plano, especifica que o modo de saida deve ser um sidebar. A componente sidebar nesta extensao deve ser implementada na classe UIExtensionSearchFilesBackground.<br/>
 * <br/>
 * 
 * <b>S077d: Design</b><br/>
 * Para realizar esta user story, temos de criar a classe JDialogSearch, para o Utilizador inserir o padrao e para mostrar os resultados,
 * e a classe Search para realizar a pesquisa dos ficheiros e uma classe qque representara a Thread. O diagrama seguinte
 * mostra como integrar estas classes... <br/><br/>
 * <img src="../../../csheets/userstories/us077/doc-files/US077_design.png"> 
 * <br/>
 * <br/>
 * 
 * <b>S077c: Coding</b><br/>
 * see:<br/>
 * <a href="../../../csheets/ext/searchFilesBackground/package-summary.html">csheets.ext.searchFilesBackground</a><br/>
 * <a href="../../../csheets/ext/searchFilesBackground/ui/package-summary.html">csheets.ext.searchFilesBackground.ui</a><br/>
 * <br/>
 * <br/>
 * 
 * <b>S077u: Unit Tests</b><br/>
 * O metodo responsavel pela pesquisa dos ficheiros que sequem determinado padrao esta contindo na thread, uma vez que e para fazer a busca em segundo plano.<br/>
 * Deste modo nao e possivel efectuar testes unitarios.<br/>
 * Apesar de nao ser possivel efectuar testes unitarios,e importante referir alguns aspectos que esta extensao tem em relacao a validacao de resultados.<br/>
 * Ao iniciar a aplicacao podemos verificar que na seccao do sidebar referente a pesquisa de ficheiros(search files in background) tem apenas um valor a dizer "background".<br/>
 * Quando a pesquisa inicia uma messageDialog e ativada a avisar que a pesquisa iniciou. Durante a pesquisa o valor "background" e apagado e substituido pelos nomes dos ficheiros encontrados.<br/>
 * Se nao for encontrado nenhum ficheiros o valor "background" e substituido por "file not found".<br/>
 * No final da pesuisa outra messageDialog e ativada a avisar que a pesuisa terminou.<br/>
 * <br/>
 * <br/>
 * 
 * <b>S077f: Functional Tests</b><br/>
 * <br/>
 * <br/>
 * 
 * @author 1120388
 */
 /*
 *
 @startuml doc-files/US077_design.png
 User -> UIController: searchFiles()
 UIController -> SearchAction: actionListener()
 SearchAction -> Thread : search()
 SearchAction <- Thread
 SearchAction -> SearchFiles: create()
 SearchFiles -> JDialogSearch: create()
 SearchFiles <- JDialogSearch: pattern
 SearchFiles -> SearchFiles : search()
 SearchFiles -> JDialogSearch: results
 @enduml
 *
 */

package csheets.userstories.us077;
