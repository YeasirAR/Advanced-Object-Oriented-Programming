#### Create a java socket program which has the following functionality:

## **Server:**
The server contains the **name** and **price** data of multiple items (at least 3). The server receives a request from the client with **name** and **quantity **data. The server finds the corresponding item (using the name provided by the client) and returns the client the total price of that item.
For example: Say the server has the item named **pen** and price **10**. The client requests the server with name** pen** of quantity **5**. Then the server should return to the client the total price of 5 pens, which is **50** (Server returns **50** to client).
If the **name** provided by the client is not found in the server, the server returns **not-found.**       

## **Client:** 
The client sends the server two values: item **name** and **quantity**. The server returns the **total price** of the given item quantity if the item is found. Otherwise, the server returns **not-found** to the client. The client shows the result provided by the server.   

Note that, this task does not require GUI (But you can use GUI in the client side).

Submission instruction: Submit the Server side and client side code in the text editor below. Comment Server / Client at the top of the code for clarity. Code must be indented. 