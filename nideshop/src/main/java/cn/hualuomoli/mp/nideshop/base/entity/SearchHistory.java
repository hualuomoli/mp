package cn.hualuomoli.mp.nideshop.base.entity;

// 
public class SearchHistory {

  /**  */
  private java.lang.Integer id;
  /**  */
  private java.lang.String keyword;
  /** 搜索来源，如PC、小程序、APP等 */
  private java.lang.String from;
  /** 搜索时间 */
  private java.lang.Integer add_time;
  /**  */
  private java.lang.Integer user_id;

  public SearchHistory() {
  }

  // getter and setter

  public java.lang.Integer getId() {
    return this.id;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public java.lang.String getKeyword() {
    return this.keyword;
  }

  public void setKeyword(java.lang.String keyword) {
    this.keyword = keyword;
  }

  public java.lang.String getFrom() {
    return this.from;
  }

  public void setFrom(java.lang.String from) {
    this.from = from;
  }

  public java.lang.Integer getAdd_time() {
    return this.add_time;
  }

  public void setAdd_time(java.lang.Integer add_time) {
    this.add_time = add_time;
  }

  public java.lang.Integer getUser_id() {
    return this.user_id;
  }

  public void setUser_id(java.lang.Integer user_id) {
    this.user_id = user_id;
  }

  @Override
  public String toString() {
    return "SearchHistory [" //
        + "id=" + id //
        + ", keyword=" + keyword //
        + ", from=" + from //
        + ", add_time=" + add_time //
        + ", user_id=" + user_id //
        + "]";
  }

}