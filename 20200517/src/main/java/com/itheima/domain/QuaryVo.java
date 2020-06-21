package com.itheima.domain;

import java.util.List;

/**
 * @Description:
 * @PackageName: com.itheima.domain
 * @ClassName: QuaryVo
 * @Author: NH on 2020/5/18:15:20
 */
public class QuaryVo {

    List<Integer> ids;

    @Override
    public String toString() {
        return "QuaryVo{" +
                "ids=" + ids +
                '}';
    }

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }

    public QuaryVo() {
    }

    public QuaryVo(List<Integer> ids) {
        this.ids = ids;
    }
}
