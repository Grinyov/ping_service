/**
 * Created by vgrinyov
 *
*/
var app = angular.module("pingutil", []);

app.controller("AppCtrl", function ($scope, $http) {
   $scope.hosts = [];

    $http.get('http://localhost:8088/api/list').success(function (data) {

       $scope.hosts = data;
    });
});

