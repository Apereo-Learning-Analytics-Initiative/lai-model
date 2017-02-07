package unicon.matthews.oneroster;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(builder = Link.Builder.class)
public class Link {

  private String href;
  private String sourcedId;
  private String type;
  
  private Link() {}

  public String getHref() {
    return href;
  }

  public String getSourcedId() {
    return sourcedId;
  }

  public String getType() {
    return type;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((href == null) ? 0 : href.hashCode());
    result = prime * result + ((sourcedId == null) ? 0 : sourcedId.hashCode());
    result = prime * result + ((type == null) ? 0 : type.hashCode());
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
    Link other = (Link) obj;
    if (href == null) {
      if (other.href != null)
        return false;
    } else if (!href.equals(other.href))
      return false;
    if (sourcedId == null) {
      if (other.sourcedId != null)
        return false;
    } else if (!sourcedId.equals(other.sourcedId))
      return false;
    if (type == null) {
      if (other.type != null)
        return false;
    } else if (!type.equals(other.type))
      return false;
    return true;
  }
  
  public static class Builder {
    private Link _link = new Link();
    
    public Builder withSourcedId(String sourcedId) {
      _link.sourcedId = sourcedId;
      return this;
    }
    
    public Builder withType(String type) {
      _link.type = type;
      return this;
    }

    public Builder withHref(String href) {
      _link.href = href;
      return this;
    }

    public Link build() {
      return _link;
    }
  }
}
