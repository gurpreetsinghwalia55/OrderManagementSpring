# Order Management System Using Spring
This webservice is developed using Spring, Hibernate and Apache Derby. This webervice provides the following capabilities.
* Create Orders.
* View the List of orders Created.
* Get the details of a particular Order given order id.

Since Apache Derby is an in-memory database make sure to create order first before viewing the orders.

#Running the Webservice
To run the webservice run the jar file named "demo-0.0.1-SNAPSHOT.jar" int the target directory using the command 
```
java -jar demo-0.0.1-SNAPSHOT.jar
```
Once the webservice is up and running you can now play with webservice.

# Create Order(POST request)
To create a POST request run the following curl script on your terminal
```
curl --location --request POST 'localhost:8080/orders/' \
--header 'Content-Type: application/json' \
--header 'Content-Type: text/plain' \
--data-raw '{
    "price": "10",
    "quantity": "10",
    "orderTotal": "10",
    "itemName": "Milk",
    "customerName" : "Gurpreet",
    "customerAddress" : "Kapurthala"
}'
```
# View the Details of orders Created
To view the list of orders created run the following command on your terminal
```
curl localhost:8080/orders/ 
```

# Get the details of a particular Order given order id.
To view the details of a particular order given the order id run the following command on your terminal
```
curl localhost:8080/orders/{orderid}
```
Make sure to replace {orderid} with an valid order id
