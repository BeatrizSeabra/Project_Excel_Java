/**
 * Technical documentation regarding the user story 010: activate and deactivate extensions. 
 * <br/>
 * <br/>
 * 
 * <b>Requirement</b><br/>
 * Disponibilizar uma janela que permita activar e desactivar extensões do cleansheets.
 * <br/>
 * <br/>
 *  
 * <b>S010a: Analysis</b><br/>
 * User Story 010 tem como principal objectivo organizar as extensões existentes na aplicação. Uma nova janela que possuirá
 * uma lista de todas as extensões existentes na aplicação, indicando a frente o seu "estado" (Activo / Não activo), assim o utilizador pode seleccionar
 * as extenções que posteriormente aparecerão no separador "Extensions" e desactivar outras que por sua vez serão omitidos dessa lista de extenções.
 * Para o desenvolvimento dessa funcionalidade serão usadas as classes já existentes "ExtensionManager" e "Extension" que
 * irão forncer a Lista de Extenções e as Propriedades de Extenção (nome, etc), correspondentemente. 
 * <br/>
 * <br/>
 *  
 * <b>S010d: Design</b><br/>
 * Para a realização deste User Story será necessário acrescentar métodos à classe ExtensionManager e criar classe UIExtensionManager. 
 * Para criar uma nova janela, onde as propriedades (Activo / Não activo) possam ser alteradas será necessário criar um JPanel.<br/>
 * O diagrama abaixo apresentado descreve o processo de interação das classes do cleansheets utilizadas para o desenvolvimento do US010.<br/><br/>
 * <img src="../../../csheets/userstories/us010/doc-files/us010_design1.png"> 
 * <br/>
 * <br/>
 * @author Oleh Yermak (1120622)
 * */

/*
*
@startuml doc-files/us010_design1.png
actor User
 participant JPanel as JP
 participant ExtensionManager as EM
 participant Extencion as EX
 participant UIExtencion as UIEX


 User -> JP : manageExtencion()
 JP -> EM : getExtensions()
loop for Extension ext : extensions
 JP -> EM : getExtension(ext.getName())
 JP -> EX : getStatus(ext); 
end
alt result==changed
   JP -> UIEX : setEnabledProperty(extension)
  else
  end
 
@enduml
*
*/

package csheets.userstories.us010;