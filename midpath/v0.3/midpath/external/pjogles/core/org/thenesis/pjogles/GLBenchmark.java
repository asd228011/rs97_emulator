/*
 * PJOGLES - Copyright (C) 2008 Guillaume Legris, Mathieu Legris
 * 
 * OGLJava - Copyright (C) 2004 Tom Dinneen
 * 
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License version
 * 2 only, as published by the Free Software Foundation. 
 * 
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License version 2 for more details. 
 * 
 * You should have received a copy of the GNU General Public License
 * version 2 along with this work; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA  
 */

package org.thenesis.pjogles;

/**
 * Encapsulates benchmarking information.
 *
 * @author tdinneen
 */
public final class GLBenchmark {
	public long lastTime;
	public int frameCount;
	public float fps;

	public long clearTime;

	public long lightingTime;
	public long textureTime;
	public long blendTime;
	public long fogTime;

	public long stencilTest;
	public long depthTest;

	public float clearPercent;

	public float lightingPercent;
	public float texturePercent;
	public float blendPercent;
	public float fogPercent;

	public float stencilPercent;
	public float depthPercent;
}
