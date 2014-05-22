/*
 * Copyright 2012 Goodow.com
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.goodow.realtime.store.channel;

/**
 * Shared constants between server and client.
 */
public interface Constants {

  public interface Addr {
    String STORE = "realtime.store";
    String OPS = STORE + ".ops";
    String PRESENCE = "realtime.store.presence:";

    String EVENT = STORE + ".event.";
    String DOCUMENT_ERROR = "document_error";
  }

  /**
   * Request parameter keys for referencing various values.
   */
  public interface Key {
    String ID = "id";
    String OP_DATA = "opData";
    String OP = "op";
    String OPS = "ops";
    String SESSION_ID = "sid";
    String VERSION = "v";

    String SNAPSHOT = "snapshot";
    String ACCESS_TOKEN = "accessToken";

    String IS_JOINED = "isJoined";
    String USER_ID = "userId";
    String DISPLAY_NAME = "displayName";
    String COLOR = "color";
    String IS_ME = "isMe";
    String IS_ANONYMOUS = "isAnonymous";
    String PHOTO_URL = "photoUrl";
  }
}
