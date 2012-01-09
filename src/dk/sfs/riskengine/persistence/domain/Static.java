package dk.sfs.riskengine.persistence.domain;

import org.apache.ibatis.session.SqlSession;

import dk.sfs.riskengine.persistence.mapper.DBSessionFactory;
import dk.sfs.riskengine.persistence.mapper.StaticMapper;

public class Static {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column static_info_memory.mmsi
     *
     * @mbggenerated Fri Jan 06 13:36:21 CET 2012
     */
    private Integer mmsi;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column static_info_memory.LENGTH
     *
     * @mbggenerated Fri Jan 06 13:36:21 CET 2012
     */
    private Double length;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column static_info_memory.actual_draught
     *
     * @mbggenerated Fri Jan 06 13:36:21 CET 2012
     */
    private Double actualDraught;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column static_info_memory.mmsi
     *
     * @return the value of static_info_memory.mmsi
     *
     * @mbggenerated Fri Jan 06 13:36:21 CET 2012
     */
    public Integer getMmsi() {
        return mmsi;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column static_info_memory.mmsi
     *
     * @param mmsi the value for static_info_memory.mmsi
     *
     * @mbggenerated Fri Jan 06 13:36:21 CET 2012
     */
    public void setMmsi(Integer mmsi) {
        this.mmsi = mmsi;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column static_info_memory.LENGTH
     *
     * @return the value of static_info_memory.LENGTH
     *
     * @mbggenerated Fri Jan 06 13:36:21 CET 2012
     */
    public Double getLength() {
        return length;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column static_info_memory.LENGTH
     *
     * @param length the value for static_info_memory.LENGTH
     *
     * @mbggenerated Fri Jan 06 13:36:21 CET 2012
     */
    public void setLength(Double length) {
        this.length = length;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column static_info_memory.actual_draught
     *
     * @return the value of static_info_memory.actual_draught
     *
     * @mbggenerated Fri Jan 06 13:36:21 CET 2012
     */
    public Double getActualDraught() {
        return actualDraught;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column static_info_memory.actual_draught
     *
     * @param actualDraught the value for static_info_memory.actual_draught
     *
     * @mbggenerated Fri Jan 06 13:36:21 CET 2012
     */
    public void setActualDraught(Double actualDraught) {
        this.actualDraught = actualDraught;
    }
    
    public static Static selectByMmsi(int mmsi) {

		SqlSession sess = DBSessionFactory.getSession();

		try {
			StaticMapper mapper = sess.getMapper(StaticMapper.class);
			;
			return mapper.selectByMmsi(mmsi);
		} finally {
			sess.close();
		}

	}
}