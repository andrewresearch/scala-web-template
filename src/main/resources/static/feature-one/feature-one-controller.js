/**
 * Created by andrew on 10/01/15.
 */

function featureOneCtrl($scope, $http) {

    $scope.message = "Feature One is still to be implemented."

    /*
    $scope.featureOneData;

    $scope.loadFeatureOneData = function() {
        var httpRequest = $http({
            method: 'GET',
            url: 'featureOneData',
            data: null

        }).success(function(data, status) {
            $scope.featureOneData = data;
        });

    };
    */

}

angular
    .module(mainAppName)
    .controller('featureOneCtrl', featureOneCtrl)