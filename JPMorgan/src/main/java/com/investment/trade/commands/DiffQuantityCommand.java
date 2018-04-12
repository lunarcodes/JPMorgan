package com.investment.trade.commands;

import com.investment.trade.model.TradePosition;
import com.investment.trade.model.Trade;

/*
 *  Abstract class for finding the diff between the trades
 */
public abstract class DiffQuantityCommand extends QuantityCommand {
	
public Integer execute(TradePosition position, Trade trade) {
return position.getQuantity() - trade.getQuantity();
}

}