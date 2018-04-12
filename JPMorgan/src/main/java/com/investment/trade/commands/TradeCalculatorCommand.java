package com.investment.trade.commands;

import com.investment.trade.model.TradePosition;
import com.investment.trade.model.Trade;

/*
 *  Base interface for all the trade commands
 */
public interface TradeCalculatorCommand {
	public Integer doExecute(TradePosition position, Trade trade) throws Exception ;
}
