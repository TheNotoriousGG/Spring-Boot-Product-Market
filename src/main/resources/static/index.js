angular.module('app', []).controller('indexController', function ($scope, $http) {
    const contextPath = 'http://localhost:8189/app';

    $scope.loadProducts = function () {
        $http.get(contextPath + '/product/findAll')
            .then(function (response) {
                $scope.productList = response.data;
            });
    };

    $scope.changeCost = function (clientId, delta){
        $http({
            url: contextPath + '/product/change_cost',
            method: 'GET',
            params: {
                productId: clientId,
                delta: delta
            }
        }).then(function (response){
            $scope.loadProducts();
        });
    };

    $scope.loadProducts();

});