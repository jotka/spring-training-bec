http://localhost:8080/responses/string
http://localhost:8080/responses/charset/accept
http://localhost:8080/responses/charset/produce
http://localhost:8080/responses/entity/status
http://localhost:8080/responses/entity/headers

curl -H "Accept: application/json" http://localhost:8080/responses/json

curl -H "Accept: application/xml" http://localhost:8080/responses/xml