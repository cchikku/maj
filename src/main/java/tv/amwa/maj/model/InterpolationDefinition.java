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
 * $Log: InterpolationDefinition.java,v $
 * Revision 1.3  2011/02/14 22:32:49  vizigoth
 * First commit after major sourceforge outage.
 *
 * Revision 1.2  2011/01/13 17:44:26  vizigoth
 * Major refactor of the industrial area and improved front-end documentation.
 *
 * Revision 1.1  2011/01/04 10:39:03  vizigoth
 * Refactor all package names to simpler forms more consistent with typical Java usage.
 *
 * Revision 1.3  2009/05/14 16:15:13  vizigoth
 * Major refactor to remove dependency on JPA and introduce better interface and implementation separation. Removed all setPropertiesFromInterface and castFromInterface methods.
 *
 * Revision 1.2  2008/01/27 11:07:40  vizigoth
 * Edited comments to a release standard.
 *
 * Revision 1.1  2007/11/13 22:08:27  vizigoth
 * Public release of MAJ API.
 */

package tv.amwa.maj.model;


/**
 * <p>Specifies a definition for the mechanism used to calculate the values produced by a
 * {@linkplain VaryingValue varying value} using the specified {@linkplain ControlPoint
 * control points}.</p>
 * 
 *
 *
 * @see tv.amwa.maj.constant.InterpolationConstant
 * @see Dictionary#getInterpolationDefinitions()
 */

public interface InterpolationDefinition 
	extends DefinitionObject {

	/**
	 * <p>Create a cloned copy of this interpolation definition.</p>
	 *
	 * @return Cloned copy of this interpolation definition.
	 */
	public InterpolationDefinition clone();
}

