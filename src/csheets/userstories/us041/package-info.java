/*
 * Technical documentation regarding the user story 041: Wizard intermédio inserir função
 * <br/>
 * <br/>
 * 
 * <b>Requirement</b><br/>
 * Devem aparecer campos de entrada para cada parâ-metro para ajudar a preencher a função.
 * À medida que se preenchem os valores deve aparecer o possivel resultado na própria janela do wizard.
 * <br/>
 * <br/>
 * 
 * <b>S041a: Analysis</b><br/>
 * Dado que as diferentes funções têm diferentes parâmetros, será melhor criar uma janela nova ao se escolher a função (JButton Choose).
 * Na nova janela, terão de ser criados campos para introduzir os parâmetros, e um campo final em baixo onde aparecerá o resultado à medida que os parâmetros são introduzidos.
 * Dúvida: nova janela recebe a função seleccionada e apresenta os campos consoante a mesma, mas como? Usar um switch case não será a melhor abordagem.
 * <br/>
 * <br/>
 * 
 * <b>S041d:Design</b><br/>
 * Ao escolher a extensão Invoke Function -> Choose Function é aberta uma janela com uma combobox com a lista das funções, uma caixa de texto com a sintaxe da mesma (que é modificada quando se escolhe uma função diferente na combobox), e dois botões: Choose e Help.
 * Nesta user storie (que usa o que já foi feito noutra anterior adicionando-lhe mais algumas funcionalidades), serão adicionadas caixas de texto consoante os parâmetros da função seleccionada (na combobox, tal como anteriormente), e será adicionada uma label onde se mostrará o resultado preliminar da invocação da função com os parâmetros já introduzidos à medida que o utilizador os introduz.
 * Para isso, quando o utilizador carregar ENTER (depois de escrever na caixa de texto correspondente ao parâmetro da função) ou quando ele seleccionar a caixa de texto do parâmetro seguinte, o sistema verificará se há parâmetros anteriores em falta e caso isso não se verifique introduzirá automaticamente na label final o resultado da função com esses parâmetros.
 * <br/>
 * <br/>
 * 
 * @author 1120268
*/


package csheets.userstories.us041;
