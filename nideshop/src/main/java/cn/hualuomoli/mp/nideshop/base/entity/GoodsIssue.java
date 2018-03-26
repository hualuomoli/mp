package cn.hualuomoli.mp.nideshop.base.entity;

// 
public class GoodsIssue {

  /**  */
  private java.lang.Integer id;
  /**  */
  private java.lang.String goods_id;
  /**  */
  private java.lang.String question;
  /**  */
  private java.lang.String answer;

  public GoodsIssue() {
  }

  // getter and setter

  public java.lang.Integer getId() {
    return this.id;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public java.lang.String getGoods_id() {
    return this.goods_id;
  }

  public void setGoods_id(java.lang.String goods_id) {
    this.goods_id = goods_id;
  }

  public java.lang.String getQuestion() {
    return this.question;
  }

  public void setQuestion(java.lang.String question) {
    this.question = question;
  }

  public java.lang.String getAnswer() {
    return this.answer;
  }

  public void setAnswer(java.lang.String answer) {
    this.answer = answer;
  }

  @Override
  public String toString() {
    return "GoodsIssue [" //
        + "id=" + id //
        + ", goods_id=" + goods_id //
        + ", question=" + question //
        + ", answer=" + answer //
        + "]";
  }

}