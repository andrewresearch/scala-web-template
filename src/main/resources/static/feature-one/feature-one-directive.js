/**
 * Created by Andrew Gibson on 19/01/15.
 */

function featureOneDirective () {
    return {
        restrict: "E",
        replace: true,
        templateUrl: "feature-one/feature-one.html"
        //template: ""
    };
}

// Add directive to the app
angular
    .module(mainAppName)
    .directive("featureOne",featureOneDirective);