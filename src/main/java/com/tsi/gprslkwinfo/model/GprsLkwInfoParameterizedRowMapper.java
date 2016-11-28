package com.tsi.gprslkwinfo.model;

/**
 * Created by osboxes on 28.11.16.
 */

        import java.sql.ResultSet;
        import java.sql.SQLException;

        import org.springframework.jdbc.core.simple.ParameterizedRowMapper;

public class GprsLkwInfoParameterizedRowMapper implements ParameterizedRowMapper<GprsLkwInfo>
{
    public GprsLkwInfo mapRow(ResultSet rs, int rowNum) throws SQLException {
        GprsLkwInfo gprsLkwInfo = new GprsLkwInfo();
        gprsLkwInfo.setGprsLkwInfoLkwId(rs.getInt("LKWID"));
        gprsLkwInfo.setGprsLkwInfokennzeichen(rs.getString("KENNZEICHEN"));
        return gprsLkwInfo;
    }

}

