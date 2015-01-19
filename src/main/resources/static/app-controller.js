/**
 * Created by andrew on 6/01/15.
 */

function MainCtrl ($scope) { 
    $scope.title = "Scala Web Template";
} 

function MainTabs ($scope, $window,$sce) {
    //Not used at the moment
}

// Add controllers to the app
angular 
    .module(mainAppName) 
    .controller('MainCtrl', MainCtrl)
    .controller('MainTabs', MainTabs);
