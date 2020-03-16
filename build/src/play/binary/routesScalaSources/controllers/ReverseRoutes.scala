// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/macadmin/Downloads/Backend 05-03-2020/conf/routes
// @DATE:Tue Mar 10 14:26:50 IST 2020

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:1
package controllers {

  // @LINE:18
  class ReverseAdminController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def login(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "adminlogin")
    }
  
  }

  // @LINE:2
  class ReverseUserController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:2
    def addUser(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "register")
    }
  
    // @LINE:7
    def profile(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "details")
    }
  
    // @LINE:3
    def getUsers(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "getUsers")
    }
  
    // @LINE:17
    def editProfile(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "editprofile")
    }
  
    // @LINE:6
    def login(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "login")
    }
  
  }

  // @LINE:1
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:1
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:4
  class ReverseComplaintController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:5
    def getComplaints(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "getComplaints")
    }
  
    // @LINE:8
    def getPendingComplaints(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "pendingComplaints")
    }
  
    // @LINE:23
    def getWardPendingComplaints(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "wardpending")
    }
  
    // @LINE:9
    def getClosedComplaints(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "closedComplaints")
    }
  
    // @LINE:16
    def getRecentlyClosed(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "recentlyclosed")
    }
  
    // @LINE:12
    def getUserClosedComplaints(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "userClosedComplaints")
    }
  
    // @LINE:14
    def viewAndClose(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "viewandclose")
    }
  
    // @LINE:19
    def getStatusPendingComplaints(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "statusPendingComplaints")
    }
  
    // @LINE:11
    def getUserPendingComplaints(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "userPendingComplaints")
    }
  
    // @LINE:21
    def getWardComplaints(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "wardComplaints")
    }
  
    // @LINE:22
    def getWardClosedComplaints(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "wardclosed")
    }
  
    // @LINE:15
    def getRecentlyCreated(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "recentlycreated")
    }
  
    // @LINE:4
    def addComplaint(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "complaint")
    }
  
    // @LINE:10
    def getUserComplaints(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "userAllComplaints")
    }
  
    // @LINE:13
    def getUserLeaderboard(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "userleaderboard")
    }
  
  }

  // @LINE:20
  class ReverseWardController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def login(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "wardlogin")
    }
  
  }


}
