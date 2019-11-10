# Student Info
Matric : 271278
Name : Nurul Nadiah bt Yusuf
# Introduction
For my first assignment i need to write java code, pseudocode, make flow chart and write java program how to solve the problems that have given from my lecturer. in this assignment also, i have to wrote code java about car loan. i need to calculate monthly repayment according to car price, down payment, loan period and interest rate. To solve this problems i use #if,else if and return as my java program code. In this assignment,there have condition that car price cannot be less than RM 30,000 and i use if,else if and return as my work to solve that problem.
# pseudocode
Start
Declare variable as the following :
double carPrice
double downPayment
int loanPeriod
int interestRate
double interest, principal, remainingBalance, remainingLoan
int month = 1
double monthlyPayment = 0
double sumLoanPayment
double sumPrincipal =0
double sumInterest =0

Output "enter car price (rm) :?"
input carPrice 
Car Price cannot be less than rm30000,other wise it you look back to the same input until it is more than or equal to rm30000. Then it will proceed to the next input.
 
output “ down payment “
 input downPayment 
Down Payment cannot be zero but cannot be negative,other wise it you look back to the same input until it zero or negative. Then it will proceed to the next input.
 
output “loan period”
 input loanPeriod
Loan Period cannot be less than 5 years and cannot more than 9 years,other wise it you look back to the same input until it is less than 5 years and equal to 9 years. Then it will proceed to the next input.

output “interest rate”
 input interestRate 
Interest Rate cannot be less than 3% and cannot more than 7%,other wise it you look back to the same input until it is less than 3% and equal to 7%. Then it will proceed to the next input.

calculate the formula :
 remainingLoan = carPrice - downPayment

 interest = remainingLoan * interestRate /100

principal = remainingLoan / loanPeriod + interest

monthlyPayment = principal / 12

remainingBalance = sumLoanPayment – sumPrincipal
display car loan table
end

# Flow Chart
<img width="194" alt="flowchart" src="https://user-images.githubusercontent.com/55502535/68539071-cc9e1780-03b8-11ea-8c26-91a281e11c26.PNG">

# Screenshoot for output
<img width="514" alt="java code" src="https://user-images.githubusercontent.com/55502535/68539096-0ec75900-03b9-11ea-8873-791584f59f15.PNG">

