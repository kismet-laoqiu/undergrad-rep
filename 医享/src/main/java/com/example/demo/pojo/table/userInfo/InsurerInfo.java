package com.example.demo.pojo.table.userInfo;

import lombok.Data;

import javax.persistence.*;
import java.lang.reflect.Field;

/**
 * @ClassName: InsurerInfo
 * @Description: 保险机构信息表
 * @Author: 刘敬
 * @Date：2019/7/25 19:34
 */
@Entity
@Data
public class InsurerInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String organization;

    @Column
    private String createTime;

    @Column
    private String registrar;

    @Column
    private String business;

    @Lob
    private String details;

    public void updateInfo(InsurerInfo origin) {
        Field[] fields = origin.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            try {
                Object value = field.get(origin);
                if (null != value && !value.equals("") && !value.equals("null") && !field.getName().equals("id")) {
                    field.set(this, value);
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            field.setAccessible(false);
        }
    }
}
