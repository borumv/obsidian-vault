`curl -X GET https://api.twitter.com/2/tweets/search/stream/rules -H "Authorization: Bearer AAAAAAAAAAAAAAAAAAAAAAihdgEAAAAA4Rvdps9mYo8CVlBoNlXoXNt4j2c%3DT7gZcLYkYFvQDhi5ekIohi4kWTGuOx5PyOhvFCEpJlLmBgOdiW"` - получить все правила для стрим-потока


`curl -X POST "https://api.twitter.com/2/tweets/search/stream/rules?dry_run=true" -H "Authorization: Bearer AAAAAAAAAAAAAAAAAAAAAAihdgEAAAAA4Rvdps9mYo8CVlBoNlXoXNt4j2c%3DT7gZcLYkYFvQDhi5ekIohi4kWTGuOx5PyOhvFCEpJlLmBgOdiW" -H "Content-type: application/json" -d '{"delete":{"ids":["1541017170704060417"]}}'`