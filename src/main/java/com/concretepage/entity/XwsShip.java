package com.concretepage.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * XwsShip generated by hbm2java
 */
@Entity
@Table(name = "xws_ship", catalog = "xwing", uniqueConstraints = @UniqueConstraint(columnNames = "xws"))
public class XwsShip implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer idxwsShip;
	private String name;
	private Integer attack;
	private Integer agility;
	private Integer hull;
	private Integer shields;
	private String maneuvers;
	private int idjssize;
	private String xws;
	private int xwsId;

	public XwsShip() {
	}

	public XwsShip(String name, int idjssize, String xws, int xwsId) {
		this.name = name;
		this.idjssize = idjssize;
		this.xws = xws;
		this.xwsId = xwsId;
	}

	public XwsShip(String name, Integer attack, Integer agility, Integer hull, Integer shields, String maneuvers,
			int idjssize, String xws, int xwsId) {
		this.name = name;
		this.attack = attack;
		this.agility = agility;
		this.hull = hull;
		this.shields = shields;
		this.maneuvers = maneuvers;
		this.idjssize = idjssize;
		this.xws = xws;
		this.xwsId = xwsId;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idxws_ship", unique = true, nullable = false)
	public Integer getIdxwsShip() {
		return this.idxwsShip;
	}

	public void setIdxwsShip(Integer idxwsShip) {
		this.idxwsShip = idxwsShip;
	}

	@Column(name = "name", nullable = false, length = 90)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "attack")
	public Integer getAttack() {
		return this.attack;
	}

	public void setAttack(Integer attack) {
		this.attack = attack;
	}

	@Column(name = "agility")
	public Integer getAgility() {
		return this.agility;
	}

	public void setAgility(Integer agility) {
		this.agility = agility;
	}

	@Column(name = "hull")
	public Integer getHull() {
		return this.hull;
	}

	public void setHull(Integer hull) {
		this.hull = hull;
	}

	@Column(name = "shields")
	public Integer getShields() {
		return this.shields;
	}

	public void setShields(Integer shields) {
		this.shields = shields;
	}

	@Column(name = "maneuvers", length = 65535)
	public String getManeuvers() {
		return this.maneuvers;
	}

	public void setManeuvers(String maneuvers) {
		this.maneuvers = maneuvers;
	}

	@Column(name = "idjssize", nullable = false)
	public int getIdjssize() {
		return this.idjssize;
	}

	public void setIdjssize(int idjssize) {
		this.idjssize = idjssize;
	}

	@Column(name = "xws", unique = true, nullable = false, length = 90)
	public String getXws() {
		return this.xws;
	}

	public void setXws(String xws) {
		this.xws = xws;
	}

	@Column(name = "xws_id", nullable = false)
	public int getXwsId() {
		return this.xwsId;
	}

	public void setXwsId(int xwsId) {
		this.xwsId = xwsId;
	}

}
