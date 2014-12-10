
	<h2>Veiculos ( {{veiculos.length}} )</h2>
	<ul>
		<li ng-repeat="v in veiculos"><a href="#/veiculo/{{v.id}}">{{v.placa}}</a></li>
	</ul>

	<a href="#/new">New</a>
	
	<a href="#/marca/get/list">Marcas</a>