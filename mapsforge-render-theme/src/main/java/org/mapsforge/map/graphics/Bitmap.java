/*
 * Copyright 2010, 2011, 2012 mapsforge.org
 *
 * This program is free software: you can redistribute it and/or modify it under the
 * terms of the GNU Lesser General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE. See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License along with
 * this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.mapsforge.map.graphics;

import java.nio.ByteBuffer;

public interface Bitmap {
	/**
	 * @return a new bitmap with the dimensions and pixels of this bitmap. FIXME: is this method needed?
	 */
	Bitmap copy();

	void copyPixelsFromBuffer(ByteBuffer byteBuffer);

	void copyPixelsToBuffer(ByteBuffer byteBuffer);

	/**
	 * @return the height of this bitmap in pixels.
	 */
	int getHeight();

	/**
	 * @return the color values of all pixels in this bitmap.
	 */
	int[] getPixels();

	/**
	 * @return the width of this bitmap in pixels.
	 */
	int getWidth();
}
