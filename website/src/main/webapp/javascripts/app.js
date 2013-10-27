/**
 * Created by arvange on 23/10/13.
 */

var app = angular.module('app', [])


app.config(function($routeProvider) {
  $routeProvider
    .when('/', {
      templateUrl: '/views/home.html',
      controller: 'HelloCtrl'
    })
})

app.controller('HelloCtrl', function($scope) {
	$scope.message = "Hello, This is a Scalatra - AngularJS template"
})