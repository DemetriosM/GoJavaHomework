﻿TASK 1
Class User class that should contain fields

long id
String firstName
String lastName
String city
int balance

Class Order:

long id
int price
Currency currency
String itemName
String shopIdentificator
User user

TASK 2
Create Main class where you create 10 Orders with 10 Users and put it to the List

- sort list by Order price in decrease order
- sort list by Order price in increase order AND User city
- sort list by Order itemName AND ShopIdentificator AND User city
Extra (optional):
- delete duplicates from the list
- delete items where price less than 1500
- separate list for two list - orders in USD and UAH
- separate list for as many lists as many unique cities are in User

TASK 3
Create Main class where you create 10 Orders with 10 Users and put it to the TreeSet. You should create 8 unique and
two duplicated Orders
- check if set contain Order where User’s lastName is - “Petrov”
- print Order with largest price using only one set method - get 
- delete orders where currency is USD using Iterator

TASK 4
Generate Integer and String ArrayList and LinkedList with 1000 and 10000 elements. Measure time of execution of the
following methods and print it to console:
- add
- set
- get
- remove
