package org.apereo.model.oneroster;

import java.time.Instant;
import java.util.Map;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * @author ggilbert
 * @author xchopin <xavier.chopin@univ-lorraine.fr>
 */
@JsonDeserialize(builder = LineItem.Builder.class)
public class LineItem {
  private String sourcedId;
  private Status status;
  private Instant dateLastModified;
  private Map<String, String> metadata;
  private String title, description;
  private Instant assignDate, dueDate;
  private double resultValueMin, resultValueMax;
  
  @JsonProperty("class")
  private Link klass;
  
  private LineItemCategory category;
  
  private LineItem() {}
  
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

  public String getDescription() {
    return description;
  }

  public Instant getAssignDate() {
    return assignDate;
  }

  public Instant getDueDate() {
    return dueDate;
  }

  public Link getKlass() {
    return klass;
  }

  public LineItemCategory getCategory() {
    return category;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    LineItem lineItem = (LineItem) o;

    if (Double.compare(lineItem.resultValueMin, resultValueMin) != 0) return false;
    if (Double.compare(lineItem.resultValueMax, resultValueMax) != 0) return false;
    if (sourcedId != null ? !sourcedId.equals(lineItem.sourcedId) : lineItem.sourcedId != null) return false;
    if (status != lineItem.status) return false;
    if (dateLastModified != null ? !dateLastModified.equals(lineItem.dateLastModified) : lineItem.dateLastModified != null)
      return false;
    if (metadata != null ? !metadata.equals(lineItem.metadata) : lineItem.metadata != null) return false;
    if (title != null ? !title.equals(lineItem.title) : lineItem.title != null) return false;
    if (description != null ? !description.equals(lineItem.description) : lineItem.description != null) return false;
    if (assignDate != null ? !assignDate.equals(lineItem.assignDate) : lineItem.assignDate != null) return false;
    if (dueDate != null ? !dueDate.equals(lineItem.dueDate) : lineItem.dueDate != null) return false;
    if (klass != null ? !klass.equals(lineItem.klass) : lineItem.klass != null) return false;
    return category != null ? category.equals(lineItem.category) : lineItem.category == null;
  }

  @Override
  public int hashCode() {
    int result;
    long temp;
    result = sourcedId != null ? sourcedId.hashCode() : 0;
    result = 31 * result + (status != null ? status.hashCode() : 0);
    result = 31 * result + (dateLastModified != null ? dateLastModified.hashCode() : 0);
    result = 31 * result + (metadata != null ? metadata.hashCode() : 0);
    result = 31 * result + (title != null ? title.hashCode() : 0);
    result = 31 * result + (description != null ? description.hashCode() : 0);
    result = 31 * result + (assignDate != null ? assignDate.hashCode() : 0);
    result = 31 * result + (dueDate != null ? dueDate.hashCode() : 0);
    temp = Double.doubleToLongBits(resultValueMin);
    result = 31 * result + (int) (temp ^ (temp >>> 32));
    temp = Double.doubleToLongBits(resultValueMax);
    result = 31 * result + (int) (temp ^ (temp >>> 32));
    result = 31 * result + (klass != null ? klass.hashCode() : 0);
    result = 31 * result + (category != null ? category.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
  }

  public double getResultValueMin() {
    return resultValueMin;
  }

  public double getResultValueMax() {
    return resultValueMax;
  }

  public Instant getDateLastModified() {
    return dateLastModified;
  }

  public static class Builder {
    private LineItem _lineItem = new LineItem();
    
    public Builder withSourcedId(String sourcedId) {
      _lineItem.sourcedId = sourcedId;
      return this;
    }
    
    public Builder withStatus(Status status) {
      _lineItem.status = status;
      return this;
    }
    
    public Builder withMetadata(Map<String,String> metadata) {
      _lineItem.metadata = metadata;
      return this;
    }
    
    public Builder withTitle(String title) {
      _lineItem.title = title;
      return this;
    }
    
    public Builder withDescription(String description) {
      _lineItem.description = description;
      return this;
    }
    
    public Builder withAssignDate(Instant assignDate) {
      _lineItem.assignDate = assignDate;
      return this;
    }
    
    public Builder withDueDate(Instant dueDate) {
      _lineItem.dueDate = dueDate;
      return this;
    }
    
    public Builder withCategory(LineItemCategory category) {
      _lineItem.category = category;
      return this;
    }
    
    public Builder withClass(Link klass) {
      _lineItem.klass = klass;
      return this;
    }

    public Builder dateLastModified(Instant date) {
      _lineItem.dateLastModified = date;
      return this;
    }

    public Builder withResultValueMin(Double value) {
      _lineItem.resultValueMin = value;
      return this;
    }

    public Builder withResultValueMax(Double value) {
      _lineItem.resultValueMax = value;
      return this;
    }

    public LineItem build() {
      if (_lineItem.klass == null) {
        throw new IllegalStateException(_lineItem.toString());
      }
      return _lineItem;
    }
  }

}
