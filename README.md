# RabbitMQ
There are 2 services
1: Order Service
2: Notification Service
These two services are communicating using RabbitMQ

For communication spring boot provides abstraction layer that is spring cloud stream
3 pillars of spring cloud stream 
1:Binder - dependency added in pom.xml
2:Bindings - property
3: Message 
StreamBridge is readymade object provided by the spring cloud stream 

Producer:
Step1: Configure RabbitMQ property host, port, username, password
Step2: Configure Output Binding property
Step3: Send message using streamBridge

Consumer/Listener
Step1: Configure RabbitMQ property host, port, username, password
Step2: Configure Input Binding property + cloud function property
Step3: create bean with springcloud function(name of function = input binding name)
