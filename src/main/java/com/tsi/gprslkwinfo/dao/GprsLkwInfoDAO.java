package com.tsi.gprslkwinfo.dao;

import java.util.List;
import com.tsi.gprslkwinfo.model.GprsLkwInfo;
/**
 * Created by osboxes on 28.11.16.
 */
public interface GprsLkwInfoDAO {
    public void insert(GprsLkwInfo gprsLkwInfo);
    public GprsLkwInfo findByGprsLkwInfoLkwId(long lkwid);
}
