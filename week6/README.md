## Funny array sorter

Make a FunnyArraySorter class

It should have a constructor that takes an Integer (pivot)

It should have several sorting functions using anonymous classes:
#### reverseSort(List<Integer> list)

#### pivotSubtractionSort(List<Integer> list)

Assume that one Integer is greater than other if it is greater than the second with at lest the pivot value (a>b iff a-pivot>b, a=b iff a-pivot=b)

#### pivotDivisionSort(List<Integer> list)
Assume that one Integer is greater than other if when divided by the pivot is greater than the second (a>b iff a/pivot>b, a=b iff a/pivot=b)


Bonus: Try to explain why the pivot sorting functions are wrong and will have different result with the same numbers, but reordered.


## User input checker

Make a UserInputChecker class

It should have a nested interface Validator which has one function:
	public boolean validate(String input)

create inside the following classes:

#### PersonNameValidator
#### BulgarianPhoneNumberValidator
#### PersonAgeValidator
#### CreditCardNumberValidator
#### IpVersion4Validator
#### IpVersion6Validator
#### MacAddressValidator

## Binary Search Tree

Create a BST with a Node as nested class.

You should be able to add, search and remove an element.
You should also calculate the depth and the height of a given element.

Bonus: Try to calculate the depth and height in O(1).

If you need help look here: 
http://cpp.datastructures.net/presentations/BinarySearchTrees.pdf

http://stackoverflow.com/questions/2603692/what-is-the-difference-between-tree-depth-and-height

## Bank account

### Make a BankAccount class.

It should have unique number and store information about its and owner - First, Last name and age.

It should store information about the balance of the account, the interest of the account and the type of the interest (complex and simple year interest).

If someone tries to create a bank account with invalid information an appropriate exception should be thrown.

It should support add, withdraw, transfer and history operations.

When the iterest is greater than 1% the withdraws are forbidden.

It should remember the last 5 operations of the account.

### Make a CLI (Command Line Interpreter) for operating with the Bank accounts

It should have the following functions:

* create_bank_account

It should prompt the user for the needed information and if everything is ok it should create a new bank account. 

* show_history

It should prompt the user for the bank account number and show its history.

* add_money

It should prompt the user for the amount and the bank account number.

* withdraw_money

It should prompt the user for the amount and the bank account number.

* transfer_money

It should prompt the user for the origin and destination bank account numbers and the amount

* calculate_amount 

It should prompt the user for bank account number and number of months. 
It should return the amount after the given number of months.

### The Bank

It should store the bank accounts.

### Notes:

you should create and use your own custom exceptions:
* InsufficientFundsException
* NonExistingBankAccountException
