package org.apereo.model.oneroster;

import java.time.LocalDateTime;
import java.util.Map;

/**
 * @author ggilbert
 * @author xchopin <xavier.chopin@univ-lorraine.fr>
 */
abstract class BaseClass {

  protected String sourcedId;
  protected Status status;
  protected LocalDateTime dateLastModified;
  protected Map<String, String> metadata;
  
  public String getSourcedId() {
    return sourcedId;
  }
  public Status getStatus() {
    return status;
  }
  public LocalDateTime getDateLastModified() {
    return dateLastModified;
  }
  public Map<String, String> getMetadata() {
    return metadata;
  }

  
}
