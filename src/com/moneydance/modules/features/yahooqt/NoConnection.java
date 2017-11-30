/*************************************************************************\
* Copyright (C) 2010 The Infinite Kind, LLC
*
* This code is released as open source under the Apache 2.0 License:<br/>
* <a href="http://www.apache.org/licenses/LICENSE-2.0">
* http://www.apache.org/licenses/LICENSE-2.0</a><br />
\*************************************************************************/

package com.moneydance.modules.features.yahooqt;

import com.infinitekind.moneydance.model.*;

/**
 * A stock connection that means the user doesn't want to use any connection at all, which disables
 * use of that particular download type.
 *
 * @author Kevin Menningen - Mennē Software Solutions, LLC
 */
public class NoConnection extends BaseConnection {
  private static final String PREFS_KEY = "notUsed";

  private String _displayName = "None"; // the default used if one is not set by resources

  public NoConnection() {
    super(null, BaseConnection.ALL_SUPPORT);
  }

  @Override
  public String getFullTickerSymbol(SymbolData parsedSymbol, StockExchange exchange) {
    return null;  // not used
  }

  @Override
  public String getCurrencyCodeForQuote(String rawTickerSymbol, StockExchange exchange) {
    return null;  // not used
  }

  @Override
  public String getHistoryURL(String fullTickerSymbol, DateRange dateRange) {
    return null;  // not used
  }

  @Override
  public void setDefaultCurrency() {
    // do nothing, no model is defined
  }

  @Override
  public StockHistory getHistory(CurrencyType securityCurrency, DateRange dateRange, boolean apply)
          throws DownloadException {
    return null;
  }

  @Override
  protected String getCurrentPriceHeader() {
    return null;  // not used
  }

  @Override
  public String getId() {
    return PREFS_KEY;
  }

  @Override
  public CurrencyType getPriceCurrency(CurrencyType securityCurrency) {
    return null; // do nothing
  }

  void setDisplayName(final String displayName) { _displayName = displayName; }

  @Override
  public String toString() {
    return _displayName;
  }

}
