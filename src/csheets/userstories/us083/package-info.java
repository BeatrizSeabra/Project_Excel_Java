/*
 * Technical documentation regarding the user story 083: explorador de instâncias. 
 * <br/>
 * <br/>
 * 
 * <b>Requirement</b><br/>
 * Deve existir uma janela (sidebar) comuma árvore que representa as diversas instâncias do cleansheets na rede.
 * Para cada instância devem aparecer uma breve descrição dos seus recurso (workbooks abertos e extensões carregadas).
 * <br/>
 * <br/>
 *  
 * <b>S083a: Analysis</b><br/>
 * Tenho que obter o nome dos workbooks abertos e das extensões carregadas. 
 * Tenho que criar a estrutura do datagrama UDP que será enviado de forma a comportar a informação dos workbooks abertos e extensões carregadas. 
 * Tenho que adicionar um cabaçalho ao datagrama, o que permite repartir essa informação por múltiplos datagramas, visto que o utilizador poderá ter um número ilimitado de workbooks abertos e extensões carregadas. 
 * Tenho que popular o JTree com a informação recebida de cada instância do cleansheets.
 * <br/>
 * <br/>
 * 
 * 
 * <b>S083d: Design</b><br/>
 * Usarei as classes já criadas para a US082, que consistiu na criação de uma extensão que permite encontrar outras instâncias do cleansheets na mesma rede local, alterando e ocasionalmente adicionando os métodos das mesmas de forma a comportar a informação requerida para esta US.
 * Para a resolução do problema, guardarei afinal a informação de cada instância através de uma classe, de modo a facilitar o tratamento da informaçao.
 * <br/>
 * <br/>
 * 
 * 
 * <b>S083c:Coding</b><br/>
 * Classes Servidor, Cliente e FindInstancesUI alteradas: métodos modificados para diferente resolução do problema.
 * Classes Datagrama e Instance adicionadas  (datagrama para guardar as informaçoes recebidas no datagrama (que pode so ter parte da informaçao de uma instancia; instancias para guardar os dados enviados)
 * <br/>
 * <br/>
 */

package csheets.userstories.us083;
