You need to create part of the System that can find hotel rooms for booking and save it to DataBase. The architecture is: class Room which represent room entity that is used in system. Interface API and three implementations of it. DAO interface with its implementation. And finally Controller that will contain all the logic. Also create Main class with main method to demonstrate results.
Create UML diagrams first, and only after this write code.

TASK 1
Class Room should contain fields
long id
int price 
int persons
Date dateAvailableFrom
String hotelName
String cityName
Generate getters and setters. And create constructor with all fields.

TASK 2
Override equals and hashCode methods. Rooms are equal when price, persons and cityName are equal.
TASK  3
Create API interface which contains one method
Room[] findRooms(int price, int persons, String city, String hotel)

TASK 4
 
Create three implementations of API called: BookingComAPI, TripAdvisorAPI, GoogleAPI. Every implementation has global variable Room[] rooms which must be initialized in empty constructor with 5 differentRooms.
 
TASK 5
Create DAO interface and its implementation. Methods print operation name and object which was used.  
Room save(Room room)
boolean delete(Room room)
Room update(Room room)
Room findById(long id)

TASK 6
Create Controller class. It contains global variable
API apis[] = new API[3];
which contains all impelentations of API interface.  
Also, controller contains two methods
Room[] requstRooms(int price, int persons, String city, String hotel)
which finds all the rooms with requested params. Method use all apis available to make search.
Found rooms create to DB
Room[] check(API api1, API api2)
Chech how many the same rooms two different apis return

TASK 7
In Main class method just create Controller and make three requests with different parameters to find rooms. Also, all check methods three times with different apis to demonstrate how programs works.


Дополнительные задания

TASK 8
Make implementation of DAO. Assume that our db is an array with 10 elements
save - adds room to arra
delete - deletes rooms from array
update - updates room in array (find room to update by id)
find by id - find room in array

TASK 9
Add method to DAO interface it and implement
Room[] getAll() - return array of all rooms that are in our DB array

TASK 10
Add to Controller class methods which will do following operations with our DB emulator
Room save(Room room)
boolean delete(Room room)
Room update(Room room)
Room findById(long id)