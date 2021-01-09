package com.imooc.es.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "stu", type = "_doc")
public class Stu {
    /**
     *  @Id：作用在成员变量，标记一个字段为id主键；一般id字段或是域不需要存储也不需要分词；
     */
    @Id
    private Long stuId;
    /**
     其实不管我们将store值设置为true或false，elasticsearch都会将该字段存储到Field域中；但是他们的区别是什么？
     store = false时，默认设置；那么给字段只存储在"_source"的Field域中；
     store = true时，该字段的value会存储在一个跟_source平级的独立Field域中；同时也会存储在_source中，所以有两份拷贝。
     那么我们在什么样的业务场景下使用store field功能？
     */
    @Field(store = true)
    private String name;
    @Field(store = true)
    private Integer age;
    @Field(store = true)
    private String desc;
    @Field(store = true,type = FieldType.Keyword)
    private String sign;
    @Field(store = true)
    private Float money;
    public Long getStuId() {
        return stuId;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }

    public void setStuId(Long stuId) {
        this.stuId = stuId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "stuId=" + stuId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", desc='" + desc + '\'' +
                ", sign='" + sign + '\'' +
                ", money=" + money +
                '}';
    }
}
