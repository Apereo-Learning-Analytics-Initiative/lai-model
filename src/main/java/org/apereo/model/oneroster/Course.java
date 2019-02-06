package org.apereo.model.oneroster;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * @author ggilbert
 * @author xchopin <xavier.chopin@univ-lorraine.fr>
 */
@JsonDeserialize(builder = Course.Builder.class)
public class Course {
  private String sourcedId;
  private Status status;
  private Map<String, String> metadata;
  private String title;
  private String schoolYear;
  private String courseCode;
  private String grade;
  private List<String> subjects;
  
  private Course() {}

  public String getSourcedId() {
    return sourcedId;
  }

  public Status getStatus() {
    return status;
  }

  public Map<String, String> getMetadata() {
    return metadata;
  }

  public String getTitle() {
    return title;
  }

  public String getSchoolYear() {
    return schoolYear;
  }

  public String getCourseCode() {
    return courseCode;
  }

  public String getGrade() {
    return grade;
  }

  public List<String> getSubjects() {
    return subjects;
  }
  
  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((courseCode == null) ? 0 : courseCode.hashCode());
    result = prime * result + ((grade == null) ? 0 : grade.hashCode());
    result = prime * result + ((metadata == null) ? 0 : metadata.hashCode());
    result = prime * result + ((schoolYear == null) ? 0 : schoolYear.hashCode());
    result = prime * result + ((sourcedId == null) ? 0 : sourcedId.hashCode());
    result = prime * result + ((status == null) ? 0 : status.hashCode());
    result = prime * result + ((subjects == null) ? 0 : subjects.hashCode());
    result = prime * result + ((title == null) ? 0 : title.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Course other = (Course) obj;
    if (courseCode == null) {
      if (other.courseCode != null)
        return false;
    } else if (!courseCode.equals(other.courseCode))
      return false;
    if (grade == null) {
      if (other.grade != null)
        return false;
    } else if (!grade.equals(other.grade))
      return false;
    if (metadata == null) {
      if (other.metadata != null)
        return false;
    } else if (!metadata.equals(other.metadata))
      return false;
    if (schoolYear == null) {
      if (other.schoolYear != null)
        return false;
    } else if (!schoolYear.equals(other.schoolYear))
      return false;
    if (sourcedId == null) {
      if (other.sourcedId != null)
        return false;
    } else if (!sourcedId.equals(other.sourcedId))
      return false;
    if (status != other.status)
      return false;
    if (subjects == null) {
      if (other.subjects != null)
        return false;
    } else if (!subjects.equals(other.subjects))
      return false;
    if (title == null) {
      if (other.title != null)
        return false;
    } else if (!title.equals(other.title))
      return false;
    return true;
  }

  public static class Builder {
    private Course _course = new Course();
    
    public Builder withSourcedId(String sourcedId) {
      _course.sourcedId = sourcedId;
      return this;
    }
    
    public Builder withStatus(Status status) {
      _course.status = status;
      return this;
    }
    
    public Builder withMetadata(Map<String,String> metadata) {
      _course.metadata = metadata;
      return this;
    }
    
    public Builder withTitle(String title) {
      _course.title = title;
      return this;
    }
    
    public Builder withSchoolYear(String schoolYear) {
      _course.schoolYear = schoolYear;
      return this;
    }
    
    public Builder withCourseCode(String courseCode) {
      _course.courseCode = courseCode;
      return this;
    }
    
    public Builder withGrade(String grade) {
      _course.grade = grade;
      return this;
    }

    public Builder withSubjects(List<String> subjects) {
      _course.subjects = subjects;
      return this;
    }
    
    public Course build() {
      return _course;
    }
  }


}
