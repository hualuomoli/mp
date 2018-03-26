package cn.hualuomoli.mp.nideshop.api.goods.entity;

import java.util.List;

public class ApiGoodsComment {

  private String content;
  private String add_time;
  private String nickname;
  private String avatar;
  private List<Pic> pic_list;

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getAdd_time() {
    return add_time;
  }

  public void setAdd_time(String add_time) {
    this.add_time = add_time;
  }

  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public String getAvatar() {
    return avatar;
  }

  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }

  public List<Pic> getPic_list() {
    return pic_list;
  }

  public void setPic_list(List<Pic> pic_list) {
    this.pic_list = pic_list;
  }

  public static class Pic {
    private Integer id;
    private Integer comment_id;
    private String pic_url;
    private Integer sort_order;

    public Integer getId() {
      return id;
    }

    public void setId(Integer id) {
      this.id = id;
    }

    public Integer getComment_id() {
      return comment_id;
    }

    public void setComment_id(Integer comment_id) {
      this.comment_id = comment_id;
    }

    public String getPic_url() {
      return pic_url;
    }

    public void setPic_url(String pic_url) {
      this.pic_url = pic_url;
    }

    public Integer getSort_order() {
      return sort_order;
    }

    public void setSort_order(Integer sort_order) {
      this.sort_order = sort_order;
    }

    @Override
    public String toString() {
      return "Pic [id=" + id + ", comment_id=" + comment_id + ", pic_url=" + pic_url + ", sort_order=" + sort_order + "]";
    }

  }

  @Override
  public String toString() {
    return "ApiGoodsComment [content=" + content + ", add_time=" + add_time + ", nickname=" + nickname + ", avatar=" + avatar + "]";
  }

}
