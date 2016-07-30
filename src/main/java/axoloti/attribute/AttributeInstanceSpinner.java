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
package axoloti.attribute;

import axoloti.attributedefinition.AxoAttribute;
import axoloti.attributedefinition.AxoAttributeSpinner;
import axoloti.object.AxoObjectInstance;
import components.control.ACtrlEvent;
import components.control.ACtrlListener;
import components.control.NumberBoxComponent;

/**
 *
 * @author Johannes Taelman
 */
public class AttributeInstanceSpinner extends AttributeInstanceInt {

    NumberBoxComponent spinner;

    public AttributeInstanceSpinner() {
    }

    public AttributeInstanceSpinner(AxoAttribute param, AxoObjectInstance axoObj1) {
        super(param, axoObj1);
        value = ((AxoAttributeSpinner) attr).getDefaultValue();
    }

    @Override
    public void PostConstructor() {
        super.PostConstructor();
        AxoAttributeSpinner attrs = (AxoAttributeSpinner) attr;
        if (value < attrs.getMinValue()) {
            value = attrs.getMinValue();
        }
        if (value > attrs.getMaxValue()) {
            value = attrs.getMaxValue();
        }
        spinner = new NumberBoxComponent(value, attrs.getMinValue(), attrs.getMaxValue(), 1.0);
        add(spinner);
        spinner.addACtrlListener(new ACtrlListener() {
            @Override
            public void ACtrlAdjusted(ACtrlEvent e) {
                value = (int) spinner.getValue();
            }
        });
    }

    @Override
    public String CValue() {
        return "" + value;
    }

    @Override
    public void Lock() {
        if (spinner != null) {
            spinner.setEnabled(false);
        }
    }

    @Override
    public void UnLock() {
        if (spinner != null) {
            spinner.setEnabled(true);
        }
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
