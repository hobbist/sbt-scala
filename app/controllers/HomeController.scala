package controllers

import javax.inject.Inject
import play.api.mvc._

import scala.concurrent._

class HomeController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  def action: Action[AnyContent] = Action { implicit request =>
    val r: Result = Ok("hello world")
    r
  }

  def asyncIndex: Action[AnyContent] = Action.async { implicit request =>
    val r: Future[Result] = Future.successful(Ok("hello world"))
    r
  }
}