
	<h3 class="text-info">Marcas = {{marcas.length}}  <small><a href="#/marca/nova">Nova</a></small>  </h3>
	
    <div class="col-sm-2" ng-repeat="m in marcas">
      
      	<div class="panel panel-default">
          <div class="panel-thumbnail"><center><img src="{{m.uriImage}}" class="img-responsive"></center></div>
          <div class="panel-body">
            <p class="lead text-center">
            	<a href="${pageContext.request.contextPath}/#/marca/{{m.id}}"> {{m.descricao}} </a>
            </p>
          </div>
        </div>
      
    </div><!--/col-->
    	
	