package dk.sfs.riskengine.persistence.domain;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import dk.sfs.riskengine.consequence.Consequence;
import dk.sfs.riskengine.consequence.Ship.ShipType;
import dk.sfs.riskengine.index.IncidentType.AccidentType;
import dk.sfs.riskengine.persistence.domain.Vessel.ShipTypeIwrap;
import dk.sfs.riskengine.persistence.mapper.DBSessionFactory;
import dk.sfs.riskengine.persistence.mapper.RiskIndexesMapper;
import dk.sfs.riskengine.persistence.mapper.VesselMapper;

public class RiskIndexes {
	private Integer id;

	private Integer mmsi;
	private Double collision;
	
	
	private Double fireExplRisk;
	private Double founderingRisk;
	private Double hullFailureRisk;
	private Double machineryFailureRisk;
	private Double driftGroundingRisk;
	private Double poweredGroundingRisk;
	
	
	private Date dateTimeCreated;

	private Vessel staticInfo = new Vessel();
	
	private Long cpaTargetMmsi;
	private Double cpaTime;
	private Double cpaDist;
	private Double sog;
	private Double cog;
	
	private double lat;
	private double lon;
	
	private Double cpaSog;
	private Double cpaCog;
	
	private double cpaLat;
	private double cpaLon;

	
	public static List<RiskIndexes> selectLatest() {
		SqlSession sess = DBSessionFactory.getSession();
		try {
			return sess.getMapper(RiskIndexesMapper.class).selectLatest();
		} finally {
			sess.close();
		}
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getMmsi() {
		return mmsi;
	}

	public void setMmsi(Integer mmsi) {
		this.mmsi = mmsi;
	}

	public Double getCollision() {
		return collision;
	}

	public void setCollision(Double collision) {
		this.collision = collision;
	}

	public Double getFireExplRisk() {
		return fireExplRisk;
	}

	public void setFireExplRisk(Double fireExplosion) {
		this.fireExplRisk = fireExplosion;
	}

	public Double getFounderingRisk() {
		return founderingRisk;
	}

	public void setFounderingRisk(Double foundering) {
		this.founderingRisk = foundering;
	}

	public Double getHullFailureRisk() {
		return hullFailureRisk;
	}

	public void setHullFailureRisk(Double hullFailure) {
		this.hullFailureRisk = hullFailure;
	}

	public Double getMachineryFailureRisk() {
		return machineryFailureRisk;
	}

	public void setMachineryFailureRisk(Double machineryFailure) {
		this.machineryFailureRisk = machineryFailure;
	}

	public Double getDriftGroundingRisk() {
		return driftGroundingRisk;
	}

	public void setDriftGroundingRisk(Double strandedByMachineFailure) {
		this.driftGroundingRisk = strandedByMachineFailure;
	}

	public Double getPoweredGroundingRisk() {
		return poweredGroundingRisk;
	}

	public void setPoweredGroundingRisk(Double strandedByNavigationError) {
		this.poweredGroundingRisk = strandedByNavigationError;
	}

	

	public Date getDateTimeCreated() {
		return dateTimeCreated;
	}

	public void setDateTimeCreated(Date dateTimeCreated) {
		this.dateTimeCreated = dateTimeCreated;
	}

	
	public void save(){
		SqlSession sess = DBSessionFactory.getSession();
		try{
			sess.getMapper(RiskIndexesMapper.class).insert(this);
		}finally{
			sess.close();
		}
	}

	public ShipTypeIwrap getShipType() {
		return staticInfo.getShipTypeIwrap();
	}

	public void setShipType(ShipTypeIwrap shipType) {
		staticInfo.setShipTypeIwrap(shipType);
	}

	public Double getLength() {
		return staticInfo.getLength();
	}

	public void setLength(Double length) {
		staticInfo.setLength(length);
	}

	public Double getDraught() {
		return staticInfo.getDraught();
	}

	public void setDraught(Double draught) {
		staticInfo.setDraught(draught);
	}

	public Integer getYearOfBuild() {
		return staticInfo.getYearOfBuild();
	}

	public void setYearOfBuild(Integer yearOfBuild) {
		staticInfo.setYearOfBuild(yearOfBuild);
	}

	public String getFlag() {
		return staticInfo.getFlag();
	}

	public void setFlag(String flag) {
		staticInfo.setFlag(flag);
	}

	public void setStaticInfo(Vessel staticInfo) {
		this.staticInfo = staticInfo;
	}

	public String getNameOfShip() {
		return staticInfo.getNameOfShip();
	}

	public void setNameOfShip(String nameOfShip) {
		staticInfo.setNameOfShip(nameOfShip);
	}

	
	public Long getCpaTargetMmsi() {
		return cpaTargetMmsi;
	}

	public void setCpaTargetMmsi(Long cpaTargetMmsi) {
		this.cpaTargetMmsi = cpaTargetMmsi;
	}

	public Double getCpaTime() {
		return cpaTime;
	}

	public void setCpaTime(Double cpaTime) {
		this.cpaTime = cpaTime;
	}

	public Double getSog() {
		return sog;
	}

	public void setSog(Double sog) {
		this.sog = sog;
	}

	public Double getCog() {
		return cog;
	}

	public void setCog(Double cog) {
		this.cog = cog;
	}

	public Double getCpaDist() {
		return cpaDist;
	}

	public void setCpaDist(Double cpaDist) {
		this.cpaDist = cpaDist;
	}

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getLon() {
		return lon;
	}

	public void setLon(double lon) {
		this.lon = lon;
	}

	
	public Double getCpaSog() {
		return cpaSog;
	}

	public void setCpaSog(Double cpaSog) {
		this.cpaSog = cpaSog;
	}

	public Double getCpaCog() {
		return cpaCog;
	}

	public void setCpaCog(Double cpaCog) {
		this.cpaCog = cpaCog;
	}

	public double getCpaLat() {
		return cpaLat;
	}

	public void setCpaLat(double cpaLat) {
		this.cpaLat = cpaLat;
	}

	public double getCpaLon() {
		return cpaLon;
	}

	public void setCpaLon(double cpaLon) {
		this.cpaLon = cpaLon;
	}
	
	
}