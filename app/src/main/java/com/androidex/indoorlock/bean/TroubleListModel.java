package com.androidex.indoorlock.bean;

import com.androidex.indoorlock.base.BaseBean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2018/3/16.
 */

public class TroubleListModel extends BaseBean {
    public List<Trouble> data;
    public class Trouble implements Serializable{
        public int rid;
        public String troubleTitle;
        public String remark;
        public String images;
        public String creDate;
        public int unitId;
        public int communityId;
        public int userId;
        public String state;
        public String completeBy;
        public String completeDate;
    }
}
