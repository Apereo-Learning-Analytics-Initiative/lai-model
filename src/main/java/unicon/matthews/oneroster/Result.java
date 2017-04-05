package unicon.matthews.oneroster;

import java.time.LocalDateTime;
import java.util.Map;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(builder = Result.Builder.class)
public class Result {

  private String sourcedId;
  private Status status;
  private LocalDateTime dateLastModified;
  private Link lineitem;
  private Link student;
  private Double score;
  private String resultstatus;
  private LocalDateTime date;
  private String comment;
  private Map<String, String> metadata;

  private Result() {}

  public String getSourcedId() {
    return sourcedId;
  }

  public Status getStatus() {
    return status;
  }

  public LocalDateTime getDateLastModified() {
    return dateLastModified;
  }

  public Link getLineitem() {
    return lineitem;
  }

  public Link getStudent() {
    return student;
  }

  public Double getScore() {
    return score;
  }

  public String getResultstatus() {
    return resultstatus;
  }

  public LocalDateTime getDate() {
    return date;
  }

  public String getComment() {
    return comment;
  }

  public Map<String, String> getMetadata() {
    return metadata;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((comment == null) ? 0 : comment.hashCode());
    result = prime * result + ((date == null) ? 0 : date.hashCode());
    result = prime * result + ((dateLastModified == null) ? 0 : dateLastModified.hashCode());
    result = prime * result + ((lineitem == null) ? 0 : lineitem.hashCode());
    result = prime * result + ((metadata == null) ? 0 : metadata.hashCode());
    result = prime * result + ((resultstatus == null) ? 0 : resultstatus.hashCode());
    result = prime * result + ((score == null) ? 0 : score.hashCode());
    result = prime * result + ((sourcedId == null) ? 0 : sourcedId.hashCode());
    result = prime * result + ((status == null) ? 0 : status.hashCode());
    result = prime * result + ((student == null) ? 0 : student.hashCode());
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
    Result other = (Result) obj;
    if (comment == null) {
      if (other.comment != null)
        return false;
    } else if (!comment.equals(other.comment))
      return false;
    if (date == null) {
      if (other.date != null)
        return false;
    } else if (!date.equals(other.date))
      return false;
    if (dateLastModified == null) {
      if (other.dateLastModified != null)
        return false;
    } else if (!dateLastModified.equals(other.dateLastModified))
      return false;
    if (lineitem == null) {
      if (other.lineitem != null)
        return false;
    } else if (!lineitem.equals(other.lineitem))
      return false;
    if (metadata == null) {
      if (other.metadata != null)
        return false;
    } else if (!metadata.equals(other.metadata))
      return false;
    if (resultstatus == null) {
      if (other.resultstatus != null)
        return false;
    } else if (!resultstatus.equals(other.resultstatus))
      return false;
    if (score == null) {
      if (other.score != null)
        return false;
    } else if (!score.equals(other.score))
      return false;
    if (sourcedId == null) {
      if (other.sourcedId != null)
        return false;
    } else if (!sourcedId.equals(other.sourcedId))
      return false;
    if (status != other.status)
      return false;
    if (student == null) {
      if (other.student != null)
        return false;
    } else if (!student.equals(other.student))
      return false;
    return true;
  }
  
  public static class Builder {
    private Result _result = new Result();
    
    public Builder withSourcedId(String sourcedId) {
      _result.sourcedId = sourcedId;
      return this;
    }
    
    public Builder withStatus(Status status) {
      _result.status = status;
      return this;
    }
    
    public Builder withDateLastModified(LocalDateTime dateLastModified) {
      _result.dateLastModified = dateLastModified;
      return this;
    }

    public Builder withMetadata(Map<String,String> metadata) {
      _result.metadata = metadata;
      return this;
    }

    public Builder withLineitem(Link lineitem) {
      _result.lineitem = lineitem;
      return this;
    }
    
    public Builder withStudent(Link student) {
      _result.student = student;
      return this;
    }
    
    public Builder withScore(Double score) {
      _result.score = score;
      return this;
    }
    
    public Builder withResultstatus(String resultstatus) {
      _result.resultstatus = resultstatus;
      return this;
    }
    
    public Builder withDate(LocalDateTime date) {
      _result.date = date;
      return this;
    }
    
    public Builder withComment(String comment) {
      _result.comment = comment;
      return this;
    }
    
    public Result build() {
      return _result;
    }
  }
}
