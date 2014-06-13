/**
 * Technical documentation regarding the user story 068: pesquisa avancada de workbooks. 
 * <br/>
 * <br/>
 * 
 * <b>Requirement</b><br/>
 * Deve ser possivel selecionar um dos ficheiros ecnontrados e deve aparecer uma amostra do seu conteudo (por exemplo o texto da primeira linha preenchida do workbook).<br/>
 * Isto deve ser feito sem abrir o ficheiro. Deve ser possivel abrir um ficheiro selecionado na lista. A lista deve ser contruida de forma "paralela", sendo atualizada 'a medida que sao encontrados novos ficheiros.<br/>
 * <br/>
 * <br/>
 *  
 * <b>S068a: Analysis</b><br/>
 * Analise do codigo implementado no US067, implementado na semana anterior.<br/> 
 * Obs.: Grande parte do codigo podera ser reutilizado ainda que com a necessidade de ser implementado atraves de uma thread.<br/>
 * Analise do funcionamento e implementacao das threads em Java.<br/>
 * Analise de como apresentar o conteudo de um ficheiro("amostra") quando este e' selecionado, ainda que sem o abrir.<br/>
 * Analise de como abrir um workbook diretamente atraves da lista apresentada.<br/>
 * <br/>
 * <br/>
 * 
 * <b>S068d: Design</b><br/>
 * Para implementar este caso de uso e' necessario a utilizacao de uma thread que faz a pesquisa de ficheiros de forma paralela. A implementacao deste caso de uso e' em todo semelhante 'a implementacao do US067.<br/>
 * O utilizador escolhe um diretorio onde fazer a pesquisa. A pesquisa e' feita nos diretorios e sub-diretorios.
 * A principal alteracao e' a de que a pesquisa e' feita atraves da thread e a UI e' imediatamente atualizada sempre que e' encontrado um novo ficheiro. Uma das novas funcionalidade e' que a pesquisa permite abrir os ficheiros encontrados.<br/>
 * Por fim, e' necessario implementar um listener em cada um dos ficheiros apresentados na JTable para que seja apresentada uma "amostra" do seu conteudo sempre que seja selecionado.<br/>
 * Na janela onde a "amostra" e' apresentada, existe a opcao de abrir o workbook selecionado. Para abrir o workbook e' criada uma nova instancia do CleanSheets atraves de uma thread.<br/>
 * Nao sao utilizados joins na utilizacao das threads porque nao fazem sentido. O objetivo e' correr operacoes em background e nunca queremos que uma thread fique 'a espera de outra.<br/>
 * <br/>
 * <br/>
 *<img src="../../../csheets/userstories/us068/doc-files/us068_design1.png"> 
 *<br/>
 *<br/>
 *
 * <b>S068c: Coding</b><br/>
 * See:<br/>
 * <a href="../../../csheets/ext/findworkbooksfiles/package-summary.html">csheets.ext.findworkbooksfiles</a><br/>
 * <a href="../../../csheets/ext/findworkbooksfiles/ui/package-summary.html">csheets.ext.findworkbooksfiles.ui</a><br/>
 * <br/>
 * <br/>
 *
 * <b>S068u: Unit Tests</b><br/>
 * See:<br/>
 * Nao foram implementados testes unitarios. Esta funcionalidade nao tem metodos com retorno, servindo apenas para leitura e abertura de workbooks, pelo que nao fez sentido a implementacao do JUnit.
 * <br/>
 * <br/>
 *  
 * <b>S068f: Functional Tests</b><br/>
 * Para testar esta User Story e' necessario seguir os seguintes passos:<br/>
 * 1. Correr o cleansheets;<br/>
 * 2. Clicar no menu Extensions, clicar em  Find Workbook Files e selecionar a opcao Advanced Workbook Search;<br/>
 * 3. Escolher o diretorio onde deseja aplicar a pesquisa atraves da caixa que surge no ecra;<br/>
 * 4. Esperar que surjam ficheiros na lista apresentada e selecionar um dos ficheiros;<br/> 
 * 5. Selecionar o botao Open File para abrir o ficheiro pretendido numa instancia nova do Cleansheets;<br/>
 * 6. Nao fechar nenhuma das instancias do Cleansheets ate terminar o trabalho pretendido. (O fecho de uma instancia provoca o fecho das outras)<br/>
 * <br/>
 * <br/> 
 * @author Diogo Moreira (1120339)
 */
 /*
*
@startuml doc-files/us068_design1.png
actor User
participant "AdvancedWorkbookSearchAction" as searchAction
participant "<b>fc</b> : FileChooser" as FC
participant "AdvancedWorkbookSearch" as workbookSearch
participant Thread as thread
participant "JFrameWorkbookSearchResults" as window
participant JDialogShowFirstLine
participant CleanSheets as cs

  
User -> searchAction: actionPerformed(ActionEvent event)
searchAction-> FC : <b>fc</b> = new FileChooser()
searchAction-> FC : <b>fc</b>.setFileSelectionMode(FileChooser.DIRECTORIES_ONLY)
searchAction-> FC : <b>fc</b>.showDialog()
...
searchAction-> window: <b>workbookSearchResults</b> = new JFrameWorkbookSearchResults(null)
searchAction-> workbookSearch: <b>advancedWorkbookSearch</b> = new AdvancedWorkbookSearch()
searchAction-> workbookSearch: <b>advancedWorkbookSearch</b>.advancedWorkbookSearch(fc.getSelectedFile(), ".*\\.cls", workbookSearchResults)
workbookSearch-> thread: <b>thread</b> = new Thread(new ParallelSearch(startingDirectory, pattern, workbookSearchResults))
workbookSearch-> thread: <b>thread</b>.start()
...

loop for File <b>fileDirectory</b> : 
   thread-> window: <b>windowLWF</b>.updateInformation(File file)
end

loop
window->window: valueChanged()
window->JDialogShowFirstLine: create()
JDialogShowFirstLine->JDialogShowFirstLine: open()
JDialogShowFirstLine->cs: create()
end 
@enduml
*
*/

package csheets.userstories.us068;