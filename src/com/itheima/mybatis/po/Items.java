package com.itheima.mybatis.po;

import java.util.Date;

public class Items {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column items.id
     *
     * @mbggenerated Fri Jan 26 18:36:13 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column items.name
     *
     * @mbggenerated Fri Jan 26 18:36:13 CST 2018
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column items.price
     *
     * @mbggenerated Fri Jan 26 18:36:13 CST 2018
     */
    private Float price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column items.pic
     *
     * @mbggenerated Fri Jan 26 18:36:13 CST 2018
     */
    private String pic;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column items.createtime
     *
     * @mbggenerated Fri Jan 26 18:36:13 CST 2018
     */
    private Date createtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column items.detail
     *
     * @mbggenerated Fri Jan 26 18:36:13 CST 2018
     */
    private String detail;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column items.id
     *
     * @return the value of items.id
     *
     * @mbggenerated Fri Jan 26 18:36:13 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column items.id
     *
     * @param id the value for items.id
     *
     * @mbggenerated Fri Jan 26 18:36:13 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column items.name
     *
     * @return the value of items.name
     *
     * @mbggenerated Fri Jan 26 18:36:13 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column items.name
     *
     * @param name the value for items.name
     *
     * @mbggenerated Fri Jan 26 18:36:13 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column items.price
     *
     * @return the value of items.price
     *
     * @mbggenerated Fri Jan 26 18:36:13 CST 2018
     */
    public Float getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column items.price
     *
     * @param price the value for items.price
     *
     * @mbggenerated Fri Jan 26 18:36:13 CST 2018
     */
    public void setPrice(Float price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column items.pic
     *
     * @return the value of items.pic
     *
     * @mbggenerated Fri Jan 26 18:36:13 CST 2018
     */
    public String getPic() {
        return pic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column items.pic
     *
     * @param pic the value for items.pic
     *
     * @mbggenerated Fri Jan 26 18:36:13 CST 2018
     */
    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column items.createtime
     *
     * @return the value of items.createtime
     *
     * @mbggenerated Fri Jan 26 18:36:13 CST 2018
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column items.createtime
     *
     * @param createtime the value for items.createtime
     *
     * @mbggenerated Fri Jan 26 18:36:13 CST 2018
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column items.detail
     *
     * @return the value of items.detail
     *
     * @mbggenerated Fri Jan 26 18:36:13 CST 2018
     */
    public String getDetail() {
        return detail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column items.detail
     *
     * @param detail the value for items.detail
     *
     * @mbggenerated Fri Jan 26 18:36:13 CST 2018
     */
    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }
}