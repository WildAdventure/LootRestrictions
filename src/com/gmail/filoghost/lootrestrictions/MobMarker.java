/*
 * Copyright (c) 2020, Wild Adventure
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 * 3. Neither the name of the copyright holder nor the names of its
 *    contributors may be used to endorse or promote products derived from
 *    this software without specific prior written permission.
 * 4. Redistribution of this software in source or binary forms shall be free
 *    of all charges or fees to the recipient of this software.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.gmail.filoghost.lootrestrictions;

import java.util.UUID;

import org.bukkit.attribute.Attributable;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.attribute.AttributeModifier.Operation;

public class MobMarker {
	
	
	private static final AttributeModifier SPAWNER_MOB_ATTRIBUTE_MODIFIER = new AttributeModifier(
			UUID.fromString("a332ea57-f9ae-410e-be13-a45da25ca386"), // Do not change this generated UUID
			"SpawnerGeneratedMob",
			0.0,
			Operation.ADD_NUMBER);
	
	private static final AttributeModifier BREEDING_MOB_ATTRIBUTE_MODIFIER = new AttributeModifier(
			UUID.fromString("1c86080d-ccbd-4783-a689-5e4faef2a474"), // Do not change this generated UUID
			"BreedingGeneratedMob",
			0.0,
			Operation.ADD_NUMBER);
	
	
	public static void setSpawnerGenerated(Attributable entity) {
		entity.getAttribute(Attribute.GENERIC_KNOCKBACK_RESISTANCE).addModifier(SPAWNER_MOB_ATTRIBUTE_MODIFIER);
	}
	
	public static void setBreedingGenerated(Attributable entity) {
		entity.getAttribute(Attribute.GENERIC_KNOCKBACK_RESISTANCE).addModifier(BREEDING_MOB_ATTRIBUTE_MODIFIER);
	}

	
	public static boolean isSpawnerGenerated(Attributable entity) {
		for (AttributeModifier modifier : entity.getAttribute(Attribute.GENERIC_KNOCKBACK_RESISTANCE).getModifiers()) {
        	if (modifier.getUniqueId().equals(SPAWNER_MOB_ATTRIBUTE_MODIFIER.getUniqueId())) {
    			return true;    			
        	}
        }
		
		return false;
	}
	
	public static boolean isBreedingGenerated(Attributable entity) {
		for (AttributeModifier modifier : entity.getAttribute(Attribute.GENERIC_KNOCKBACK_RESISTANCE).getModifiers()) {
        	if (modifier.getUniqueId().equals(BREEDING_MOB_ATTRIBUTE_MODIFIER.getUniqueId())) {
    			return true;    			
        	}
        }
		
		return false;
	}
	

}
