/**
 * Created by vgrinyov
 *
*/

var app = angular.module("pingutil", []);

app.controller("AppCtrl", function ($scope) {
   $scope.hosts = [{
       id: '1',
       host: "localhost",
       time: "0"
   }];
});

