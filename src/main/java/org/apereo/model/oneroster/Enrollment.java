package org.apereo.model.oneroster;

import java.time.Instant;
import java.util.Map;
import java.util.Objects;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * @author ggilbert
 * @author xchopin <xavier.chopin@univ-lorraine.fr>
 */
@JsonDeserialize(builder = Enrollment.Builder.class)
public final class Enrollment {
  
  private String sourcedId;
  private Status status;
  private Map<String, String> metadata;
  private Role role;
  private boolean primary;
  private Link user;
  private Instant dateLastModified;
  private Instant beginDate;
  private Instant endDate;
  @JsonProperty("class")
  private Link klass;
  
  private Enrollment() {}


  public String getSourcedId() {
    return sourcedId;
  }

  public Enrollment setSourcedId(String sourcedId) {
    this.sourcedId = sourcedId;
    return this;
  }

  public Status getStatus() {
    return status;
  }


  public Map<String, String> getMetadata() {
    return metadata;
  }


  public Role getRole() {
    return role;
  }

  public boolean isPrimary() {
    return primary;
  }

  public Link getUser() {
    return user;
  }

  public Instant getDateLastModified() {
    return dateLastModified;
  }


  public Instant getBeginDate() {
    return beginDate;
  }


  public Instant getEndDate() {
    return endDate;
  }


  public Link getKlass() {
    return klass;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Enrollment that = (Enrollment) o;
    return primary == that.primary &&
            Objects.equals(sourcedId, that.sourcedId) &&
            status == that.status &&
            Objects.equals(metadata, that.metadata) &&
            role == that.role &&
            Objects.equals(user, that.user) &&
            Objects.equals(dateLastModified, that.dateLastModified) &&
            Objects.equals(beginDate, that.beginDate) &&
            Objects.equals(endDate, that.endDate) &&
            Objects.equals(klass, that.klass);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourcedId, status, metadata, role, primary, user, dateLastModified, beginDate, endDate, klass);
  }

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
  }

  public static class Builder {
    private Enrollment _enrollment = new Enrollment();
    
    public Builder withSourcedId(String sourcedId) {
      _enrollment.sourcedId = sourcedId;
      return this;
    }
    
    public Builder withStatus(Status status) {
      _enrollment.status = status;
      return this;
    }
    
    public Builder withMetadata(Map<String,String> metadata) {
      _enrollment.metadata = metadata;
      return this;
    }
    
    public Builder withRole(Role role) {
      _enrollment.role = role;
      return this;
    }
    
    public Builder withPrimary(boolean primary) {
      _enrollment.primary = primary;
      return this;
    }
    
    public Builder withUser(Link user) {
      _enrollment.user = user;
      return this;
    }
    
    @JsonProperty("class")
    public Builder withKlass(Link klass) {
      _enrollment.klass = klass;
      return this;
    }

    public Builder withDateLastModified(Instant lastModified) {
      _enrollment.dateLastModified = lastModified;
      return this;
    }

    public Builder withBeginDate(Instant beginDate) {
      _enrollment.beginDate = beginDate;
      return this;
    }

    public Builder withEndDate(Instant endDate) {
      _enrollment.endDate = endDate;
      return this;
    }
    
    public Enrollment build() {
      return _enrollment;
    }
  }
}
