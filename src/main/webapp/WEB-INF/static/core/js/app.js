$app = angular.module('app',[ ]);

$app.config(function($routeProvider) {
	
	$routeProvider.
		when('/', 			 {controller: listController, templateUrl: '/revendaveiculos/list'}).
		when('/veiculo/:id', {controller: viewController, templateUrl: '/revendaveiculos/view'}).
		
		when('/marca/get/list', {controller: marcaListController, templateUrl: '/revendaveiculos/marca/get/list'}).
		when('/marca/:id',      {controller: marcaController,     templateUrl: '/revendaveiculos/marca/view'}).
		
		otherwise({redirectTo:'/'});
	
});

$app.run(function($rootScope) {
	$rootScope.veiculos = [{id: 1, placa: 'EVB5455'}, {id: 2, placa: 'SDC3265'}];
});

function listController($scope) {

}

function viewController($scope, $location, $routeParams) {
	
	 $scope.title = "Veiculo ";
	 $scope.veiculoId = $routeParams.id;
	
	 //$scope.veiculoIndex = $scope.veiculos.indexOf($scope.veiculo);
	
	 $scope.save = function(){
		 //$scope.fruits[$scope.fruitIndex]=$scope.fruit;
	 	$location.path('/');
	 };
}

function marcaListController($scope, $location, $routeParams, $http) {
	$http.get('/revendaveiculos/marca/get/list/json').success(function(data){
		$scope.marcas = data; 
	});	
}

function marcaController($scope, $location, $routeParams, $http) {
	$http.get('/revendaveiculos/marca/'+$routeParams.id+"/json").success(function(data){
		$scope.marca = data; 
	});	
}
