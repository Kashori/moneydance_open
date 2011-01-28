/*************************************************************************\
* Copyright (C) 2009-2011 Mennē Software Solutions, LLC
*
* This code is released as open source under the Apache 2.0 License:<br/>
* <a href="http://www.apache.org/licenses/LICENSE-2.0">
* http://www.apache.org/licenses/LICENSE-2.0</a><br />
\*************************************************************************/

package com.moneydance.modules.features.findandreplace;

/**
 * <p>Interface for an object following the Command pattern. Commands can be chained or stored in
 * a queue for Undo/Redo support, etc.</p>
 *
 * @author Kevin Menningen
 * @version 1.50
 * @since 1.0
 */
public interface ICommand
{
    /**
     * Perform the command.
     * @return True if command was applied, false if it was not.
     */
    boolean execute();
}
