# Advanced-Object-Oriented-Programming
# QUIZ 5
For this question, the server contains the id, name and cgpa of some Students in a file. The client will request the server for specific data, which the server will provide to the client. 


Server: The server contains the data of some Students. For each student, the server contains id, name and cgpa data in a file. Here's an example of the file:

data.txt
101 Saif 3.52
201 Hasan 3.81
....

Create a similar file in you server side. The file should have at least 8 students.

The client will request the server to provide the details (id, name, cgpa) of the Nth highest cgpa student in the file.
If N's value is 1, the server will return the details of the student with the highest cgpa.  
if N's value is 3, the server will return the details of the student with the third highest cgpa. 

If N's value is incorrect, the server returns to the client: "Invalid request".



Client: 

The client sends the server the value of N, which is an integer number. The client takes input the value of N from the console. Then the client shows the result (the server output) in the console. 
