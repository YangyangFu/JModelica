/*
    Copyright (C) 2016 Modelon AB

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, version 3 of the License.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/
package org.jmodelica.util.streams;

import java.io.PrintStream;

public class UnitTestCodeStream extends NotNullCodeStream {

    public UnitTestCodeStream(PrintStream out) {
        super(out);
    }
    
    @Override
    public void splitFile() {
        print("/*** SPLIT FILE ***/\n\n");
    }
    
}