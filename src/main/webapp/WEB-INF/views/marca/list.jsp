
	<h2>Marcas  {{marcas.length}} </h2>
	<ul>
		<li ng-repeat="m in marcas"><a href="#/marca/{{m.id}}">{{m.descricao}}</a></li>
	</ul>

	<a href="#/marca/nova">Nova</a>