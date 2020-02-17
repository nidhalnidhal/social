/*
 * Copyright (C) 2003-2019 eXo Platform SAS.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package org.exoplatform.social.core.binding.model;

/**
 * User Binding Model (Member of space bind by the Space Binding Feature)
 */

public class UserSpaceBinding {
  /** The id. */
  private long              id;

  /** The space id */
  private String            spaceId;

  /** The user */
  private String            user;

  /** The group binding */
  private GroupSpaceBinding groupBinding;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getSpaceId() {
    return spaceId;
  }

  public void setSpaceId(String spaceId) {
    this.spaceId = spaceId;
  }

  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public GroupSpaceBinding getGroupBinding() {
    return groupBinding;
  }

  public void setGroupBinding(GroupSpaceBinding groupBinding) {
    this.groupBinding = groupBinding;
  }
}