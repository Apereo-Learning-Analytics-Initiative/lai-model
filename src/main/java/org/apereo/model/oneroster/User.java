package org.apereo.model.oneroster;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.time.Instant;
import java.util.Map;

/**
 * @author ggilbert
 * @author xchopin <xavier.chopin@univ-lorraine.fr>
 */
@JsonDeserialize(builder = User.Builder.class)

public final class User {

  public final class UserId {
    public String type;
    public String identifier;
  }

  private String sourcedId;
  private Status status;
  private Instant dateLastModified;
  private Map<String, String> metadata;
  private UserId[] userIds;
  private boolean enabledUser;
  private String username, givenName, familyName, middleName;
  private Role role;
  private String identifier, email, sms, phone;
  private String[] grades;
  private String password;
  
  private User() {}

  public String getSourcedId() {
    return sourcedId;
  }

  public Status getStatus() {
    return status;
  }

  public Instant getDateLastModified() {
    return dateLastModified;
  }

  public Map<String, String> getMetadata() {
    return metadata;
  }

  public UserId[] getUserIds() {
    return userIds;
  }

  public boolean isEnabledUser() {
    return enabledUser;
  }

  public String getUsername() {
    return username;
  }

  public String getGivenName() {
    return givenName;
  }

  public String getFamilyName() {
    return familyName;
  }

  public String getMiddleName() {
    return middleName;
  }

  public Role getRole() {
    return role;
  }

  public String getIdentifier() {
    return identifier;
  }

  public String getEmail() {
    return email;
  }

  public String getSms() {
    return sms;
  }

  public String getPhone() {
    return phone;
  }

  public String[] getGrades() {
    return grades;
  }

  public String getPassword() {
    return password;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;

    if (o == null || getClass() != o.getClass()) return false;

    User user = (User) o;

    return new EqualsBuilder()
            .append(enabledUser, user.enabledUser)
            .append(sourcedId, user.sourcedId)
            .append(status, user.status)
            .append(dateLastModified, user.dateLastModified)
            .append(metadata, user.metadata)
            .append(userIds, user.userIds)
            .append(username, user.username)
            .append(givenName, user.givenName)
            .append(familyName, user.familyName)
            .append(middleName, user.middleName)
            .append(role, user.role)
            .append(identifier, user.identifier)
            .append(email, user.email)
            .append(sms, user.sms)
            .append(phone, user.phone)
            .append(grades, user.grades)
            .append(password, user.password)
            .isEquals();
  }

  @Override
  public int hashCode() {
    return new HashCodeBuilder(17, 37)
            .append(sourcedId)
            .append(status)
            .append(dateLastModified)
            .append(metadata)
            .append(userIds)
            .append(enabledUser)
            .append(username)
            .append(givenName)
            .append(familyName)
            .append(middleName)
            .append(role)
            .append(identifier)
            .append(email)
            .append(sms)
            .append(phone)
            .append(grades)
            .append(password)
            .toHashCode();
  }

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
  }

  public static class Builder {
    private User _user = new User();

    public Builder withSourcedId(String sourcedId) {
      _user.sourcedId = sourcedId;
      return this;
    }

    public Builder withStatus(Status status) {
      _user.status = status;
      return this;
    }

    public Builder withDateLastModified(Instant dateLastModified) {
      _user.dateLastModified = dateLastModified;
      return this;
    }

    public Builder withMetadata(Map<String, String> metadata) {
      _user.metadata = metadata;
      return this;
    }

    public Builder withUserIds(UserId[] userIds) {
      _user.userIds = userIds;
      return this;
    }

    public Builder withEnabledUser(boolean enabledUser) {
      _user.enabledUser = enabledUser;
      return this;
    }

    public Builder withUsername(String username) {
      _user.username = username;
      return this;
    }

    public Builder withGivenName(String givenName) {
      _user.givenName = givenName;
      return this;
    }

    public Builder withFamilyName(String familyName) {
      _user.familyName = familyName;
      return this;
    }

    public Builder withMiddleName(String middleName) {
      _user.middleName = middleName;
      return this;
    }

    public Builder withRole(Role role) {
      _user.role = role;
      return this;
    }

    public Builder withIdentifier(String identifier) {
      _user.identifier = identifier;
      return this;
    }

    public Builder withEmail(String email) {
      _user.email = email;
      return this;
    }

    public Builder withSms(String sms) {
      _user.sms = sms;
      return this;
    }

    public Builder withPhone(String phone) {
      _user.phone = phone;
      return this;
    }

    public Builder withGrades(String[] grades) {
      _user.grades = grades;
      return this;
    }

    public Builder withPassword(String password) {
      _user.password = password;
      return this;
    }

    public User build() {
      return _user;
    }
  }

}
