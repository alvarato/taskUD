# taskUD24
request:
GET http://localhost:8181/empleados/findAll

PUT http://localhost:8181/empleados/delete3 -> id

PUT http://localhost:8181/empleados/new body: {"nombre": "alvaro","trabajo": "JEFE","salario": 50000}

PUT http://localhost:8181/empleados/update body: {"id":1,"nombre": "alvaro","trabajo": "JEFE","salario": 50000}

GET http://localhost:8181/empleados/findByJobjunior -> tipo de trabajo
