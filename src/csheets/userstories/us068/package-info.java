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
 * A principal alteracao e' a de que a pesquisa e' feita atraves da thread e a UI e' imediatamente atualizada sempre que e' encontrado um novo ficheiro.<br/>
 * Por fim, e' necessario implementar um listener em cada um dos ficheiros apresentados na JTable para que seja apresentada uma "amostra" do seu conteudo sempre que seja selecionado.
 * <br/>
 * <br/>
 *<img src="../../../csheets/userstories/us068/doc-files/us068_design1.png"> 
 *<br/>
 *<br/>
 *
 * 
 * @author Diogo Moreira (1120339)
 */
 /*
*
@startuml doc-files/us068_design1.png
actor User
participant FindWorkbooksFileAction as FWFA
participant "<b>fc</b> : FileChooser" as FC
participant "<b>findWF</b> : FindWorkbooksFiles" as FWF
participant runThread as thread
participant "ArrayList<File>" as AL
participant "<b>windowLWF</b> : WindowListWorkbooksFiles" as WLWF
  
User -> FWFA : actionPerformed(ActionEvent event)
FWFA -> FC : <b>fc</b> = new FileChooser()
FWFA -> FC : <b>fc</b>.setFileSelectionMode(FileChooser.DIRECTORIES_ONLY)
FWFA -> FC : <b>fc</b>.showDialog()
...
FWFA -> FWF : <b>findWF</b> = new FindWorkbooksFiles()
FWFA -> FWF : <b>findWF</b>.findWorkbooksFiles(fc.getSelectedFile(), ".*\\.cls")
FWF -> thread: run()
...
thread-> AL: <b>listingFiles</b> = new ArrayList<File>

loop for File <b>fileDirectory</b> : sub
   thread-> thread: <b>listingFiles</b>.add(<b>fileDirectory</b>)
   thread-> WLWF : <b>windowLWF</b> = new WindowListWorkbooksFiles(listingF)
end
@enduml
*
*/

package csheets.userstories.us068;