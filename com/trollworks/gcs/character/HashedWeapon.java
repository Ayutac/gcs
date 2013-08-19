/* ***** BEGIN LICENSE BLOCK *****
 * Version: MPL 1.1
 *
 * The contents of this file are subject to the Mozilla Public License Version
 * 1.1 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * http://www.mozilla.org/MPL/
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 * for the specific language governing rights and limitations under the
 * License.
 *
 * The Original Code is GURPS Character Sheet.
 *
 * The Initial Developer of the Original Code is Richard A. Wilkes.
 * Portions created by the Initial Developer are Copyright (C) 1998-2002,
 * 2005-2008 the Initial Developer. All Rights Reserved.
 *
 * Contributor(s):
 *
 * ***** END LICENSE BLOCK ***** */

package com.trollworks.gcs.character;

import com.trollworks.gcs.weapon.WeaponStats;

import java.util.HashMap;

/**
 * Provides a wrapper around a {@link WeaponStats} suitable for putting into a {@link HashMap} as a
 * key. Note that this will not work correctly if the {@link WeaponStats} object is changed while
 * the {@link HashedWeapon} is within the {@link HashMap}.
 */
class HashedWeapon {
	private WeaponStats	mWeapon;

	/**
	 * Creates a new hashed weapon.
	 * 
	 * @param weapon The weapon.
	 */
	HashedWeapon(WeaponStats weapon) {
		mWeapon = weapon;
	}

	@Override
	public int hashCode() {
		return mWeapon.getDescription().hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof HashedWeapon) {
			HashedWeapon other = (HashedWeapon) obj;
			return mWeapon.equals(other.mWeapon) && mWeapon.getDescription().equals(other.mWeapon.getDescription());
		}
		return false;
	}
}
