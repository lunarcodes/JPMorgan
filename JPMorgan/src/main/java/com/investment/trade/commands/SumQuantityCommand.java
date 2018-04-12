package com.investment.trade.commands;

/*
 *  Abstact class for Adding the Trades
 */

import com.investment.trade.model.TradePosition;
import com.investment.trade.model.Trade;

public abstract class SumQuantityCommand extends
QuantityCommand {
public Integer execute(TradePosition position, Trade trade) {
return position.getQuantity() + trade.getQuantity();
}
}