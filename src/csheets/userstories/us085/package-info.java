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
 * <b>S085d: Design</b><br/>
 * Tecnico:
 *      Integração com o cleansheets
 *      - Informar o ExtensionManager de que existe uma nova extensão.
 *          Para atingirmos este objectivo, o ficheiro extensions.props tem de ser editado para carregar a extensão quando a aplicação é iniciada.
 *      - Criar a class coorespondente à minha extensão
 *          Esta class deve ser subclass de <code>Extensible</code>.
 *      - O seguinte diagrama mostra o processo de integração depois dos passos a cima terem sido concluidos.
 *          <img src="../../../csheets/userstories/us085/doc-files/us085_design1.png"> 
 * 
 * 
 *      Extenção em si
 *      - inicializar os GUI e eventos.
 *      - Inicializar as funcionalidades de connecção em rede.
 *          enviar uma mensagem em broadcast e contar o numero de respostas.
 *          no caso de não haver resposta este jogador passa a ser o servidor.
 *          no caso de haver resposta(s) este jogador é um cliente.
 *      - Establecer connecção com outro jogador.
 *          (opcional)ofrecer suporte para conectar por IP
 *          no caso de só haver um jogador, ele fica como servidor e espera que alguem entre em contacto.
 *          no caos de haver mais do que 2 jogadores, os restantes ficam como espectadores.
 *      - Preparar jogo, jogadores e espetadores
 *          escolher o jogo, os jogadores e espetadores se necessario.
 *      - Iniciar o jogo e emitir-lo para todos os jogadores.
 *      - Noção de Lobby e Jogo
 *          quando o jogo termina voltamos para o lobby onde se repetem passos a cima.
 * 
 * Grafico:
 *      -Lobby mockup:
 *      <img src="../../../csheets/userstories/us085/doc-files/LobbyMockup.png"> 
 * 
 * 
 * 
 * 
 * <br/>
 * <br/>
 * 
 * 
 * @author 1120588
 */

package csheets.userstories.us085;