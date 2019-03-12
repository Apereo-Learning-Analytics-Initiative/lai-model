package org.apereo.model.oneroster;

import java.time.Instant;
import java.util.Arrays;
import java.util.Map;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * @author ggilbert
 * @author xchopin <xavier.chopin@univ-lorraine.fr>
 */
@JsonDeserialize(builder = Class.Builder.class)
public final class Class {
  private String sourcedId;
  private Status status;
  private Instant dateLastModified;
  private Map<String, String> metadata;
  private String title, classCode, classType, location;
  private String[] grades, subjects;
  private Link course, school;
  private Link[] terms;
  private String[] subjectCodes;
  private int[] periods;
  private Link[] resources;
  
  private Class() {}

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

  public String getTitle() {
    return title;
  }

  public String getClassCode() {
    return classCode;
  }

  public String getClassType() {
    return classType;
  }

  public String getLocation() {
    return location;
  }

  public String[] getGrades() {
    return grades;
  }

  public String[] getSubjects() {
    return subjects;
  }

  public Link getCourse() {
    return course;
  }

  public Link getSchool() {
    return school;
  }

  public Link[] getTerms() {
    return terms;
  }

  public String[] getSubjectCodes() {
    return subjectCodes;
  }

  public int[] getPeriods() {
    return periods;
  }

  public Link[] getResources() {
    return resources;
  }

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) return true;

    if (o == null || getClass() != o.getClass()) return false;

    Class aClass = (Class) o;

    return new EqualsBuilder()
            .append(sourcedId, aClass.sourcedId)
            .append(status, aClass.status)
            .append(dateLastModified, aClass.dateLastModified)
            .append(metadata, aClass.metadata)
            .append(title, aClass.title)
            .append(classCode, aClass.classCode)
            .append(classType, aClass.classType)
            .append(location, aClass.location)
            .append(grades, aClass.grades)
            .append(subjects, aClass.subjects)
            .append(course, aClass.course)
            .append(school, aClass.school)
            .append(terms, aClass.terms)
            .append(subjectCodes, aClass.subjectCodes)
            .append(periods, aClass.periods)
            .append(resources, aClass.resources)
            .isEquals();
  }

  @Override
  public int hashCode() {
    int result = sourcedId != null ? sourcedId.hashCode() : 0;
    result = 31 * result + (status != null ? status.hashCode() : 0);
    result = 31 * result + (dateLastModified != null ? dateLastModified.hashCode() : 0);
    result = 31 * result + (metadata != null ? metadata.hashCode() : 0);
    result = 31 * result + (title != null ? title.hashCode() : 0);
    result = 31 * result + (classCode != null ? classCode.hashCode() : 0);
    result = 31 * result + (classType != null ? classType.hashCode() : 0);
    result = 31 * result + (location != null ? location.hashCode() : 0);
    result = 31 * result + Arrays.hashCode(grades);
    result = 31 * result + Arrays.hashCode(subjects);
    result = 31 * result + (course != null ? course.hashCode() : 0);
    result = 31 * result + (school != null ? school.hashCode() : 0);
    result = 31 * result + Arrays.hashCode(terms);
    result = 31 * result + Arrays.hashCode(subjectCodes);
    result = 31 * result + Arrays.hashCode(periods);
    result = 31 * result + Arrays.hashCode(resources);
    return result;
  }

  public static class Builder {
    private Class _class = new Class();

    public Builder withSourcedId(String sourcedId) {
      _class.sourcedId = sourcedId;
      return this;
    }

    public Builder withStatus(Status status) {
      _class.status = status;
      return this;
    }

    public Builder withDateLastModified(Instant dateLastModified) {
      _class.dateLastModified = dateLastModified;
      return this;
    }

    public Builder withMetadata(Map<String,String> metadata) {
      _class.metadata = metadata;
      return this;
    }

    public Builder withTitle(String title) {
      _class.title = title;
      return this;
    }

    public Builder withClassCode(String s) {
      _class.classCode = s;
      return this;
    }

    public Builder withClassType(String s) {
      _class.classType = s;
      return this;
    }

    public Builder withLocation(String s) {
      _class.location = s;
      return this;
    }

    public Builder withGrades(String[] s) {
      _class.grades = s;
      return this;
    }

    public Builder withSubjects(String[] s) {
      _class.subjects = s;
      return this;
    }

    public Builder withCourse(Link course) {
      _class.course = course;
      return this;
    }

    public Builder withSchool(Link school) {
      _class.school = school;
      return this;
    }

    public Builder withTerms(Link[] s) {
      _class.terms = s;
      return this;
    }

    public Builder withSubjectCodes(String[] s) {
      _class.subjectCodes = s;
      return this;
    }

    public Builder withPeriods(int[] s) {
      _class.periods = s;
      return this;
    }

    public Builder withResources(Link[] s) {
      _class.resources = s;
      return this;
    }

    public Class build() {
      return _class;
    }
  }



}
