/*************************************************************************\
* Copyright (C) 2009-2011 Mennē Software Solutions, LLC
*
* This code is released as open source under the Apache 2.0 License:<br/>
* <a href="http://www.apache.org/licenses/LICENSE-2.0">
* http://www.apache.org/licenses/LICENSE-2.0</a><br />
\*************************************************************************/

package com.moneydance.modules.features.findandreplace;

import com.infinitekind.moneydance.model.*;

/**
 * <p>Main interface for the Find and Replace plugin. All the user actions related to the plugin
 * as a whole go through here, and clients can also access resources (strings and images)
 * through this interface.</p>
 *
 * @author Kevin Menningen
 * @version 1.60
 * @since 1.0
 */
public interface IFindAndReplaceController extends IResourceProvider
{
    /**
     * Initialize the dialog with the data from the application.
     * @param data The data to load with.
     */
    void loadData(final AccountBook data);

    /**
     * Display the dialog/frame on the screen.
     */
    void show();
    void refresh();
    void hide();
    void find();
    void replace();
    void replaceAll();
    void commit();
    void reset();
    void updateRow(int modelIndex);
    void cleanUp();

    void setInitialFreeText(final String freeText);
    boolean getShowParents();
    boolean getSplitsAsMemos();

    /**
     * Obtain the user-defined name of a specific account.
     * @param accountID The account identifier.
     * @return The name of the account.
     */
    String getAccountName(final int accountID);

    public com.moneydance.apps.md.controller.Main getMDMain();

    public com.moneydance.apps.md.view.gui.MoneydanceGUI getMDGUI();

    public AccountBook getBook();
    public CurrencyType getCurrencyType();
}
