package unicon.matthews.oneroster;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Map;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(builder = AcademicSession.Builder.class)
public class AcademicSession {

  private String sourcedId;
  private Status status;
  private LocalDateTime dateLastModified;
  private Map<String, String> metadata;
  private String title;
  private LocalDate startDate;
  private LocalDate endDate;
  private AcademicSessionType academicSessionType;

  private AcademicSession() {
  }

  public String getSourcedId() {
    return sourcedId;
  }

  public String getTitle() {
    return title;
  }

  public LocalDate getStartDate() {
    return startDate;
  }

  public LocalDate getEndDate() {
    return endDate;
  }

  public Map<String, String> getMetadata() {
    return metadata;
  }

  public AcademicSessionType getAcademicSessionType() {
    return academicSessionType;
  }

  public Status getStatus() {
    return status;
  }

  public LocalDateTime getDateLastModified() {
    return dateLastModified;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((academicSessionType == null) ? 0 : academicSessionType.hashCode());
    result = prime * result + ((dateLastModified == null) ? 0 : dateLastModified.hashCode());
    result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
    result = prime * result + ((metadata == null) ? 0 : metadata.hashCode());
    result = prime * result + ((sourcedId == null) ? 0 : sourcedId.hashCode());
    result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
    result = prime * result + ((status == null) ? 0 : status.hashCode());
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
    AcademicSession other = (AcademicSession) obj;
    if (academicSessionType != other.academicSessionType)
      return false;
    if (dateLastModified == null) {
      if (other.dateLastModified != null)
        return false;
    } else if (!dateLastModified.equals(other.dateLastModified))
      return false;
    if (endDate == null) {
      if (other.endDate != null)
        return false;
    } else if (!endDate.equals(other.endDate))
      return false;
    if (metadata == null) {
      if (other.metadata != null)
        return false;
    } else if (!metadata.equals(other.metadata))
      return false;
    if (sourcedId == null) {
      if (other.sourcedId != null)
        return false;
    } else if (!sourcedId.equals(other.sourcedId))
      return false;
    if (startDate == null) {
      if (other.startDate != null)
        return false;
    } else if (!startDate.equals(other.startDate))
      return false;
    if (status != other.status)
      return false;
    if (title == null) {
      if (other.title != null)
        return false;
    } else if (!title.equals(other.title))
      return false;
    return true;
  }

  public static class Builder {
    private AcademicSession _academicSession = new AcademicSession();

    public Builder withSourcedId(String sourcedId) {
      _academicSession.sourcedId = sourcedId;
      return this;
    }

    public Builder withStatus(Status status) {
      _academicSession.status = status;
      return this;
    }

    public Builder withDateLastModified(LocalDateTime dateLastModified) {
      _academicSession.dateLastModified = dateLastModified;
      return this;
    }

    public Builder withMetadata(Map<String, String> metadata) {
      _academicSession.metadata = metadata;
      return this;
    }

    public Builder withTitle(String title) {
      _academicSession.title = title;
      return this;
    }

    public Builder withStartDate(LocalDate startDate) {
      _academicSession.startDate = startDate;
      return this;
    }

    public Builder withEndDate(LocalDate endDate) {
      _academicSession.endDate = endDate;
      return this;
    }

    public Builder withAcademicSessionType(AcademicSessionType academicSessionType) {
      _academicSession.academicSessionType = academicSessionType;
      return this;
    }

    public AcademicSession build() {
      return _academicSession;
    }
  }
}
