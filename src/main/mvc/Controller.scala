package mvc

import javafx.event.{ActionEvent, EventHandler}
import scalafx.beans.property.StringProperty
import mvc.Model

class Controller(inputDisplay: StringProperty, model: Model) extends EventHandler[ActionEvent] {

  override def handle(event: ActionEvent): Unit = {}

}
