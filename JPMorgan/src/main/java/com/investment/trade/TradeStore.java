package com.investment.trade;

import com.investment.trade.model.TradePosition;
import com.investment.trade.model.Trade;
import com.investment.trade.util.TradePostionsList;
import com.investment.trade.util.TradePositionsListImpl;

/*
 *  This class calculate the trade position and add all the trades in the collection
 */
public class TradeStore {
	private final TradePostionsList collections = new TradePositionsListImpl();

		
	public void collectTrade(Trade trade) throws Exception  {
		TradePosition tradePosition = collections.getPositionByTradeNewIfNotExists(trade);
		Trade existingTrade = collections.getAllTrades().get(trade.getTradeId());
		if (existingTrade != null) {
			if (trade.getTradeVersion() >= existingTrade.getTradeVersion()) {
				TradePosition existingPosition = collections.getPositionByTrade(existingTrade);
				existingPosition.setQuantity(TradeCommand.getReversalTradeCommand(existingTrade).doExecute(existingPosition,existingTrade));
			} else {
				return;
			}
		}
		tradePosition.setQuantity(TradeCommand.getTradeCommand(trade).doExecute(tradePosition, trade));
		tradePosition.addTrade(trade);
		collections.addTrade(trade);
	}

	public TradePostionsList getTradeCollection() {
		return collections;
	}
}