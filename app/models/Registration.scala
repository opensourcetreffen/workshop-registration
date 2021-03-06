package models

import play.api.libs.json.Json

case class Registration(id: Long, name: String, email: String, workshopId: Long)

object Registration {
  implicit val registrationFormat = Json.format[Registration]
}

