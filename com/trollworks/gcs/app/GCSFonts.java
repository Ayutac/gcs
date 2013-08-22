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
 * Portions created by the Initial Developer are Copyright (C) 1998-2013 the
 * Initial Developer. All Rights Reserved.
 *
 * Contributor(s):
 *
 * ***** END LICENSE BLOCK ***** */

package com.trollworks.gcs.app;

import static com.trollworks.gcs.app.GCSFonts_LS.*;

import com.trollworks.ttk.annotation.LS;
import com.trollworks.ttk.annotation.Localized;
import com.trollworks.ttk.utility.Fonts;

import java.awt.Font;

@Localized({
				@LS(key = "LABELS_FONT", msg = "Labels"),
				@LS(key = "FIELDS_FONT", msg = "Fields"),
				@LS(key = "FIELD_NOTES_FONT", msg = "Field Notes"),
				@LS(key = "TECHNIQUE_FIELDS_FONT", msg = "Technique Fields"),
				@LS(key = "PRIMARY_FOOTER_FONT", msg = "Primary Footer"),
				@LS(key = "SECONDARY_FOOTER_FONT", msg = "Secondary Footer"),
				@LS(key = "NOTES_FONT", msg = "Notes"),
})
/** GCS-specific fonts. */
public class GCSFonts {
	/** The label font. */
	public static final String	KEY_LABEL				= "trollworks.label";				//$NON-NLS-1$
	/** The field font. */
	public static final String	KEY_FIELD				= "trollworks.field";				//$NON-NLS-1$
	/** The field notes font. */
	public static final String	KEY_FIELD_NOTES			= "trollworks.field.notes";		//$NON-NLS-1$
	/** The technique field font. */
	public static final String	KEY_TECHNIQUE_FIELD		= "trollworks.field.technique";	//$NON-NLS-1$
	/** The primary footer font. */
	public static final String	KEY_PRIMARY_FOOTER		= "trollworks.footer.primary";		//$NON-NLS-1$
	/** The secondary footer font. */
	public static final String	KEY_SECONDARY_FOOTER	= "trollworks.footer.secondary";	//$NON-NLS-1$
	/** The notes font. */
	public static final String	KEY_NOTES				= "trollworks.notes";				//$NON-NLS-1$

	/** Register our fonts. */
	public static final void register() {
		String name = Fonts.getDefaultFontName();
		Fonts.register(KEY_LABEL, LABELS_FONT, new Font(name, Font.PLAIN, 9));
		Fonts.register(KEY_FIELD, FIELDS_FONT, new Font(name, Font.BOLD, 9));
		Fonts.register(KEY_FIELD_NOTES, FIELD_NOTES_FONT, new Font(name, Font.PLAIN, 8));
		Fonts.register(KEY_TECHNIQUE_FIELD, TECHNIQUE_FIELDS_FONT, new Font(name, Font.BOLD + Font.ITALIC, 9));
		Fonts.register(KEY_PRIMARY_FOOTER, PRIMARY_FOOTER_FONT, new Font(name, Font.BOLD, 8));
		Fonts.register(KEY_SECONDARY_FOOTER, SECONDARY_FOOTER_FONT, new Font(name, Font.PLAIN, 6));
		Fonts.register(KEY_NOTES, NOTES_FONT, new Font(name, Font.PLAIN, 9));
	}
}
