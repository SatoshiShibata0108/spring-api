API TEST
- curl http://localhost:8080/api/items
- curl http://localhost:8080/api/items -i -XPOST -H "Content-Type: application/json" -d "{\"name\":\"momo\",\"price\":\"1000\",\"imgPath\":\"peach.jpg\"}"
- curl http://localhost:8080/api/items/4 -i -XPUT -H "Content-Type: application/json" -d "{\"name\":\"momo\",\"price\":\"1000\",\"imgPath\":\"peach.jpg\"}"
- curl http://localhost:8080/api/items/1 -i -XDELETE