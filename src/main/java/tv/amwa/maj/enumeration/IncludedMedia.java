/*
 * Copyright 2016 Richard Cartwright
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * $Log: IncludedMedia.java,v $
 * Revision 1.6  2011/01/04 10:40:23  vizigoth
 * Refactor all package names to simpler forms more consistent with typical Java usage.
 *
 * Revision 1.5  2009/12/18 17:55:59  vizigoth
 * Interim check in to help with some training activities. Early support for reading Preface objects from MXF files.
 *
 * Revision 1.4  2009/03/30 09:05:04  vizigoth
 * Refactor to use SMPTE harmonized names and add early KLV file support.
 *
 * Revision 1.3  2008/02/08 11:54:17  vizigoth
 * Comment linking fix.
 *
 * Revision 1.2  2008/01/08 17:01:49  vizigoth
 * Edited Javadoc comments to release standard and removed unused enumerations.
 *
 * Revision 1.1  2007/11/13 22:14:12  vizigoth
 * Public release of MAJ API.
 */

package tv.amwa.maj.enumeration;

import tv.amwa.maj.industry.MediaEnumerationValue;
import tv.amwa.maj.integer.Int64;

/** 
 * <p>Specifies whether media is included or not by an operation, such as a clone.</p>
 * 
 * <p>Original C name: <code>aafIncMedia_e</code></p>
 * 
 *
 * 
 * @see tv.amwa.maj.model.Package#cloneExternal(Depend, IncludedMedia, tv.amwa.maj.model.AAFFile)
 */

public enum IncludedMedia 
	implements MediaEnumerationValue {

	/** 
	 * <p>Do not include media.</p> 
	 */
	NoIncludedMedia (0), 
	/** 
	 * <p>Include media.</p> 
	 */
	IncludedMedia (1), 
    ;

    private final int value;

    IncludedMedia (int value) { this.value = value; }

    @Int64 public long value() { return (long) value; }
    
    public String symbol() { return name(); }
}
