/* 
 **********************************************************************
 *
 * $Id: PositionType.java,v 1.5 2011/02/14 22:33:03 vizigoth Exp $
 *
 * The contents of this file are subject to the AAF SDK Public
 * Source License Agreement (the "License"); You may not use this file
 * except in compliance with the License.  The License is available in
 * AAFSDKPSL.TXT, or you may obtain a copy of the License from the AAF
 * Association or its successor.
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied.  See
 * the License for the specific language governing rights and 
 * limitations under the License.
 *
 * The Original Code of this file is Copyright 2007, Licensor of the
 * AAF Association.
 *
 * The Initial Developer of the Original Code of this file and the 
 * Licensor of the AAF Association is Richard Cartwright.
 * All rights reserved.
 *
 * Contributors and Additional Licensors of the AAF Association:
 * Avid Technology, Metaglue Corporation, British Broadcasting Corporation
 *
 **********************************************************************
 */

/*
 * $Log: PositionType.java,v $
 * Revision 1.5  2011/02/14 22:33:03  vizigoth
 * First commit after major sourceforge outage.
 *
 * Revision 1.4  2011/01/04 10:42:32  vizigoth
 * Refactor all package names to simpler forms more consistent with typical Java usage.
 *
 * Revision 1.3  2007/12/12 12:52:27  vizigoth
 * Added documentation tag to annotations.
 *
 * Revision 1.2  2007/11/23 15:04:16  vizigoth
 * Edited javadoc comments to release standard.
 *
 * Revision 1.1  2007/11/13 22:08:04  vizigoth
 * Public release of MAJ API.
 *
 * Revision 1.2  2007/11/13 21:22:10  vizigoth
 * Added AMWA license to all Java files.
 *
 */

package tv.amwa.maj.misctype;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/** <p>Labels a Java <code>long</code> value as an offset into a 
 * {@linkplain tv.amwa.maj.model.Component component}. The value is measured in the
 * edit units of the component.</p>
 * 
 * <p>
 * Original C name: <code>aafPosition_t</code><br>
 * C base type: <code>aafInt64</code><br>
 * Java base type: <code>long</code>
 * </p>
 * 
 * @see tv.amwa.maj.union.SourceReferenceValue#getStartPosition()
 * @see tv.amwa.maj.model.SourceClip#getStartPosition()
 * @see tv.amwa.maj.industry.TypeDefinitions#PositionType
 * 
 * @author <a href="mailto:richard@portability4media.com">Richard Cartwright</a>
 */
@Documented
@Target(value={ElementType.FIELD, ElementType.PARAMETER, ElementType.METHOD})
public @interface PositionType { }
