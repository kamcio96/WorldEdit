/*
 * WorldEdit, a Minecraft world manipulation toolkit
 * Copyright (C) sk89q <http://www.sk89q.com>
 * Copyright (C) WorldEdit team and contributors
 *
 * This program is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by the
 * Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package com.sk89q.worldedit.entity;

import com.sk89q.worldedit.extent.Extent;
import com.sk89q.worldedit.util.Location;
import com.sk89q.worldedit.world.World;

/**
 * A reference to an instance of an entity that exists in an {@link Extent}
 * and thus would have position and similar details.
 * </p>
 * This object cannot be directly cloned because it represents a particular
 * instance of an entity, but a {@link BaseEntity} can be created from
 * this entity (or at least, it will be possible in the future), which
 * can then be used to spawn new instances of that particular entity
 * description.
 */
public interface Entity {

    /**
     * Get a copy of the entity's state.
     *
     * @return the entity's state
     */
    BaseEntity getState();

    /**
     * Get the location of this entity.
     *
     * @return the location of the entity
     */
    Location getLocation();

    /**
     * Get the world that this entity is on.
     *
     * @return the world
     */
    World getWorld();

}
