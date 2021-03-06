/**
 * Copyright (C) 2013, 2014 Johannes Taelman
 *
 * This file is part of Axoloti.
 *
 * Axoloti is free software: you can redistribute it and/or modify it under the
 * terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 *
 * Axoloti is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * Axoloti. If not, see <http://www.gnu.org/licenses/>.
 */
package axoloti.object;

import java.util.ArrayList;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.ElementListUnion;
import org.simpleframework.xml.Root;

/**
 *
 * @author Johannes Taelman
 */
@Root(name = "objdefs")
public class AxoObjectFile {

    @ElementListUnion({
        @ElementList(entry = "obj.normal", type = AxoObject.class, inline = true, required = false),
        @ElementList(entry = "obj.comment", type = AxoObjectComment.class, inline = true, required = false),
        @ElementList(entry = "obj.hyperlink", type = AxoObjectHyperlink.class, inline = true, required = false)
    })
    public ArrayList<AxoObjectAbstract> objs;

    public AxoObjectFile() {
        objs = new ArrayList<AxoObjectAbstract>();
    }
}
