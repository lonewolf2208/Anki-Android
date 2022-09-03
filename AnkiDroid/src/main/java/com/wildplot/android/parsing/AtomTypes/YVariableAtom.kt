/****************************************************************************************
 * Copyright (c) 2014 Michael Goldbach <michael@wildplot.com>                           *
 *                                                                                      *
 * This program is free software; you can redistribute it and/or modify it under        *
 * the terms of the GNU General Public License as published by the Free Software        *
 * Foundation; either version 3 of the License, or (at your option) any later           *
 * version.                                                                             *
 *                                                                                      *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY      *
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A      *
 * PARTICULAR PURPOSE. See the GNU General Public License for more details.             *
 *                                                                                      *
 * You should have received a copy of the GNU General Public License along with         *
 * this program.  If not, see <http://www.gnu.org/licenses/>.                           *
 ****************************************************************************************/
package com.wildplot.android.parsing.AtomTypes

import android.annotation.SuppressLint
import com.wildplot.android.parsing.Atom.AtomType
import com.wildplot.android.parsing.ExpressionFormatException
import com.wildplot.android.parsing.TopLevelParser
import com.wildplot.android.parsing.TreeElement

@SuppressLint("NonPublicNonStaticFieldName")
class YVariableAtom(private val parser: TopLevelParser) : TreeElement {
    private val atomType = AtomType.VARIABLE
    override fun getValue(): Double {
        return if (atomType !== AtomType.INVALID) {
            parser.y
        } else {
            throw ExpressionFormatException("Number is Invalid, cannot parse")
        }
    }

    override fun isVariable(): Boolean {
        return true
    }
}