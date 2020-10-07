package controllers

import javax.inject.Inject
import play.api.mvc._
import play.api._

import scala.concurrent._

class HomeController @Inject()(val controllerComponents: ControllerComponents) (implicit assetsFinder: AssetsFinder) extends BaseController {

  def action: Action[AnyContent] = Action { implicit request =>
    val r: Result =Ok(views.html.welcome("user"))
    r
  }

  def asyncIndex: Action[AnyContent] = Action.async { implicit request =>
    val r: Future[Result] = Future.successful(Ok(views.html.welcome("user")))
    r
  }
}