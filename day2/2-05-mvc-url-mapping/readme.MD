http://localhost:8080/mapping/path
http://localhost:8080/mapping/path/test

http://localhost:8080/mapping/parameter?foo=FOO

http://localhost:8080/mapping/parameter?aaa=FOO

http://localhost:8080/mapping/pathVariable/aaa

curl -H "FooHeader: foo" http://localhost:8080/mapping/header

curl -H "BuuHeader: foo" http://localhost:8080/mapping/header

http://localhost:8080/mapping/headerDefault

curl -v --cookie "openid_provider=SPRING" http://localhost:8080/mapping/cookie

curl -X POST -d "body=akuku" http://localhost:8080/mapping/body



