/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.nigeriamrs.poc.extension.html;

import java.util.HashMap;
import java.util.Map;

import org.openmrs.module.Extension;

/**
 * This class defines the links that will appear on the administration page under the
 * "nigeriamrs.poc.title" heading. This extension is enabled by defining (uncommenting) it in the
 * config.xml file.
 */
public class AdminList {
	
	/**
	 */
	public Extension.MEDIA_TYPE getMediaType() {
		return Extension.MEDIA_TYPE.html;
	}
	
	/**
	 */
	public String getTitle() {
		return "nigeriamrs.poc.title";
	}
	
	/**
	 */
	public Map<String, String> getLinks() {
		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("module/nigeriamrs.poc/nigeriamrs.poc.form", "nigeriamrs.poc.title");
		map.put("nigeriamrs.poc/nigeriamrs.poc.page", "nigeriamrs.poc.refapp.title");
		
		return map;
	}
	
}
