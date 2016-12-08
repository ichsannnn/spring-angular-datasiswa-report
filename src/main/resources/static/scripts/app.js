angular.module('dataSiswa', ['ngRoute'])
        .config(function($routeProvider) {
            $routeProvider
                .when('/', {
                    templateUrl : "views/dashboard.html",
                    controller  : "dataController"
            })
});