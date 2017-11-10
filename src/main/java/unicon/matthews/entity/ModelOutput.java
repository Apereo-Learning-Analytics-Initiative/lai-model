package unicon.matthews.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Map;

public class ModelOutput implements Serializable {
  
  private static final long serialVersionUID = 1L;
  
  private String classSourcedId;
  private String userSourcedId;
  private String model;
  private Map<String, Object> results;
  private LocalDateTime dateLastModified;
  private String tenantId;
  private String organizationId;
  
  private ModelOutput() {}

  public String getClassSourcedId() {
    return classSourcedId;
  }

  public String getUserSourcedId() {
    return userSourcedId;
  }

  public String getModel() {
    return model;
  }

  public Map<String, Object> getResults() {
    return results;
  }

  public LocalDateTime getDateLastModified() {
    return dateLastModified;
  }

  public String getTenantId() {
    return tenantId;
  }

  public String getOrganizationId() {
    return organizationId;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((classSourcedId == null) ? 0 : classSourcedId.hashCode());
    result = prime * result + ((dateLastModified == null) ? 0 : dateLastModified.hashCode());
    result = prime * result + ((model == null) ? 0 : model.hashCode());
    result = prime * result + ((organizationId == null) ? 0 : organizationId.hashCode());
    result = prime * result + ((results == null) ? 0 : results.hashCode());
    result = prime * result + ((tenantId == null) ? 0 : tenantId.hashCode());
    result = prime * result + ((userSourcedId == null) ? 0 : userSourcedId.hashCode());
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
    ModelOutput other = (ModelOutput) obj;
    if (classSourcedId == null) {
      if (other.classSourcedId != null)
        return false;
    } else if (!classSourcedId.equals(other.classSourcedId))
      return false;
    if (dateLastModified == null) {
      if (other.dateLastModified != null)
        return false;
    } else if (!dateLastModified.equals(other.dateLastModified))
      return false;
    if (model == null) {
      if (other.model != null)
        return false;
    } else if (!model.equals(other.model))
      return false;
    if (organizationId == null) {
      if (other.organizationId != null)
        return false;
    } else if (!organizationId.equals(other.organizationId))
      return false;
    if (results == null) {
      if (other.results != null)
        return false;
    } else if (!results.equals(other.results))
      return false;
    if (tenantId == null) {
      if (other.tenantId != null)
        return false;
    } else if (!tenantId.equals(other.tenantId))
      return false;
    if (userSourcedId == null) {
      if (other.userSourcedId != null)
        return false;
    } else if (!userSourcedId.equals(other.userSourcedId))
      return false;
    return true;
  }
  
  public static class Builder {
    private ModelOutput _modelOutput = new ModelOutput();
    
    public Builder withClassSourcedId(String classSourcedId) {
      this._modelOutput.classSourcedId = classSourcedId;
      return this;
    }
    
    public Builder withUserSourcedId(String userSourcedId) {
      this._modelOutput.userSourcedId = userSourcedId;
      return this;
    }
    
    public Builder withDateLastModified(LocalDateTime dateLastModified) {
      this._modelOutput.dateLastModified = dateLastModified;
      return this;
    }
    
    public Builder withTenantId(String tenantId) {
      this._modelOutput.tenantId = tenantId;
      return this;
    }
    
    public Builder withOrganizationId(String organizationId) {
      this._modelOutput.organizationId = organizationId;
      return this;
    }
    
    public Builder withModel(String model) {
      this._modelOutput.model = model;
      return this;
    }
    
    public Builder withResults(Map<String,Object> results) {
      this._modelOutput.results = results;
      return this;
    }
    
    public ModelOutput build() {
      
      if (_modelOutput.dateLastModified == null) {
        _modelOutput.dateLastModified = LocalDateTime.now(ZoneId.of("UTC"));
      }
      
      return _modelOutput;
    }
  }


}
