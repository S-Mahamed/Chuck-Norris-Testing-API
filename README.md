# Chuck-Norris-Testing-API
API Testing Framework for Chuck Norris
***********************************************
this framework is to test the Chuck Norris API. 

There are ready made methods in the DTO that would be called when testing. 

These methods would be tested using JSON. 

The test section also has a section for testing the headers and the status code.

This was done using REST Assured.

Therefore dependencies would have to be added before using this framework. 

To store the data acquired from the HTTP request made, 
a POJO class made of just objects has been created. 

An object mapper using Jackson has been used in the chuck Reader to get all  these objects. 

A DTO connects this reader class to the tester so that only what is being tested neededs to be present in the tester. 

Postman was used to interrogate the API and get the headers. 
github and intellij were used to manage all the tasks of this project. 
