# JPMorgan
Trade
- ![#f03c15](https://placehold.it/15/f03c15/000000?text=+)  <b>Problem Statement : </b>

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


![#c5f015](https://placehold.it/15/c5f015/000000?text=+)<b><font color="red"> Solution Approach :</font><b>

 <b>Tech Stack : </b>Java 1.7,junit,log4j</br>

--> All trade Events are considered as each command, it will drive its own logic bassed on Direction and operation of trade 
to calculate the trade postion  baseand perform calculation based on the existing trade datas.

<b>CommandFactory</b> : Factory class for all the commands</br>
<b>TradeCommand </b> : Based on the trade events the corresponding TradeCommand class will get called.</br>
<b>TradeStore </b> : This class calculate the trade position and add all the trades in the collection</br>
<b>SumQuantityCommand</b>  : Abstact class for Adding the Trades</br>
<b>DiffQuantityCommand </b> ;Abstract class for finding the diff between the trades</br>
<b>TradeCalculatorCommand</b> : Base inetrface for all the trade commands</br>
<b>Trade </b> : Model class for Trade</br>

<b>TradeTest.java</b>  : Contain all the test cases for each account , you can run account wise individually or you can run the entire test case method [TradeBuildTest]
To keep it simple i build the Trade object statically from the input values .</br>


// To keep the solution simple i created  manual input of streaming trades  and build the trade
// we can use filereader to read a file of trades and use concurrentAccountHashMap/Blocking Queue for processing </br>
<b>TradeMain.java </b> : stanalone java to test input with respect to output.</br>


