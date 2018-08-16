package com.zhouwen.main.get.dao.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_webmagic_configure")
public class TbWebmagicConfigure {
    @Id
    @Column(name = "magic_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer magicId;

    private String type;

    private String name;

    private String value;

    /**
     * 更新时间
     */
    private Date updated;

    /**
     * 创建时间
     */
    private Date created;

    /**
     * @return magic_id
     */
    public Integer getMagicId() {
        return magicId;
    }

    /**
     * @param magicId
     */
    public void setMagicId(Integer magicId) {
        this.magicId = magicId;
    }

    /**
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return value
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * 获取更新时间
     *
     * @return updated - 更新时间
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * 设置更新时间
     *
     * @param updated 更新时间
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    /**
     * 获取创建时间
     *
     * @return created - 创建时间
     */
    public Date getCreated() {
        return created;
    }

    /**
     * 设置创建时间
     *
     * @param created 创建时间
     */
    public void setCreated(Date created) {
        this.created = created;
    }
}