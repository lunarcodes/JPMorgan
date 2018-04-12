# JPMorgan
Trade
Problem Statement : 

As an investment bank we have a requirement to maintain the total quantity of a traded security held at
any point in time, this is referred to as a real time position.
A position is stored at an aggregated level using the trading account and security identifier.

Creation of a position is driven by an incoming Trade Event stream. Each event contains the key
attributes required to create the position:
Trade ID – Identifier for the trade, sequential number
Trade Version – Version of the trade, sequential number
Security Identifier – Traded security, string
Quantity – Number of shares in the current trade, number
Direction – Buy or Sell indicator
Account Number – Account used to purchase shares, string
Operation – NEW/AMEND/CANCEL


Solution Approach :

--> All trade Events are considered as each command, it will drive its own logic to calculate the trade postion and perform calculation based on the existing trade datas.

CommandFactory : Factory class for all the commands
TradeCommand : Based on the trade events the corresponding TradeCommand class will get called.
TradeStore : This class calculate the trade position and add all the trades in the collection
SumQuantityCommand : Abstact class for Adding the Trades
DiffQuantityCommand ;Abstract class for finding the diff between the trades
TradeCalculatorCommand: Base inetrface for all the trade commands
Trade : Model class for Trade

TradeTest.java : Contain all the test cases for each account , you can run account wise individually or you can run the entire test case method [TradeBuildTest]
To keep it simple i build the Trade object statically from the input values .


// To keep the solution simple i created  manual input of streaming trades like this and build the trade
// we can use filereader to read a file of trades and use concurrentAccountHashMap/Blocking Queue for processing 
TradeMain.java : stanalone java to test input with respect to output.
