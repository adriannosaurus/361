#361

From January to April 2018, I had free reign to create a prototype of an application. I decided to design a prototype for a textbook price match application. The idea came to me at the beginning of the semester when I was trying to find the best places to order textbooks.

Working on a full-scale project independently is a huge milestone for me. This project has given me the freedom and flexibility to experience the entire development lifecycle from conception to working prototype, along with all of the challenges that I will face in the real world.

Below is a list of all of the classes in the project and a quick summary of what they do. All of the code was written by me. As I continue to build this project on my own time, though, I will likely integrate open source code to make the application more robust.

Book - Creates an object of type Book, where information is stored about each book in the system.

BookList - Contains a list of books. Future updates may see this stored in a database instead.

LoginC - Controller for the login flow, which entails authenticating users against the UserList.

LoginUI - Interface for the login screen.

LoginUIC - Controller for the login interface.

Main - Starts the application.

NewUserC - Controller for the new user flow, which entails adding new users to the UserList.

NewUserUI - Interface for the new user screen.

NewUserUIC - Controller for the new user interface.

ProfileC - Controller for the profile info, which entails updating information and managing bookmarks.

ProfileUI - Interface for the profile screen.

ProfileUIC - Controller for the profile interface.

SearchC - Controller for the search functionality, which entails searching the BookList for potential matches.

SearchUI - Interface for the search screen.

SearchUIC - Controller for the search interface.

User - Creates an object of type User, where information is stored about each user in the system.

UserList - Contains a list of users. Future updates may see this stored in a database instead.

It is also worth noting that there is a PersistentData class and an accompanying controller. That functionality is under construction but will be implemented in the near future.
