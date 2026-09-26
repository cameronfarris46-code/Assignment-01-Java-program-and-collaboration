Assignment 1: Java program
and collaboration
CS3354
This is a group assignment.
You have been randomly assigned to a team on Canvas.
Contact your team members and collaborate to complete this program.
To collaborate with the code, a Github repository must be created and the other team
members must be added as collaborators.
Objective
Collaborate as a team to build a grocery management system using parallel arrays. You will
manage data across multiple arrays where the same index refers to the same item.
Team Roles & Git Workflow
Each student must create their own branch in Git, perform their task, and then merge it into the
main branch.
Tasks
The Task: Parallel Array Architecture
You will maintain the following data across three arrays in your main method:
• String[] itemNames = new String[10];
• double[] itemPrices = new double[10];
• int[] itemStocks = new int[10];
Task 1: Inventory Display
Branch: feature-display
Method: public static void printInventory(String[] names, double[] prices, int[] stocks)
Logic: Use a for loop to iterate through the arrays.
Requirement: Use an if-else statement inside the loop to only print slots that aren't empty
(e.g., if (names[i] != null)).
Task 2: Restock & Search
Branch: feature-restock
Method: public static void restockItem(String[] names, int[] stocks, String target, int amount)
Logic: Use a loop to find the target name. If found, add the amount to that index in the stocks
array.
Requirement: If the item isn't found after checking the whole loop, print "Item not found."
Task 3: The User Menu
Branch: feature-menu
Logic: In the main method, use a Scanner and a while(true) loop to create a menu.
Integration: Call the methods written in the previous two tasks above based on the user's
input (1 for View, 2 for Restock, 3 to Exit).
Additional requirements
Documentation
The program class must has an appropriate javadoc comment.
Each method in the class must has an appropriate javadoc comment.
Generate the javadoc documentation and store in a docs/ folder within your project folder.
Submission
Submit the URL to your GitHub repository.
Grading
To grade your project, please add Teaching Assistant’s email as your collaborator of this
project.
Note
Two (2) more activities related to this assignment will be posted. In these assignments, you will
evaluate your peers collaboration.
