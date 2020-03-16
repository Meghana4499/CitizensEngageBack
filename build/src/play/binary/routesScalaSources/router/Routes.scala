// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/macadmin/Downloads/Backend 05-03-2020/conf/routes
// @DATE:Tue Mar 10 14:26:50 IST 2020

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:1
  HomeController_2: controllers.HomeController,
  // @LINE:2
  UserController_4: controllers.UserController,
  // @LINE:4
  ComplaintController_3: controllers.ComplaintController,
  // @LINE:18
  AdminController_0: controllers.AdminController,
  // @LINE:20
  WardController_1: controllers.WardController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:1
    HomeController_2: controllers.HomeController,
    // @LINE:2
    UserController_4: controllers.UserController,
    // @LINE:4
    ComplaintController_3: controllers.ComplaintController,
    // @LINE:18
    AdminController_0: controllers.AdminController,
    // @LINE:20
    WardController_1: controllers.WardController
  ) = this(errorHandler, HomeController_2, UserController_4, ComplaintController_3, AdminController_0, WardController_1, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_2, UserController_4, ComplaintController_3, AdminController_0, WardController_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register""", """controllers.UserController.addUser"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getUsers""", """controllers.UserController.getUsers"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """complaint""", """controllers.ComplaintController.addComplaint"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getComplaints""", """controllers.ComplaintController.getComplaints"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.UserController.login"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """details""", """controllers.UserController.profile"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pendingComplaints""", """controllers.ComplaintController.getPendingComplaints"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """closedComplaints""", """controllers.ComplaintController.getClosedComplaints"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """userAllComplaints""", """controllers.ComplaintController.getUserComplaints"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """userPendingComplaints""", """controllers.ComplaintController.getUserPendingComplaints"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """userClosedComplaints""", """controllers.ComplaintController.getUserClosedComplaints"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """userleaderboard""", """controllers.ComplaintController.getUserLeaderboard"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """viewandclose""", """controllers.ComplaintController.viewAndClose"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """recentlycreated""", """controllers.ComplaintController.getRecentlyCreated"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """recentlyclosed""", """controllers.ComplaintController.getRecentlyClosed"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """editprofile""", """controllers.UserController.editProfile"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """adminlogin""", """controllers.AdminController.login"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """statusPendingComplaints""", """controllers.ComplaintController.getStatusPendingComplaints"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """wardlogin""", """controllers.WardController.login"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """wardComplaints""", """controllers.ComplaintController.getWardComplaints"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """wardclosed""", """controllers.ComplaintController.getWardClosedComplaints"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """wardpending""", """controllers.ComplaintController.getWardPendingComplaints"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:1
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_2.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """""",
      Seq()
    )
  )

  // @LINE:2
  private[this] lazy val controllers_UserController_addUser1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_UserController_addUser1_invoker = createInvoker(
    UserController_4.addUser,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "addUser",
      Nil,
      "POST",
      this.prefix + """register""",
      """""",
      Seq()
    )
  )

  // @LINE:3
  private[this] lazy val controllers_UserController_getUsers2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getUsers")))
  )
  private[this] lazy val controllers_UserController_getUsers2_invoker = createInvoker(
    UserController_4.getUsers,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "getUsers",
      Nil,
      "GET",
      this.prefix + """getUsers""",
      """""",
      Seq()
    )
  )

  // @LINE:4
  private[this] lazy val controllers_ComplaintController_addComplaint3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("complaint")))
  )
  private[this] lazy val controllers_ComplaintController_addComplaint3_invoker = createInvoker(
    ComplaintController_3.addComplaint,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ComplaintController",
      "addComplaint",
      Nil,
      "POST",
      this.prefix + """complaint""",
      """""",
      Seq()
    )
  )

  // @LINE:5
  private[this] lazy val controllers_ComplaintController_getComplaints4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getComplaints")))
  )
  private[this] lazy val controllers_ComplaintController_getComplaints4_invoker = createInvoker(
    ComplaintController_3.getComplaints,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ComplaintController",
      "getComplaints",
      Nil,
      "GET",
      this.prefix + """getComplaints""",
      """""",
      Seq()
    )
  )

  // @LINE:6
  private[this] lazy val controllers_UserController_login5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_UserController_login5_invoker = createInvoker(
    UserController_4.login,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "login",
      Nil,
      "POST",
      this.prefix + """login""",
      """""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_UserController_profile6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("details")))
  )
  private[this] lazy val controllers_UserController_profile6_invoker = createInvoker(
    UserController_4.profile,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "profile",
      Nil,
      "POST",
      this.prefix + """details""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_ComplaintController_getPendingComplaints7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pendingComplaints")))
  )
  private[this] lazy val controllers_ComplaintController_getPendingComplaints7_invoker = createInvoker(
    ComplaintController_3.getPendingComplaints,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ComplaintController",
      "getPendingComplaints",
      Nil,
      "GET",
      this.prefix + """pendingComplaints""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_ComplaintController_getClosedComplaints8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("closedComplaints")))
  )
  private[this] lazy val controllers_ComplaintController_getClosedComplaints8_invoker = createInvoker(
    ComplaintController_3.getClosedComplaints,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ComplaintController",
      "getClosedComplaints",
      Nil,
      "GET",
      this.prefix + """closedComplaints""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_ComplaintController_getUserComplaints9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("userAllComplaints")))
  )
  private[this] lazy val controllers_ComplaintController_getUserComplaints9_invoker = createInvoker(
    ComplaintController_3.getUserComplaints,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ComplaintController",
      "getUserComplaints",
      Nil,
      "POST",
      this.prefix + """userAllComplaints""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_ComplaintController_getUserPendingComplaints10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("userPendingComplaints")))
  )
  private[this] lazy val controllers_ComplaintController_getUserPendingComplaints10_invoker = createInvoker(
    ComplaintController_3.getUserPendingComplaints,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ComplaintController",
      "getUserPendingComplaints",
      Nil,
      "POST",
      this.prefix + """userPendingComplaints""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_ComplaintController_getUserClosedComplaints11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("userClosedComplaints")))
  )
  private[this] lazy val controllers_ComplaintController_getUserClosedComplaints11_invoker = createInvoker(
    ComplaintController_3.getUserClosedComplaints,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ComplaintController",
      "getUserClosedComplaints",
      Nil,
      "POST",
      this.prefix + """userClosedComplaints""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_ComplaintController_getUserLeaderboard12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("userleaderboard")))
  )
  private[this] lazy val controllers_ComplaintController_getUserLeaderboard12_invoker = createInvoker(
    ComplaintController_3.getUserLeaderboard,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ComplaintController",
      "getUserLeaderboard",
      Nil,
      "GET",
      this.prefix + """userleaderboard""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_ComplaintController_viewAndClose13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("viewandclose")))
  )
  private[this] lazy val controllers_ComplaintController_viewAndClose13_invoker = createInvoker(
    ComplaintController_3.viewAndClose,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ComplaintController",
      "viewAndClose",
      Nil,
      "POST",
      this.prefix + """viewandclose""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_ComplaintController_getRecentlyCreated14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("recentlycreated")))
  )
  private[this] lazy val controllers_ComplaintController_getRecentlyCreated14_invoker = createInvoker(
    ComplaintController_3.getRecentlyCreated,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ComplaintController",
      "getRecentlyCreated",
      Nil,
      "POST",
      this.prefix + """recentlycreated""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_ComplaintController_getRecentlyClosed15_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("recentlyclosed")))
  )
  private[this] lazy val controllers_ComplaintController_getRecentlyClosed15_invoker = createInvoker(
    ComplaintController_3.getRecentlyClosed,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ComplaintController",
      "getRecentlyClosed",
      Nil,
      "POST",
      this.prefix + """recentlyclosed""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_UserController_editProfile16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("editprofile")))
  )
  private[this] lazy val controllers_UserController_editProfile16_invoker = createInvoker(
    UserController_4.editProfile,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "editProfile",
      Nil,
      "POST",
      this.prefix + """editprofile""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_AdminController_login17_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adminlogin")))
  )
  private[this] lazy val controllers_AdminController_login17_invoker = createInvoker(
    AdminController_0.login,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "login",
      Nil,
      "POST",
      this.prefix + """adminlogin""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_ComplaintController_getStatusPendingComplaints18_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("statusPendingComplaints")))
  )
  private[this] lazy val controllers_ComplaintController_getStatusPendingComplaints18_invoker = createInvoker(
    ComplaintController_3.getStatusPendingComplaints,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ComplaintController",
      "getStatusPendingComplaints",
      Nil,
      "POST",
      this.prefix + """statusPendingComplaints""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_WardController_login19_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("wardlogin")))
  )
  private[this] lazy val controllers_WardController_login19_invoker = createInvoker(
    WardController_1.login,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WardController",
      "login",
      Nil,
      "POST",
      this.prefix + """wardlogin""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_ComplaintController_getWardComplaints20_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("wardComplaints")))
  )
  private[this] lazy val controllers_ComplaintController_getWardComplaints20_invoker = createInvoker(
    ComplaintController_3.getWardComplaints,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ComplaintController",
      "getWardComplaints",
      Nil,
      "POST",
      this.prefix + """wardComplaints""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_ComplaintController_getWardClosedComplaints21_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("wardclosed")))
  )
  private[this] lazy val controllers_ComplaintController_getWardClosedComplaints21_invoker = createInvoker(
    ComplaintController_3.getWardClosedComplaints,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ComplaintController",
      "getWardClosedComplaints",
      Nil,
      "POST",
      this.prefix + """wardclosed""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_ComplaintController_getWardPendingComplaints22_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("wardpending")))
  )
  private[this] lazy val controllers_ComplaintController_getWardPendingComplaints22_invoker = createInvoker(
    ComplaintController_3.getWardPendingComplaints,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ComplaintController",
      "getWardPendingComplaints",
      Nil,
      "POST",
      this.prefix + """wardpending""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:1
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_2.index)
      }
  
    // @LINE:2
    case controllers_UserController_addUser1_route(params@_) =>
      call { 
        controllers_UserController_addUser1_invoker.call(UserController_4.addUser)
      }
  
    // @LINE:3
    case controllers_UserController_getUsers2_route(params@_) =>
      call { 
        controllers_UserController_getUsers2_invoker.call(UserController_4.getUsers)
      }
  
    // @LINE:4
    case controllers_ComplaintController_addComplaint3_route(params@_) =>
      call { 
        controllers_ComplaintController_addComplaint3_invoker.call(ComplaintController_3.addComplaint)
      }
  
    // @LINE:5
    case controllers_ComplaintController_getComplaints4_route(params@_) =>
      call { 
        controllers_ComplaintController_getComplaints4_invoker.call(ComplaintController_3.getComplaints)
      }
  
    // @LINE:6
    case controllers_UserController_login5_route(params@_) =>
      call { 
        controllers_UserController_login5_invoker.call(UserController_4.login)
      }
  
    // @LINE:7
    case controllers_UserController_profile6_route(params@_) =>
      call { 
        controllers_UserController_profile6_invoker.call(UserController_4.profile)
      }
  
    // @LINE:8
    case controllers_ComplaintController_getPendingComplaints7_route(params@_) =>
      call { 
        controllers_ComplaintController_getPendingComplaints7_invoker.call(ComplaintController_3.getPendingComplaints)
      }
  
    // @LINE:9
    case controllers_ComplaintController_getClosedComplaints8_route(params@_) =>
      call { 
        controllers_ComplaintController_getClosedComplaints8_invoker.call(ComplaintController_3.getClosedComplaints)
      }
  
    // @LINE:10
    case controllers_ComplaintController_getUserComplaints9_route(params@_) =>
      call { 
        controllers_ComplaintController_getUserComplaints9_invoker.call(ComplaintController_3.getUserComplaints)
      }
  
    // @LINE:11
    case controllers_ComplaintController_getUserPendingComplaints10_route(params@_) =>
      call { 
        controllers_ComplaintController_getUserPendingComplaints10_invoker.call(ComplaintController_3.getUserPendingComplaints)
      }
  
    // @LINE:12
    case controllers_ComplaintController_getUserClosedComplaints11_route(params@_) =>
      call { 
        controllers_ComplaintController_getUserClosedComplaints11_invoker.call(ComplaintController_3.getUserClosedComplaints)
      }
  
    // @LINE:13
    case controllers_ComplaintController_getUserLeaderboard12_route(params@_) =>
      call { 
        controllers_ComplaintController_getUserLeaderboard12_invoker.call(ComplaintController_3.getUserLeaderboard)
      }
  
    // @LINE:14
    case controllers_ComplaintController_viewAndClose13_route(params@_) =>
      call { 
        controllers_ComplaintController_viewAndClose13_invoker.call(ComplaintController_3.viewAndClose)
      }
  
    // @LINE:15
    case controllers_ComplaintController_getRecentlyCreated14_route(params@_) =>
      call { 
        controllers_ComplaintController_getRecentlyCreated14_invoker.call(ComplaintController_3.getRecentlyCreated)
      }
  
    // @LINE:16
    case controllers_ComplaintController_getRecentlyClosed15_route(params@_) =>
      call { 
        controllers_ComplaintController_getRecentlyClosed15_invoker.call(ComplaintController_3.getRecentlyClosed)
      }
  
    // @LINE:17
    case controllers_UserController_editProfile16_route(params@_) =>
      call { 
        controllers_UserController_editProfile16_invoker.call(UserController_4.editProfile)
      }
  
    // @LINE:18
    case controllers_AdminController_login17_route(params@_) =>
      call { 
        controllers_AdminController_login17_invoker.call(AdminController_0.login)
      }
  
    // @LINE:19
    case controllers_ComplaintController_getStatusPendingComplaints18_route(params@_) =>
      call { 
        controllers_ComplaintController_getStatusPendingComplaints18_invoker.call(ComplaintController_3.getStatusPendingComplaints)
      }
  
    // @LINE:20
    case controllers_WardController_login19_route(params@_) =>
      call { 
        controllers_WardController_login19_invoker.call(WardController_1.login)
      }
  
    // @LINE:21
    case controllers_ComplaintController_getWardComplaints20_route(params@_) =>
      call { 
        controllers_ComplaintController_getWardComplaints20_invoker.call(ComplaintController_3.getWardComplaints)
      }
  
    // @LINE:22
    case controllers_ComplaintController_getWardClosedComplaints21_route(params@_) =>
      call { 
        controllers_ComplaintController_getWardClosedComplaints21_invoker.call(ComplaintController_3.getWardClosedComplaints)
      }
  
    // @LINE:23
    case controllers_ComplaintController_getWardPendingComplaints22_route(params@_) =>
      call { 
        controllers_ComplaintController_getWardPendingComplaints22_invoker.call(ComplaintController_3.getWardPendingComplaints)
      }
  }
}
