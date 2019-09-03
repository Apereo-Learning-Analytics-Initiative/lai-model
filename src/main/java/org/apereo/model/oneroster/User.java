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

    public User withSourcedId(String sourcedId) {
      _user.sourcedId = sourcedId;
      return _user;
    }

    public User withStatus(Status status) {
      _user.status = status;
      return _user;
    }

    public User withDateLastModified(Instant dateLastModified) {
      _user.dateLastModified = dateLastModified;
      return _user;
    }

    public User withMetadata(Map<String, String> metadata) {
      _user.metadata = metadata;
      return _user;
    }

    public User withUserIds(UserId[] userIds) {
      _user.userIds = userIds;
      return _user;
    }

    public User withEnabledUser(boolean enabledUser) {
      _user.enabledUser = enabledUser;
      return _user;
    }

    public User withUsername(String username) {
      _user.username = username;
      return _user;
    }

    public User withGivenName(String givenName) {
      _user.givenName = givenName;
      return _user;
    }

    public User withFamilyName(String familyName) {
      _user.familyName = familyName;
      return _user;
    }

    public User withMiddleName(String middleName) {
      _user.middleName = middleName;
      return _user;
    }

    public User withRole(Role role) {
      _user.role = role;
      return _user;
    }

    public User withIdentifier(String identifier) {
      _user.identifier = identifier;
      return _user;
    }

    public User withEmail(String email) {
      _user.email = email;
      return _user;
    }

    public User withSms(String sms) {
      _user.sms = sms;
      return _user;
    }

    public User withPhone(String phone) {
      _user.phone = phone;
      return _user;
    }

    public User withGrades(String[] grades) {
      _user.grades = grades;
      return _user;
    }

    public User withPassword(String password) {
      _user.password = password;
      return _user;
    }

    public User build() {
      return _user;
    }
  }

}
