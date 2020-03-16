// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/macadmin/Downloads/Backend 05-03-2020/conf/routes
// @DATE:Tue Mar 10 14:26:50 IST 2020

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:1
package controllers.javascript {

  // @LINE:18
  class ReverseAdminController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.login",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "adminlogin"})
        }
      """
    )
  
  }

  // @LINE:2
  class ReverseUserController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:2
    def addUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.addUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
        }
      """
    )
  
    // @LINE:7
    def profile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.profile",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "details"})
        }
      """
    )
  
    // @LINE:3
    def getUsers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.getUsers",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getUsers"})
        }
      """
    )
  
    // @LINE:17
    def editProfile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.editProfile",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "editprofile"})
        }
      """
    )
  
    // @LINE:6
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.login",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }

  // @LINE:1
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:1
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:4
  class ReverseComplaintController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:5
    def getComplaints: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ComplaintController.getComplaints",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getComplaints"})
        }
      """
    )
  
    // @LINE:8
    def getPendingComplaints: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ComplaintController.getPendingComplaints",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pendingComplaints"})
        }
      """
    )
  
    // @LINE:23
    def getWardPendingComplaints: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ComplaintController.getWardPendingComplaints",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "wardpending"})
        }
      """
    )
  
    // @LINE:9
    def getClosedComplaints: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ComplaintController.getClosedComplaints",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "closedComplaints"})
        }
      """
    )
  
    // @LINE:16
    def getRecentlyClosed: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ComplaintController.getRecentlyClosed",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "recentlyclosed"})
        }
      """
    )
  
    // @LINE:12
    def getUserClosedComplaints: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ComplaintController.getUserClosedComplaints",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "userClosedComplaints"})
        }
      """
    )
  
    // @LINE:14
    def viewAndClose: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ComplaintController.viewAndClose",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "viewandclose"})
        }
      """
    )
  
    // @LINE:19
    def getStatusPendingComplaints: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ComplaintController.getStatusPendingComplaints",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "statusPendingComplaints"})
        }
      """
    )
  
    // @LINE:11
    def getUserPendingComplaints: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ComplaintController.getUserPendingComplaints",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "userPendingComplaints"})
        }
      """
    )
  
    // @LINE:21
    def getWardComplaints: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ComplaintController.getWardComplaints",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "wardComplaints"})
        }
      """
    )
  
    // @LINE:22
    def getWardClosedComplaints: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ComplaintController.getWardClosedComplaints",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "wardclosed"})
        }
      """
    )
  
    // @LINE:15
    def getRecentlyCreated: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ComplaintController.getRecentlyCreated",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "recentlycreated"})
        }
      """
    )
  
    // @LINE:4
    def addComplaint: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ComplaintController.addComplaint",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "complaint"})
        }
      """
    )
  
    // @LINE:10
    def getUserComplaints: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ComplaintController.getUserComplaints",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "userAllComplaints"})
        }
      """
    )
  
    // @LINE:13
    def getUserLeaderboard: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ComplaintController.getUserLeaderboard",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "userleaderboard"})
        }
      """
    )
  
  }

  // @LINE:20
  class ReverseWardController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WardController.login",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "wardlogin"})
        }
      """
    )
  
  }


}
