/*
 * Charlatan is a premium CS:GO cheat ran on the JVM.
 * Copyright (C) 2016 Thomas Nappo, Jonathan Beaudoin
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.charlatano.game.offsets

import com.charlatano.game.CSGO.clientDLL
import com.charlatano.utils.get

object ClientOffsets {
	
	val bDormant by clientDLL(0xC, subtract = false)(0x55, 0x8B, 0xEC, 0x53, 0x8B, 0x5D, 0x08, 0x56, 0x8B, 0xF1, 0x88, 0x9E, 0x0[4], 0xE8)
	
	val dwWorldDecal by clientDLL(read = false, subtract = false, className = "DT_TEWorldDecal")
	val dwFirstClass by clientDLL(patternOffset = 0x2B, subtract = false, offset = dwWorldDecal)
	
	val dwForceJump by clientDLL(2)(0x89, 0x15, 0[4], 0x8B, 0x15, 0[4], 0xF6,
			0xC2, 0x03, 0x74, 0x03, 0x83, 0xCE, 0x08)
	val dwLocalPlayer by clientDLL(1, 16)(0xA3, 0[4], 0xC7, 0x05, 0[8], 0xE8, 0[4], 0x59, 0xC3, 0x6A)
	val dwGlowObject by clientDLL(1, 4)(0xA1, 0[4], 0xA8, 0x01, 0x75, 0x4E, 0x0F, 0x57, 0xC0)
	val dwEntityList by clientDLL(1)(187, 0[4], 131, 255, 1, 15, 140, 0[4], 59, 248)
	val dwViewMatrix by clientDLL(850, 176)(129, 198, 0[4], 136, 69, 154, 15, 182, 192)
	
}