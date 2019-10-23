```
#run
mvn tomcat7:run
```

## browse 
{[http://localhost:8080/springrest/customers],methods=[GET]} 
{[http://localhost:8080/springrest/customers/{id}],methods=[GET]} 
{[http://localhost:8080/springrest/customers/{id}],methods=[DELETE]} 
{[http://localhost:8080/springrest/customers/{id}],methods=[PUT]} 
{[http://localhost:8080/springrest/customers],methods=[POST]}
{[http://localhost:8080/springrest/metrics/{name:.*}],methods=[GET],produces=[application/json]} 
{[http://localhost:8080/springrest/metrics || /metrics.json],methods=[GET],produces=[application/json]} 
{[http://localhost:8080/springrest/beans || /beans.json],methods=[GET],produces=[application/json]} 
{[http://localhost:8080/springrest/trace || /trace.json],methods=[GET],produces=[application/json]} 
{[http://localhost:8080/springrest/env/{name:.*}],methods=[GET],produces=[application/json]} 
{[http://localhost:8080/springrest/env || /env.json],methods=[GET],produces=[application/json]} 
{[http://localhost:8080/springrest/mappings || /mappings.json],methods=[GET],produces=[application/json]} 
{[http://localhost:8080/springrest/configprops || /configprops.json],methods=[GET],produces=[application/json]}
{[http://localhost:8080/springrest/health || /health.json],produces=[application/json]} 
{[http://localhost:8080/springrest/info || /info.json],methods=[GET],produces=[application/json]}
{[http://localhost:8080/springrest/autoconfig || /autoconfig.json],methods=[GET],produces=[application/json]}
{[http://localhost:8080/springrest/dump || /dump.json],methods=[GET],produces=[application/json]}


