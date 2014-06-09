/**
 * Documentacao tecnica da user story 074 : Exportacão Paralela 
 * <br/>
 * <br/>
 * 
 * <b>Requirement</b><br/>
 *  A exportação de dados deve ser efectuada em “paralelo”. Deve ser
 *  possível definir os caracteres separadores de campo e se existe
 *  linha cabeçalho ou não.
 * <br/>
 * <br/>
 *  
 * <b>S074a: Analysis</b><br/>
 * Devera ser usado threads para a exportacao paralela do ficheiro
 * Devera ser criada uma opcao para defenir o caracter separador de dados
 * Devera ser criada a opcao para definir se existe linha de cabecalho e qual 
 * será este cabacalho caso exista
 * Sera criada uma janela com as opcoes novas, e criada a exportacacao usando 
 * as threads necessarias para um bom funcionamento em paralelo, havendo tambem 
 * sincronizacao entre as threads para nao haver alteracao dos dados
 * 
 * <br/>
 * <br/>
 * 
 * <b>S074d: Design</b><br/>
 *
 * 
 * 
 * <br/>
 * <br/>
 * <img src="../../../csheets/userstories/us034/doc-files/us074_design1.png"> 
 * <br/>
 * <br/>
 * 
 * <b>S074c: Coding</b><br/>
 * <br/>
 * <br/>
 * <br/>
 * 
 * <b>S074u: Unit Tests</b><br/>
 * <br/>
 * <br/>
 * <br/>
 * 
 * <b>S074f: Functional Tests</b><br/>
 * <br/>
 * <br/>
 * <br/>
 * 
 * @author JSilva314 - 1040314 - João Paulo Silva
 */
/*
 *
  @startuml doc-files/us074_design1.png
    
  @enduml
 *
 */
package csheets.userstories.us074;