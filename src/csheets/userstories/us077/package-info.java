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
 * Uma vez que o metodo de pesquisa de ficheiros ja esta implementado(incompleto), e necessario analisar como funciona threads em java.A thread a usar sera uma classe que estende a classe Thread <br/> 
 * O use case 77 para alem da pesquisa em segundo plano, especifica que o modo de saida deve ser um sidebar. A componente sidebar nesta extensao deve ser implementada na classe UIExtensionSearchFilesBackground.<br/>
 * <br/>
 * 
 * <b>S077d: Design</b><br/>
 * Para realizar esta user story, temos de criar a classe JDialogSearch, para o Utilizador inserir o padrao e o diretorio.<br/>
 * Esta classe para alem de ser responsavel pela invocacao da classe de pesquisa, tera uma opcao que permite o utilizador inserir manualmente ou atraves de uma dialog search directory.<br/>
 * Teremos tambem de criar uma classe Search para realizar a pesquisa dos ficheiros que representara a Thread.<br/>
 * Esta classe implementara um metodo run, necessario para a utilizacao da thread, que ira pesquisar todos os subdirectorios e ficheiros do directorio indicado que obedecem a um determinado padrao.<br/>
 * O metodo de busca dos ficheiros implementados no use case anterior(76) apenas permite listar os ficheiros de um directorio, dai ser necessario reescrever este metodo no run.<br/>
 * O diagrama seguinte* mostra como integrar estas classes... <br/><br/>
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
 * Para testar esta funcionalidade, o utilizador deve seguir os passos seguintes:<br/>
 * 1. Executar o CleanSheets. <br/>
 * 2.Selecionar o sidebar referente a pesquisa de ficheiros. <br/>
 * 3.Selecionar no menu a opcao Extensions. <br/>
 * 4.Selecionar na Extensions a opcao  SearchFiles Menu. <br/>
 * 5.Seleciona no SearchFiles Menu a opcao  SearchFiles in Background. <br/>
 * 6.Inserir na JDialog o Padrao(Pattern) e o diretorio(Directory) <br/>
 * 7.Confirmar operacao no butao OK. <br/>
 * 8.Apos a confirmacao uma MessageDialog ira aparecer a informar que a busca iniciou e no final da busca outra MessageDialog ira aparecer a informar que a busca terminou. <br/>
 * Os ficheiros irao ser listados no sidebar <br/>.
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
