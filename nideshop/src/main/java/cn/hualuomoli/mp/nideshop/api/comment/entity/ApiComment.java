package cn.hualuomoli.mp.nideshop.api.comment.entity;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class ApiComment {

  private Integer id;
  private Integer type_id;
  private Integer value_id;
  private String content;
  @JSONField(format = "yyyy-MM-dd HH:mm:ss")
  private Date add_time;
  private UserInfo user_info;
  private String pic_list;

  public static class UserInfo {
    private String username;
    private String avatar;
    private String nickname;

    public String getUsername() {
      return username;
    }

    public void setUsername(String username) {
      this.username = username;
    }

    public String getAvatar() {
      return avatar;
    }

    public void setAvatar(String avatar) {
      this.avatar = avatar;
    }

    public String getNickname() {
      return nickname;
    }

    public void setNickname(String nickname) {
      this.nickname = nickname;
    }

    @Override
    public String toString() {
      return "UserInfo [username=" + username + ", avatar=" + avatar + ", nickname=" + nickname + "]";
    }

  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getType_id() {
    return type_id;
  }

  public void setType_id(Integer type_id) {
    this.type_id = type_id;
  }

  public Integer getValue_id() {
    return value_id;
  }

  public void setValue_id(Integer value_id) {
    this.value_id = value_id;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Date getAdd_time() {
    return add_time;
  }

  public void setAdd_time(Date add_time) {
    this.add_time = add_time;
  }

  public UserInfo getUser_info() {
    return user_info;
  }

  public void setUser_info(UserInfo user_info) {
    this.user_info = user_info;
  }

  public String getPic_list() {
    return pic_list;
  }

  public void setPic_list(String pic_list) {
    this.pic_list = pic_list;
  }

  @Override
  public String toString() {
    return "ApiComment [id=" + id + ", type_id=" + type_id + ", value_id=" + value_id + ", content=" + content + ", add_time=" + add_time + ", user_info="
        + user_info + ", pic_list=" + pic_list + "]";
  }

}
